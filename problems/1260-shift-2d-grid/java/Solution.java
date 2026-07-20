class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int t) {
        int m = grid.length, n = grid[0].length;
        for(int k = 0; k < t; k++){
            int[] arr = new int[m];
            arr[0] = grid[m-1][n-1];
            for(int i = 0; i < m-1; i++) arr[i+1] = grid[i][n-1];
            for(int a = 0; a < m; a++){
                for(int j = n-2; j >= 0; j--) grid[a][j+1] = grid[a][j];
            }
            for(int b = 0; b < m; b++) grid[b][0] = arr[b];
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < m; i++){
            List<Integer> ans2 = new ArrayList<>();
            for(int j = 0; j < n; j++) ans2.add(grid[i][j]);
            ans.add(ans2);
        }
        return ans;
    }
}