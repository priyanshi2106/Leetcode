class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }
        String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno","pqrs","tuv", "wxyz"};
        StringBuilder sb = new StringBuilder();
        backtrack(ans, digits, sb, mapping, 0);
        return ans;
    }
    public void backtrack(List<String> ans, String digits, StringBuilder sb, String mapping[], int i){
        if(i == digits.length() ){
            ans.add(sb.toString());
            return;
        }
        String mapp = mapping[digits.charAt(i) - '0'];
        for(char c : mapp.toCharArray()){
            sb.append(c);
            backtrack(ans, digits, sb, mapping, i+1);
            sb.deleteCharAt(sb.length()-1);

        }

    }
}