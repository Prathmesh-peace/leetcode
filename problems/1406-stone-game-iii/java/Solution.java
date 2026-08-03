class Solution {
    public int solve(int i, int[] nums, int[] dp){
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int score = nums[i] - solve(i+1, nums, dp);
        if(i+1 < nums.length){
            score = Math.max(score, nums[i] + nums[i+1] - solve(i+2, nums, dp));
        }
        if(i+2 < nums.length){
            score = Math.max(score, nums[i] + nums[i+1] + nums[i+2] - solve(i+3, nums, dp));
        }
        return dp[i] = score;
    }
    public String stoneGameIII(int[] nums) {
        // we will find alice - bob
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int diff = solve(0, nums, dp);
        if(diff > 0) return "Alice";
        return (diff < 0) ? "Bob" : "Tie";
    }
}