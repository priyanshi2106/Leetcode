class Solution {
    public String decodeString(String s) {
       Stack<Integer> count = new Stack<>();
        Stack<String> res = new Stack<>();
        
        String ss = "";
        int i = 0;
        while(i < s.length()){
            if(Character.isDigit(s.charAt(i))){
                int c = 0;
                while(Character.isDigit(s.charAt(i))){
                    c = 10 * c + (s.charAt(i)-'0');
                    i++;
                }
                count.push(c);
            }
            else if(Character.isLetter(s.charAt(i))){
                ss += s.charAt(i);
                i++;
            }
            else if(s.charAt(i) == '['){
                res.push(ss);
                ss = "";
                i++;
            }
            else{
                StringBuilder sb = new StringBuilder(res.pop());
                    int c = count.pop();
                    for(int j = 0; j < c; j++){
                        sb.append(ss); 
                    }
                    ss = sb.toString();
                    i++;
                
            }
        }
        return ss;
    }
}