class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest = 0, count = 1, LastSmaller = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == LastSmaller) continue;
            if(nums[i] == LastSmaller + 1) count++;
            else count = 1;
            longest = Math.max(longest, count);
            LastSmaller = nums[i];
        }
        return longest;
    }
}