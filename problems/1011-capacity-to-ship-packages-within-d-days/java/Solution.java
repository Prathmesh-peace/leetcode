class Solution {
    public int days(int i, int[] w){
        int d = 1, sum = 0;
        for(int weight : w){
            if(sum + weight > i){
                d++;
                sum = 0;
            }
            sum += weight;
        }
        return d;
    }
    public int shipWithinDays(int[] w, int d) {
        int sum = 0, max = 0;
        for(int ele : w) {
            max = Math.max(max, ele);
            sum += ele;
        }
        int i = max, j = sum;
        while(i <= j){
            int m = i + (j-i)/2;
            if(days(m, w) <= d) j = m-1;
            else i = m+1;
        }
        return i;
    }
}