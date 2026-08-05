class Solution {
    public int characterReplacement(String s, int k) {
        int[] frq = new int[26];
        int max = 0, i = 0, j = 0, len = 0;
        while(j < s.length()){
            frq[s.charAt(j) - 'A']++;
            max = Math.max(max, frq[s.charAt(j) - 'A']);
            while(j-i+1 - max > k){
                frq[s.charAt(i) - 'A']--;
                i++;
            }
            len = Math.max(len, j-i+1);
            j++;
        }
        return len;
    }
}