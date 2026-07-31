class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0, i = 0, j = 0, n = s.length();
        if(n <= 1) return n;
        Map<Character, Integer> map = new HashMap<>();
        while(j < n){
            char c = s.charAt(j);
            if(map.containsKey(c) && map.get(c) >= i){
                maxlen = Math.max(maxlen, j-i);
                while(s.charAt(i) != c) i++;
                i++;
            }
            map.put(c, j);
            j++;
        }
        maxlen = Math.max(maxlen, j-i);
        return maxlen;
    }
}