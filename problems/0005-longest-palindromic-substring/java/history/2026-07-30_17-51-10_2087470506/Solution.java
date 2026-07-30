class Solution {
    public boolean palindrome(int i, int j, String s){
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int x = 0, y = 0, len = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(palindrome(i, j, s)){
                    if(j-i+1 > len){
                        len = j-i+1;
                        x = i;
                        y = j;
                    }
                }
            }
        }
        return s.substring(x, y+1);
    }
}