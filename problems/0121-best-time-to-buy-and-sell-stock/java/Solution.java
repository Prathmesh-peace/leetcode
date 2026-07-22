class Solution {
    public int maxProfit(int[] p) {
        int profit = 0, min = p[0];
        for(int i = 1; i < p.length; i++){
            min = Math.min(min, p[i]);
            profit = Math.max(profit, p[i] - min);
        }
        return profit;
    }
}