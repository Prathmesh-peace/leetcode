class Solution {
    static int x, y;
    public void expand(int i, int j, String s){
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        if(j-i-1 > y-x+1){  
            x = i+1;
            y = j-1;
        }
    }
    public String longestPalindrome(String s) {
        x = 0; y = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            expand(i, i, s); // expand from center for odd length
            expand(i, i+1, s); // expand from center for even length
        }
        return s.substring(x, y+1);
    }
}