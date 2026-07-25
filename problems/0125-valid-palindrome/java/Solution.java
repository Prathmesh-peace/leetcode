class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int k = 0; k < s.length(); k++){
            char ch = s.charAt(k);
            int c = (int) ch;
            if((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)){
                if(c >= 65 && c <= 90) sb.append(Character.toLowerCase(ch));
                else sb.append(ch);
            }
        }
        int i = 0, j = sb.length() - 1;
        while(i < j){
            if(sb.charAt(i) != sb.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}