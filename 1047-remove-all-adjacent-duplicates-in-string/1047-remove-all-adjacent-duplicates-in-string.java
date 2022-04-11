class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            
            if(st.isEmpty()){
                st.push(c);
            }
            else if(st.peek() == c){
                st.pop();
            }
            else if(st.peek() != c && !st.isEmpty()){
                st.push(c);
            }
           
            
        }
        String ans ="";
        while(!st.isEmpty()){
            //char cc = st.pop();
            ans = st.pop()+ans;
        }
        return ans; 
    }
}