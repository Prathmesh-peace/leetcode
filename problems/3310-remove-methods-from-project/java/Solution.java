class Solution {
    public void dfs(int i, boolean[] visited, List<List<Integer>> adj){
        visited[i] = true;
        for(int ele : adj.get(i)){
            if(!visited[ele]) dfs(ele, visited, adj);
        }
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invoc) {
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for(int i = 0; i < invoc.length; i++){
            int u = invoc[i][0], v = invoc[i][1];
            adj.get(u).add(v);
        }
        dfs(k, visited, adj);
        for(int i = 0; i < invoc.length; i++){
            if(!visited[invoc[i][0]] && visited[invoc[i][1]]){
                List<Integer> ans = new ArrayList<>();
                for(int j = 0; j < n; j++) ans.add(j);
                return ans;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) if(!visited[i]) ans.add(i);
        return ans;
    }
}