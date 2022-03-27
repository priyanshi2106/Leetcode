class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs.length == 0){
           return "";
       }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                //if its zero that means prefix is present in the string
                prefix = prefix.substring(0, prefix.length()-1);
                //Since it does not return 0 so will decrease the prefix by 1 every time
            }
        }
        return prefix;
}
}