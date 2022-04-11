class Solution {
    public String removeDuplicates(String s) {
//         Stack<Character> st = new Stack<>();
//         for(char c : s.toCharArray()){
            
//             if(st.isEmpty()){
//                 st.push(c);
//             }
//             else if(st.peek() == c){
//                 st.pop();
//             }
//             else if(st.peek() != c && !st.isEmpty()){
//                 st.push(c);
//             }
           
            
//         }
//         String ans ="";
//         while(!st.isEmpty()){
//             //char cc = st.pop();
//             ans = st.pop()+ans;
//         }
//         return ans; 
        
         StringBuilder sb = new StringBuilder();
    int sbLength = 0;
    for(char character : s.toCharArray()) {
      if (sbLength != 0 && character == sb.charAt(sbLength - 1))
        sb.deleteCharAt(sbLength-- - 1);
      else {
        sb.append(character);
        sbLength++;
      }
    }
    return sb.toString();
    }
}