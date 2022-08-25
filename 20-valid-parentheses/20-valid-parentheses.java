class Solution {
    public boolean isValid(String s) {
        //The basic idea is to put all the right brackets corresponding to left bracket into the stack and if we encounter a right bracket then we check the stack if it is empty? then it is invalid and also we have to check if the topmost element of the stack matches the current elememt in the string. If it does not then it is invalid expression.
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(')');
            }
           else if(c == '{'){
               st.push('}');
           }
            else if(c == '['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop() != c){
                return false;
            }
        }
        return st.isEmpty();
    }
}