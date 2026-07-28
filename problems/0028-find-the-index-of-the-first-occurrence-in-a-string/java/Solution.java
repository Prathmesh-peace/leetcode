class Solution {
    public int strStr(String haystack, String needle) {
        // knuth-morris-pratt (KMP) algorithm
        int m = haystack.length(), n = needle.length();
        int[] lps = new int[n]; // for longest prefix-suffix
        int length = 0, i = 1, j = 0;
        while(i < n){
            if(needle.charAt(i) == needle.charAt(length)){
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
        i = 0;
        while(i < m && j < n){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j != 0) j = lps[j-1];
                else i++;
            }
        }
        return (j == n) ? i-j : -1;
    }
}