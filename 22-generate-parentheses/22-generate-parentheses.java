class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }
    public void backtrack(List<String> ans, String currString, int left, int right, int max){
        //Base Case
        if(currString.length() == max*2){
           ans.add(currString);
            return;
        }
        if(left < max){
            backtrack(ans, currString+ "(", left+1, right, max);
        }
        if(right < left){
            backtrack(ans, currString+ ")", left, right+1, max);
        }
    }
}