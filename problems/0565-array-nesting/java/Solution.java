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
    public int arrayNesting(int[] nums) {
        int n = nums.length;
        int[] parent = new int[n];
        int[] size = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
            size[i] = 1;
        }
        for(int i = 0; i < n; i++) union(i, nums[i], parent, size);
        int max = 0;
        for(int i = 0; i < n; i++) max = Math.max(max, size[i]);
        return max;
    }
}