class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)) map.put(ele, map.get(ele) + 1);
            else map.put(ele, 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > n/2) return key;
        }
        return 0;
    }
}