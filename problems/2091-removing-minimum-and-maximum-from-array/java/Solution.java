class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx = -1, maxIdx = -1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIdx = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minIdx = i;
            }
        }
        int a = Math.min(minIdx, maxIdx), b = Math.max(minIdx, maxIdx), n = nums.length;
        int left = b + 1, right = n - a, both = (a + 1) + (n - b);
        return Math.min(left, Math.min(right, both));
    }
}
