class Solution {
    public boolean isPalindrome(String s) {
       
        for(int i = 0, j = s.length()-1; i < j; i++, j--){
            //Skip i if the char is not digit or letter
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            //Skip j if the char is not digit or letter
            while( i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }
        return true;
    }
}