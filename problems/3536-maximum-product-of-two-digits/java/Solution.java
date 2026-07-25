class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
        while(n > 0){
            int digit = n % 10;
            if(digit >= max){
                smax = max;
                max = digit;
            }
            else if(digit > smax && digit != max) smax = digit;
            n /= 10;
        }
        return max*smax;
    }
}