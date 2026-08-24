class Solution {
    public int evalRPN(String[] tokens) {
        List<Integer> ans = new ArrayList<>();
        for(String s : tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                ans.add(Integer.parseInt(s));
            }
            else{
                int v2 = ans.remove(ans.size()-1), v1 = ans.remove(ans.size()-1);
                if(s.equals("+")) ans.add(v1+v2);
                if(s.equals("-")) ans.add(v1-v2);
                if(s.equals("*")) ans.add(v1*v2);
                if(s.equals("/")) ans.add(v1/v2);
            }
        }
        return ans.get(ans.size()-1);
    }
}