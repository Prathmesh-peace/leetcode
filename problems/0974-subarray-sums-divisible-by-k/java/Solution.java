class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i < nums.length; i++) nums[i] += nums[i-1];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % k == 0) count++;
            int rem = ((nums[i] % k) + k) % k;
            if(map.containsKey(rem)) {
                count += map.get(rem);
                map.put(rem, map.get(rem) + 1);
            }
            else map.put(rem, 1);
        }
        return count;
    }
}