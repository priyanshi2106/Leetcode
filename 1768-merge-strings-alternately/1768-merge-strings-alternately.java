class Solution {
    public String mergeAlternately(String word1, String word2) {
        char w1[] = word1.toCharArray();
        char w2[] = word2.toCharArray();
        int k = 0;
        int l = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < word1.length()+word2.length() ; i++){
            if(k < word1.length() && l< word2.length()){
                ans.append(w1[k]).append(w2[l]);
                k++;
                l++;
            }
            else if(k >= word1.length() && l < word2.length()){
                ans.append(w2[l]);
                l++;
            }
            else if(k < word1.length() && l >= word2.length()){
                ans.append(w1[k]);
                k++;
            }
        }
        return ans.toString();
    }
}