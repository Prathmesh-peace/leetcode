class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && nums2[i] > st.peek()) st.pop();
            map.put(nums2[i], (st.isEmpty()) ? -1: st.peek());
            st.push(nums2[i]);
        }
        int[] ans = new int[m];
        for(int i = 0; i < m; i++) ans[i] = map.get(nums1[i]);
        return ans;
    }
}