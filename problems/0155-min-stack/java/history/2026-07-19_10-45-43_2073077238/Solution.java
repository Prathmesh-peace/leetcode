class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    int min;

    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int value) {
        st.push(value);
        if(minst.isEmpty()) minst.push(value);
        else if(value <= minst.peek()) minst.push(value);
    }
    
    public void pop() {
        if(!st.isEmpty()){
            int x = st.pop();
            if(!minst.isEmpty() && minst.peek() == x) minst.pop(); 
        }
    }
    
    public int top() {
        if(!st.isEmpty()) return st.peek();
        return 0;
    }
    
    public int getMin() {
        if(!minst.isEmpty()) return minst.peek();
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */