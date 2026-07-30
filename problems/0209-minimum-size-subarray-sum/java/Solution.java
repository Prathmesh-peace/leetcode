class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if(n == 1) return (nums[0] >= target) ? 1 : 0;
        int i = 0, j = 1, sum = nums[0], len = Integer.MAX_VALUE;
        while(i < n){
            if(sum < target){
                if(j == n) break;
                sum += nums[j];
                j++;
            }
            else{
                len = Math.min(len, j-i);
                sum -= nums[i];
                i++;
            }
        }
        while(sum >= target){
            len = Math.min(len, j-i);
            sum -= nums[i];
            i++;
        }
        return (len == Integer.MAX_VALUE) ? 0 : len;
    }
}