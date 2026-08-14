class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0;
        while(j < s.length()){
            char c = s.charAt(j);
            if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
            while(i < s.length() && map.get(c) > 2){
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}