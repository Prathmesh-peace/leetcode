class Solution {
    public int numberOfSpecialChars(String s) {
        int count = 0;
        int[] lower = new int[26];
        int[] upper = new int[26];
        Arrays.fill(lower, -1);
        Arrays.fill(upper, -1);
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c > 96) lower[c - 'a'] = i;
            else if(upper[c - 'A'] == -1) upper[c - 'A'] = i;
        }
        for(int i = 0; i < 26; i++){
            if(lower[i] != -1 && lower[i] < upper[i]) count++;
        }
        return count;
    }
}