class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length(), i = 0, j = k-1;
        if(k > s2.length()) return false;
        int[] frq1 = new int[26];
        int[] frq2 = new int[26];
        for(int x = 0; x < s1.length(); x++) frq1[s1.charAt(x) - 'a']++;
        for(int x = 0; x < k; x++) frq2[s2.charAt(x) - 'a']++;
        while(j < s2.length()-1){
            if(Arrays.equals(frq1, frq2)) return true;
            frq2[s2.charAt(j+1) - 'a']++;
            frq2[s2.charAt(i) - 'a']--;
            i++;
            j++;
        }
        return Arrays.equals(frq1, frq2);
    }
}