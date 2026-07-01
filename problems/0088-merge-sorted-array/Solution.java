class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n != 0){
            if(m == 0){
                for(int i = 0; i < n; i++) nums1[i] = nums2[i];
            }
            else{
                int x = nums1.length;
                for(int i = 0; i < n; i++){
                    nums1[x-n+i] = nums2[i];
                }
                Arrays.sort(nums1);
            }
        }
    }
}