class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] s = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(String t : words){
            for(int i = 0; i < t.length(); i++){
                char c = t.charAt(i);
                sb.append(s[c-'a']);
            }
            set.add(sb.toString());
            sb.setLength(0);
        }
        return set.size();
    }
}