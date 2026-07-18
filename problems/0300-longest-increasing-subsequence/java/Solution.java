class Solution {
    public void bs(int i, int j, int target, List<Integer> ans){
        while(i < j){
            int mid = i + (j - i)/2;
            if(ans.get(mid) >= target) j = mid;
            else i = mid + 1;
        }
        ans.set(j, target);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        for(int i = 1; i < n; i++){
            if(ans.get(ans.size() - 1) < nums[i]) ans.add(nums[i]);
            else bs(0, ans.size()-1, nums[i], ans);
        }
        return ans.size();
    }
}