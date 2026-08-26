class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for(int ele : nums) set.add(ele);
        for(int ele : set){
            if(!set.contains(ele-1)){
                int n = ele, count = 0;
                while(set.contains(n)){
                    n++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}