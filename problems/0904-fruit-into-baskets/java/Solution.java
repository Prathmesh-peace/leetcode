class Solution {
    public int totalFruit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length, i = 0, j = 0, len = 0;
        while(j < n){
            if(map.containsKey(nums[j])) map.put(nums[j], map.get(nums[j]) + 1);
            else map.put(nums[j], 1);
            if(map.size() > 2){
                if(map.get(nums[i]) == 1) map.remove(nums[i]);
                else map.put(nums[i], map.get(nums[i]) - 1);
                i++;
            }
            len = Math.max(len, j-i+1);
            j++;
        }
        return len;
    }
}