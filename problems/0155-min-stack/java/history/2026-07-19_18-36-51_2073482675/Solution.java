class MinStack {
    Stack<Pair> st;

    public class Pair{
        int val;
        int m;

        Pair(int val, int m){
            this.val = val;
            this.m = m;
        }
    }
    public MinStack() {
        st = new Stack<>();
    }

    public void push(int value) {
        if(st.isEmpty()) st.push(new Pair(value, value));
        else st.push(new Pair(value, Math.min(value, st.peek().m)));
    }

    public void pop() {
        if(!st.isEmpty()) st.pop();
    }

    public int top() {
        Pair p = st.peek();
        return p.val;
    }
    
    public int getMin() {
        Pair p = st.peek();
        return p.m;
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