class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        int i = 0, n = 0;
        String t = "";
        while(i < s.length()) {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9') n = n*10 + c-'0';
            else if(c == '['){
                num.push(n);
                n = 0;
                str.push(t);
                t = "";
            }
            else if(c == ']'){
                int times = num.pop();
                String temp = str.pop();
                for(int j = 0; j < times; j++) temp += t;
                t = temp;
            }
            else t += c;
            i++;
        }
        return t;
    }
}