class Solution {
    public int split(int m, int[] nums){
        int count = 1, sum = 0;
        for(int ele : nums){
            if(sum + ele > m){
                count++;
                sum = 0;
            }
            sum += ele;
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int i = 0, j = 0;
        for(int ele : nums){
            i = Math.max(i, ele);
            j += ele;
        }
        while(i <= j){
            int m = i + (j-i)/2;
            if(split(m, nums) <= k) j = m-1;
            else i = m+1;
        }
        return i;
    }
}