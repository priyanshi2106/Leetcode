class Solution {
    // public boolean backspaceCompare(String s, String t) {
    //     return compute(s).equals(compute(t));
    // }
    // public String compute(String s){
    //     Stack<Character> st = new Stack<>();
    //     for(char c : s.toCharArray()){
    //         if(c != '#'){
    //             st.push(c);
    //         }
    //         else if(!st.isEmpty()){
    //             st.pop();
    //         }
    //     }
    //     return st.toString();
    // }
    
//     public boolean backspaceCompare(String s, String t) {
//         int i = s.length()-1;
//         int j = t.length()-1;
        
//         while(i>=0 || j>=0){
//             int i1 = getNextIndex(s, i);
//             int j1 = getNextIndex(t, j);
            
//             if(i1 < 0 || j1 < 0){
//                 //Reached the end of one of the string
//                 //So strings are not equal
//                 return false;
//             }
//             if(i1 < 0 && j1 < 0){
//                 //Reached the end of both the strings
//                 //Equal length of strings
//                 return true;
//             }
//             if(s.charAt(i1) != t.charAt(j1)){
//                 return false;
//             }
//             i = i1-1;
//             j = j1-1;
//         }
//         return true;
//     }
//     public int getNextIndex(String ss, int index){
//         int skip = 0;
//         while(index >= 0){
//             if(ss.charAt(index) == '#'){
//                 //Found the backspace char
//                 skip++;
//             }
//             else if(skip > 0){
//                 //Did not find the skip but skip is positive so we backspace the                       next char
//                 skip--;
//             }
//             else{
//                 //Valid char
//                 break;
//             }
//             index--;
//         }
//         return index;
//     }
// }
    
    public boolean backspaceCompare(String s, String t) {
        // Initialize pointers to the last element of both strings
        int i = s.length() - 1; // pointer to the last element of s
        int j = t.length() - 1; // pointer to the last element of t
        
        while (i >= 0 || j >= 0) {
            int i1 = getNextValidIndex(s, i);
            int j1 = getNextValidIndex(t, j);
            
            if (i1 < 0 && j1 < 0) {
                // reached the end of both strings
                // so both strings are equal
                return true;
            }
            
            if (i1 < 0 || j1 < 0) {
                // reached the end of one of the strings
                // hence s and t cannot be equal
                return false;
            }
            
            if (s.charAt(i1) != t.charAt(j1)) {
                // current characters pointed to by the two pointers
                // from both strings do not match
                // hence s and t cannot be equal
                return false;
            }
            
            // Decrement pointers for next iteration
            i = i1 - 1;
            j = j1 - 1;
        }
        
        return true;
    }
    
    private static int getNextValidIndex(String str, int index) {
        int backSpaceCount = 0;
        
        while (index >= 0) {
            if (str.charAt(index) == '#') {
                // found a backspace character
                backSpaceCount++;
            } else if (backSpaceCount > 0) {
                // found a non-backspace character
                backSpaceCount--;
            } else break; // a valid character
            
            index--; // skip a backspace or valid character next to a backspace
        }
        
        return index;
    }
}