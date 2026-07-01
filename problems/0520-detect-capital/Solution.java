class Solution {
    public boolean detectCapitalUse(String s) {
        int n = s.length();
        if(s.equals(s.toLowerCase())) return true;
        String t = s.substring(1,n);
        if(s.charAt(0) == Character.toUpperCase(s.charAt(0))){
            if(t.equals(t.toUpperCase()) || t.equals(t.toLowerCase())) return true;
        }
        return false;
    }
}