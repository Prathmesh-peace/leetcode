class Solution {
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    public long gcdSum(int[] nums) {
        int max = 0; long sum = 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            nums[i] = gcd(max, nums[i]);
        }
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        while(i < j){
            sum += gcd(nums[i], nums[j]);
            i++;
            j--;
        }
        return sum;
    }
}