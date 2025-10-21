class Solution {
    public boolean isValid(String s) {
        if(s.length() %2 != 0){
            return false;
        }
        Stack<Character> st = new Stack();
        //top of the stack should match the char we are comparing
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(')');
            }
            else if(c == '{'){
                st.push('}');
            }
            else if( c == '['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop() != c){
                return false;
            }
        }
        return true;
    }
}