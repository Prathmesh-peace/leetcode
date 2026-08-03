class Solution {
    public int solve(int i, int j, int[] nums, int[][] dp){
        if(i > j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int pick_i = nums[i] + Math.min(solve(i+2, j, nums, dp), solve(i+1, j-1, nums, dp));
        int pick_j = nums[j] + Math.min(solve(i+1, j-1, nums, dp), solve(i, j-2, nums, dp));
        return dp[i][j] = Math.max(pick_i, pick_j);
    }
    public boolean predictTheWinner(int[] nums) {
        // game strategy - when its your turn, do your best
        // when its opponents turn, expect the worst
        int n = nums.length, sum = 0;
        for(int i = 0; i < n; i++) sum += nums[i];
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
        int score = solve(0, n-1, nums, dp);
        return score >= sum - score;
    }
}