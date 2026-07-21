class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans = new int[t.length];
        Stack<Integer> st = new Stack<>();
        for(int i = t.length - 1; i >= 0; i--){
            while(!st.isEmpty() && t[i] >= t[st.peek()]) st.pop();
            ans[i] = (st.isEmpty()) ? 0 : st.peek()-i;
            st.push(i);
        }
        return ans;
    }
}