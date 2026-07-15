class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n, sumEven = n * (n+1);
        while(sumEven != 0){
            int temp = sumEven;
            sumEven = sumOdd % sumEven;
            sumOdd = temp;
        }
        return Math.abs(sumOdd);
    }
}