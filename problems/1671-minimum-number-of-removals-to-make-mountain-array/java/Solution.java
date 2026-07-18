class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length, max = 0;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, 1);
        Arrays.fill(dp2, 1);
        for(int i = 1; i < n; i++){
            for(int j = i-1; j >= 0; j--){
                if(nums[j] < nums[i]) dp1[i] = Math.max(dp1[i], 1 + dp1[j]);
            }
        }
        for(int i = n-2; i >= 0; i--){
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[i]) dp2[i] = Math.max(dp2[i], 1 + dp2[j]);
            }
        }
        for(int i = 0; i < n; i++) {
            if(dp1[i] > 1 && dp2[i] > 1){  
                max = Math.max(max, dp1[i] + dp2[i] - 1);
            }
        }
        return (n >= 3) ? n - max : 0;
    }
}