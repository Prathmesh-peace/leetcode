class Solution {
    public boolean kmp(int i, int j, String a, String b, int[] lps){
        int m = a.length(), n = b.length();
        while(i < m && j < n){
            if(a.charAt(i) == b.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j != 0) j = lps[j-1];
                else i++;
            }
        }
        return j == n;
    }
    public int repeatedStringMatch(String a, String b) {
        int count = 1, length = 0, i = 1;
        int[] lps = new int[b.length()];
        while(i < b.length()){
            if(b.charAt(i) == b.charAt(length)){
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
        String original = a;
        while(b.length() > a.length()){
            a += original;
            count++;
        }
        boolean flag = kmp(0, 0, a, b, lps);
        if(flag) return count;
        else{
            a += original;
            flag = kmp(0, 0, a, b, lps);
        }
        return (flag) ? count+1 : -1;
    }
}