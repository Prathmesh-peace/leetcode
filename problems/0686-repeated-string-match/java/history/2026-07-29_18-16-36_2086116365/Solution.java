class Solution {
    public int repeatedStringMatch(String a, String b) {
        String original = a;
        int count = 1;
        while(b.length() > a.length()){
            a += original;
            count++;
        }
        if(a.contains(b)) return count;
        a += original;
        return (a.contains(b)) ? count+1 : -1;
    }
}