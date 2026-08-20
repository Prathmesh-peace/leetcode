class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        for(int i = 3; i <= nums.length; i++){
            if(a.get(a.size()-1) > b.get(b.size()-1)) a.add(nums[i-1]);
            else b.add(nums[i-1]);
        }
        int i = 0;
        for(int ele : a){
            nums[i] = ele;
            i++;
        }
        for(int ele : b){
            nums[i] = ele;
            i++;
        }
        return nums;
    }
}