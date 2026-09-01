class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] a = new char[128];
        char[] b = new char[128];
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i), y = t.charAt(i);
            int m = (int)x, n = (int)y;
            if(a[m] != '\0' && a[m] != y) return false;
            if(b[n] != '\0' && b[n] != x) return false;
            a[m] = y;
            b[n] = x;
        }
        return true;
    }
}