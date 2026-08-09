class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length-1;
        while(i < j){
            while(i < j && nums[i] == nums[i+1]) i++;
            while(i < j && nums[j] == nums[j-1]) j--;
            int mid = i + (j-i)/2;
            if(nums[mid] > nums[j]) i = mid + 1;
            else j = mid;
        }
        return nums[j];
    }
}