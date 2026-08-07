class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        if(nums[0] == 0) nums[0] = -1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == 0) nums[i] = -1;
            nums[i] += nums[i-1];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) max = Math.max(max, i+1);
            if(map.containsKey(nums[i])) max = Math.max(max, i - map.get(nums[i]));
            else map.put(nums[i], i);
        }
        return max;
    }
}