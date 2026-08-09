class Solution {
    public int bs(int i, int j, int target, int[] nums){
        while(i <= j){
            int mid = i + (j-i)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) j = mid - 1;
            else i = mid + 1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        while(i < j){
            int mid = i + (j-i)/2;
            if(nums[mid] > nums[j]) i = mid + 1;
            else j = mid;
        }
        int a = bs(0, j-1, target, nums);
        int b = bs(j, nums.length-1, target, nums);
        return (a == -1 && b == -1) ? -1 : Math.max(a,b);
    }
}