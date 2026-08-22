class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, product = 1, x = n;
        while(x != 0){
            sum += (x % 10);
            product *= (x % 10);
            x = x / 10;
        }
        int totalsum = sum + product;
        if(n % totalsum == 0) return true;
        else return false;
    }
}