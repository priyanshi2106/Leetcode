class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            //odd length
            count += isPalindrome(s, i, i);
            //even length
            count+= isPalindrome(s, i, i+1);
        }
        return count;
    }
    public int isPalindrome(String s, int start, int end){
        int ans = 0;
        while(start >=0 && end <s.length() && s.charAt(start) == (s.charAt(end))){
            end++;
            start--;
            ans++;
        }
        return ans;
    }
}