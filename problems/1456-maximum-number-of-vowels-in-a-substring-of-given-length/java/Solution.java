class Solution {
    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int count = 0, i = 1, j = k, max = 0;
        for(int x = 0; x < k; x++) if(isVowel(s.charAt(x))) count++;
        max = count;
        while(j < s.length()){
            char c = s.charAt(i-1), d = s.charAt(j);
            if(isVowel(c)) count--;
            if(isVowel(d)) count++;
            max = Math.max(max, count);
            i++; j++;
        }
        return max;
    }
}