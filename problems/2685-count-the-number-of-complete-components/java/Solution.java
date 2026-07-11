class Solution {
    static int count;
    public void bfs(int i, List<List<Integer>> adj, boolean[] visited){
        visited[i] = true;
        int edges = 0, m = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front = q.remove();
            m++;
            for(int ele : adj.get(front)){
                edges++;
                if(!visited[ele]){
                    visited[ele] = true;
                    q.add(ele);
                }
            }
        }
        edges /= 2;
        if(edges == m*(m-1)/ 2) count++;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        count = 0;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for(int i = 0; i < edges.length; i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]) bfs(i, adj, visited);
        }
        return count;
    }
}