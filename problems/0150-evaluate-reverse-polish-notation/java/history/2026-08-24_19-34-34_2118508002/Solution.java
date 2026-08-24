class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                st.push(Integer.parseInt(s));
            }
            else{
                int v2 = st.pop(), v1 = st.pop();
                if(s.equals("+")) st.push(v1+v2);
                if(s.equals("-")) st.push(v1-v2);
                if(s.equals("*")) st.push(v1*v2);
                if(s.equals("/")) st.push(v1/v2);
            }
        }
        return st.peek();
    }
}