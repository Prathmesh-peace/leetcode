class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        for(int i = 0; i < n; i++){
            dp1[i] = 1;
            for(int j = i-1; j >= 0; j--){
                if(nums[j] < nums[i]) dp1[i] = Math.max(dp1[i], 1 + dp1[j]);
            }
        }
        for(int i = n-1; i >= 0; i--){
            dp2[i] = 1;
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[i]) dp2[i] = Math.max(dp2[i], 1 + dp2[j]);
            }
        }
        int maxlen = 0;
        for(int i = 0; i < n; i++){
            if(dp1[i] > 1 && dp2[i] > 1){
                int len = dp1[i] + dp2[i] - 1;
                maxlen = Math.max(maxlen, len);
            }
        }
        return (maxlen >= 3) ? n - maxlen : 0;
    }
}