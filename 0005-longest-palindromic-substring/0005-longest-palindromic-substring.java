class Solution {
    int start = 0;
    int maxLen = 1;
    public String longestPalindrome(String s) {
        if(s.length() < 2){
            return s;
        }
        for(int i = 0; i < s.length(); i++){
            expand(s, i, i);
            expand(s, i, i+1);
        }
        return s.substring(start, start+maxLen);
        
    }
    public void expand(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        //when we break out of loop we have moved one step more towards right and left
        int len = right-left-1;
        if(len > maxLen){
            maxLen = len;
            start = left+1;
        }
    }
}