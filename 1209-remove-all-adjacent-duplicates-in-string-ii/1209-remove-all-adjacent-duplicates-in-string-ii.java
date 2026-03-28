class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(!st.isEmpty() && st.peek()[0] == c){
                st.peek()[1]++;
            }
            else{
                st.push(new int[]{c, 1});
            }
            //while putting only check if count reaches k
            if(st.peek()[1] == k){
                st.pop();
            }
        }
        //the stack now has char that cannot be reduced
        StringBuilder sb = new StringBuilder();
        for(int [] pair: st){
            for(int i = 0; i < pair[1]; i++){
                sb.append((char)pair[0]);
            }
        }
        return sb.toString();
    }
}