class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("") && haystack.equals("")){
            return 0;
        }
        if(haystack.equals("")){
            return -1;
        }
        if(needle.equals("")){
            return 0;
        }
        
        int len = needle.length();
        for(int i = 0; i<= haystack.length()-len;i++){
            String ans = haystack.substring(i,i+len);
            if(ans.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}