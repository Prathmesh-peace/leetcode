class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0, i = 0, max = 0;
        List<Integer> arr = new ArrayList<>();
        while(i < s.length()){
            if(s.charAt(i) == '0'){
                int st = i;
                while(i < s.length() && s.charAt(i) != '1') i++;
                arr.add(i - st);
            }
            else{
                ones++;
                i++;
            }
        }
        for(int j = 1; j < arr.size(); j++){
            max = Math.max(max, arr.get(j) + arr.get(j-1));
        }
        return max + ones;
    }
}