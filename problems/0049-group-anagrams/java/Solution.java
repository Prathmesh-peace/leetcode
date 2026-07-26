class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < s.length; i++){
            char[] c = s[i].toCharArray();
            Arrays.sort(c);
            String t = new String(c);
            if(!map.containsKey(t)) map.put(t, new ArrayList<>());
            map.get(t).add(s[i]);
        }
        for(String t : map.keySet()) ans.add(map.get(t));
        return ans;
    }
}