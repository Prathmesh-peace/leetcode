class Solution {
    public int[] canSeePersonsCount(int[] h) {
        int n = h.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && h[i] >= st.peek()){
                ans[i] += 1;
                st.pop();
            }
            if(!st.isEmpty()) ans[i] += 1;
            st.push(h[i]);
        }
        return ans;
    }
}