class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length(), length = 0, i = 1;
        int[] lps = new int[n];
        while(i < n){
            if(s.charAt(i) == s.charAt(length)){
                length++;
                lps[i] = length;
                i++;
            }
            else{
                if(length != 0) length = lps[length - 1];
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        int pattern = n - lps[n-1];
        return lps[n-1] > 0 && n % pattern == 0;
    }
}