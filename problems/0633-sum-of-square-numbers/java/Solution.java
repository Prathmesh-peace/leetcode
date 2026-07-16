class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int) Math.sqrt(c), i = 0, j = n;
        while(i <= j){
            long sum = 1L*i*i + 1L*j*j;
            if(sum == c) return true;
            if(sum > c) j--;
            else i++;
        }
        return false;
    }
}