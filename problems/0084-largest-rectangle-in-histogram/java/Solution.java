class Solution {
    public int largestRectangleArea(int[] h) {
        int area = 0, n = h.length;
        int[] prev = new int[n];
        int[] next = new int[n];
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(!st1.isEmpty() && h[i] <= h[st1.peek()]) st1.pop();
            next[i] = (st1.isEmpty()) ? n : st1.peek();
            st1.push(i);
        }
        for(int i = 0; i < n; i++){
            while(!st2.isEmpty() && h[i] <= h[st2.peek()]) st2.pop();
            prev[i] = (st2.isEmpty()) ? -1 : st2.peek();
            st2.push(i);
        }
        for(int i = 0; i < n; i++){
            area = Math.max(h[i] * (next[i] - prev[i] - 1), area);
        }
        return area;
    }
}