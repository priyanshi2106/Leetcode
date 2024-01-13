class Solution {
    public String mergeAlternately(String word1, String word2) {
        // O(T) : O(m+n)
        // O(S) : O(1)
        int i = 0, j = 0;
        
        //use stringBuilder for inplace string modifiction for faster execution
        
        // String ans = "";
        StringBuilder ans = new StringBuilder();
        // char w1[] = word1.toCharArray();
        // char w2[] = word2.toCharArray();
        int len = word1.length() + word2.length();
        for (int k = 0; k < len; k++){
            if(i < word1.length() && j < word2.length()){
                ans.append(word1.charAt(i)).append(word2.charAt(i));
                // ans = ans + w1[i] + w2[j];
                i++;
                j++;
            }
            else if(i >= word1.length() && j < word2.length()) {
                ans.append(word2.charAt(j));
                //ans = ans + w2[j];
                j++;
                
            }
            else if(i < word1.length() && j >= word2.length()){
                ans.append(word1.charAt(i));
                //ans = ans + w1[i];
                i++;
            }
        }
        return ans.toString();
    }
}