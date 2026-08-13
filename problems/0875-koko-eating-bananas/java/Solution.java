class Solution {
    public long hours(int i, int[] piles){
        long sum = 0;
        for(int ele : piles) sum += (ele % i == 0) ? ele/i : ele/i + 1;
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int ele : piles) max = Math.max(max, ele);
        int i = 1, j = max;
        while(i <= j){
            int m = i + (j-i)/2;
            if(hours(m, piles) <= h) j = m-1;
            else i = m+1;
        }
        return i;
    }
}