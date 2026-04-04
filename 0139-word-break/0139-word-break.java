class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // //We will take two pointer i and j and we will keep i moving forwards and j will remain at left and then we will check if the substring that we are getting is in wordDict. If it is we will mark the ending index i.e i's value in dp array as true.'
        // int n = s.length();
        // boolean dp[] = new boolean[n+1];
        // int maxLen = 0;
        // for(String sa: wordDict){
        //     if(maxLen < sa.length()){
        //        maxLen = sa.length();
        //     }
        // }
        // dp[0] = true;
        // for(int i = 0; i <= n; i++){
        //     for(int j = 0; j < i; j++){
        //         if(i-j > maxLen){
        //             continue;
        //         }
        //         if(dp[j] == true && wordDict.contains(s.substring(j, i))){
        //             dp[i] = true;
        //             break;

        //         }
        //     }
        // }
        // return dp[n];

        //every index in dp represents if we can find that substring in word dict...we need to keep track of maxLen in the word dic so tat we can go back and see if we found a word too.

        //T:O(n^2)
        Set<String> words = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        //empty string is always valid
        dp[0] = true;
        int maxLen = 0;
        for (String word : words) {
            maxLen = Math.max(maxLen, word.length());
        }

        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= Math.max(0, i - maxLen); j--) {
                if (dp[j] && words.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
}