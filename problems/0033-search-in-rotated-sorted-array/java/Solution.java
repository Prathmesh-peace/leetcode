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
        int pivot = -1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]) {
                pivot = i;
                break;
            }
        }
        int a = bs(0, pivot, target, nums);
        int b = bs(pivot+1, nums.length-1, target, nums);
        return (a == -1 && b == -1) ? -1 : Math.max(a,b);
    }
}