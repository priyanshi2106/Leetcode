class Solution {
    public List<List<String>> partition(String s) {
        //T:O(N*2^N) 2^n to generate all substring and n time to check if the                            substring is a palinderome or not
        //S: O(n) to store the recursion array
        List<List<String>> res = new ArrayList<>();
        if(s == null || s.length() == 0)
        {
            return res;
        }
           List<String> st = new ArrayList<>();
            backtrack(res, st,s);
        return res;
    }
    public void backtrack(List<List<String>> res, List<String> st, String s){
        if(s == null || s.length() == 0){
            res.add(new ArrayList<>(st));
            return;
        }
        for(int i = 1; i <= s.length(); i++){
            String t = s.substring(0,i);
            if(!isPalindrome(t)){
                continue;
            }
            st.add(t);
            backtrack(res, st, s.substring(i, s.length()));
            st.remove(st.size()-1);
        }
    }
    public boolean isPalindrome(String s){
      int l = 1;
        int j = s.length()-1;
        
            for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            j--;
        }
           
        
        return true;
    }
}