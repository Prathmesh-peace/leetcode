class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        int rank = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int key : set){
            map.put(key, rank++);
        }
        int[] ans = new int[arr.length];
        for(int i = 0; i < ans.length; i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}