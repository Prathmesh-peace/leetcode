class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int n = s.length(), i = n-1, j = n-1;
        while(i >= 0){
            while(i >= 0 && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i+1, j+1));
            sb.append(' ');
            while(i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}