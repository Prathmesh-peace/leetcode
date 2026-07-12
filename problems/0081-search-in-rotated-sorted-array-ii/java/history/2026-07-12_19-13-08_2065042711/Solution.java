class Solution {
    public boolean search(int[] nums, int x) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x) return true;
        }
        return false;
    }
}