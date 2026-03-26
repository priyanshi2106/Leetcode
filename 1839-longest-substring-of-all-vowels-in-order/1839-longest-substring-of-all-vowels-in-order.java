class Solution {
    public int longestBeautifulSubstring(String word) {

       int distinct = 1;
       int len = 1;
       int max = 0;
       for(int i = 1; i < word.length(); i++){
        if(word.charAt(i) == word.charAt(i-1)){
            //same char
            len++;
        }
        else if(word.charAt(i) > word.charAt(i-1)){
            //next char
            len++;
            distinct++;
        }
        else{
            //order breaks
            distinct = 1;
            len = 1;
        }
        //if we have 5 unique char get its length
        if(distinct == 5){
            max = Math.max(max, len);
        }
       }
       return max;
    }
}