class Solution {
    public void reverse(int i, int j, int[] nums){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx = -1, n = nums.length;
        for(int i = n-1; i > 0; i--){
            if(nums[i-1] < nums[i]){
                idx = i-1;
                break;
            }
        }
        if(idx == -1) reverse(0, n-1, nums);
        else{
            int swapidx = 0;
            for(int i = n-1; i > idx; i--){
                if(nums[i] > nums[idx]){
                    swapidx = i;
                    break;
                }
            }
            int temp = nums[idx];
            nums[idx] = nums[swapidx];
            nums[swapidx] = temp;
            reverse(idx+1, n-1, nums);
        }
    }
}