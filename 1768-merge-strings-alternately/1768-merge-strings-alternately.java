class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        String ans = "";
        char w1[] = word1.toCharArray();
        char w2[] = word2.toCharArray();
        int len = word1.length() + word2.length();
        for (int k = 0; k < len; k++){
            if(i < word1.length() && j < word2.length()){
                ans = ans + w1[i] + w2[j];
                i++;
                j++;
            }
            else if(i >= word1.length() && j < word2.length()) {
                ans = ans + w2[j];
                j++;
                
            }
            else if(i < word1.length() && j >= word2.length()){
                ans = ans + w1[i];
                i++;
            }
        }
        return ans;
    }
}