class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (a,b) -> {
            if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        List<int[]> ans = new ArrayList<>();
        ans.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            int[] arr = ans.get(ans.size() - 1);
            if(arr[1] >= nums[i][0]){
                arr[0] = Math.min(arr[0], nums[i][0]);
                arr[1] = Math.max(arr[1], nums[i][1]);
                ans.set(ans.size() - 1, arr);
            }
            else ans.add(nums[i]);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}