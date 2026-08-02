class Solution {
    public boolean stoneGame(int[] piles) {
        int bob = Integer.MAX_VALUE, alice = Integer.MIN_VALUE, i = 0, j = piles.length-1;
        while(i < j){
            int max = Math.max(piles[i], piles[j]);
            int min = Math.min(piles[i], piles[j]);
            alice += max;
            bob += min;
            i++;
            j--;
        }
        
        return alice > bob;
    }
}