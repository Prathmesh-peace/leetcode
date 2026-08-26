class Solution {
    public int leader(int a, int[] parent){
        if(parent[a] == a) return a;
        return parent[a] = leader(parent[a], parent);
    }
    public void union(int x, int y, int[] parent, int[] size){
        x = leader(x,parent);
        y = leader(y,parent);
        if(x != y){
            if(size[x] > size[y]){
                parent[y] = x;
                size[x] += size[y];
            }
            else{
                parent[x] = y;
                size[y] += size[x];
            }
        }
    }
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int x : nums) {
            if(!map.containsKey(x)) map.put(x, idx++);
        }
        int n = map.size();
        int[] parent = new int[n];
        int[] size = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
            size[i] = 1;
        }
        for(int key : map.keySet()){
            if(map.containsKey(key+1)) union(map.get(key), map.get(key+1), parent, size);
        }
        int max = 0;
        for(int ele : size) max = Math.max(max, ele);
        return max;
    }
}