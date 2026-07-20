class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] next = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-2; i >= 0; i--){
            if(nums[i] > nums[n-1]) st.push(nums[i]);
        }
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && nums[i] >= st.peek()) st.pop();
            next[i] = (st.isEmpty()) ? -1 : st.peek();
			st.push(nums[i]);
        }
        return next;
    }
}