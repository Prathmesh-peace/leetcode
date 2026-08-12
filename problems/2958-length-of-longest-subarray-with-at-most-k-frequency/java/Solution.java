class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0;
        while(j < nums.length){
            if(map.containsKey(nums[j])) map.put(nums[j], map.get(nums[j]) + 1);
            else map.put(nums[j], 1);
            if(map.get(nums[j]) > k){
                while(i < nums.length && map.get(nums[j]) > k){
                    map.put(nums[i], map.get(nums[i]) - 1);
                    i++;
                }
            }
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}