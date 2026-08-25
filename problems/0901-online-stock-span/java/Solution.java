class StockSpanner {
    public class Pair{
        int p;
        int s;

        Pair(int p, int s){
            this.p = p;
            this.s = s;
        }
    }
    Stack<Pair> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!st.isEmpty() && price >= st.peek().p) span += st.pop().s;
        st.push(new Pair(price, span));
        return st.peek().s;
    }
}
