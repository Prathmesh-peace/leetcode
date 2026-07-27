class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length(), m = haystack.length(), ans = -1;
        if(m >= n){
            for(int i = 0; i < m-n+1; i++){
                String s = haystack.substring(i, i+n);
                if(s.equals(needle)) return i;
            }
        }
        return -1;
    }
}