class Solution {
    public int search(int[] nums, int x) {
        int n = nums.length, i = 0, j = n-1;
        while(i <= j){
            int mid = i + (j-i)/2;
            if(nums[mid] == x) return mid;
            if(nums[i] <= nums[mid]){
                if(nums[i] <= x && x < nums[mid]) j = mid-1;
                else i = mid + 1;
            }
            else{
                if(nums[mid] < x && x <= nums[j]) i = mid+1;
                else j = mid-1;
            }
            
        }
        return -1;
    }
}