class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int) Math.floor(Math.sqrt(c)), i = 1, j = n;
        if(n*n == c) return true;
        while(i <= j){
            long sum = 1L*i*i + 1L*j*j;
            if(sum == c) return true;
            if(sum > c) j--;
            else i++;
        }
        return false;
    }
}