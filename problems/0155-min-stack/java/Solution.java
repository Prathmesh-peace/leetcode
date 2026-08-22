class MinStack {
    class Pair{
        int ele;
        int min;

        Pair(int ele, int min){
            this.ele = ele;
            this.min = min;
        }
    }
    Stack<Pair> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        if(st.isEmpty()) st.push(new Pair(value, value));
        else st.push(new Pair(value, Math.min(st.peek().min, value)));
    }
    
    public void pop() {
        if(!st.isEmpty()) st.pop();
    }
    
    public int top() {
        Pair p = st.peek();
        return p.ele;
    }
    
    public int getMin() {
        Pair p = st.peek();
        return p.min;
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