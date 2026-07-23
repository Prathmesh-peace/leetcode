class Solution {
    public int[][] insert(int[][] nums, int[] newInt) {
        int n = nums.length, i = 0;
        List<int[]> ans = new ArrayList<>();
        while(i < n && nums[i][1] < newInt[0]){
            ans.add(nums[i]);
            i++;
        }
        while(i < n && newInt[1] >= nums[i][0]){
            newInt[0] = Math.min(newInt[0], nums[i][0]);
            newInt[1] = Math.max(newInt[1], nums[i][1]);
            i++;
        }
        ans.add(newInt);
        while(i < n){
            ans.add(nums[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}