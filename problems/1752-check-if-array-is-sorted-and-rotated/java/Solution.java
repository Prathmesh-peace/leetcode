class Solution {
    public boolean check(int[] nums) {
        int n = nums.length, i = 1;
        while(i < n && nums[i] >= nums[i-1]) i++;
        if(i == n) return true;
        while(i < n-1){
            if(nums[i] > nums[i+1]) return false;
            i++;
        }
        return nums[0] >= nums[n-1];
    }
}