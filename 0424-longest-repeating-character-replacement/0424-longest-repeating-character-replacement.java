class Solution {
    public int characterReplacement(String s, int k) {
        // int n = s.length();
        // int i = 0;
        // int ans = 0;
        // int max_count = 0; //keeps track of the char that is occuring the most
        // int c[] = new int[26];
        // //we want to replace the char that occurs less frequently with the char
        // // that occurs most frequently
        // for(int j = 0; j < s.length(); j++){
        //     c[s.charAt(j) - 'A']++;
        //     max_count = Math.max(max_count, c[s.charAt(j) - 'A']);
        //     int window_length = j-i+1;
        //     if(window_length - max_count > k){
        //         c[s.charAt(i) - 'A']--;
        //         i++;
        //     }
        //     ans = Math.max(ans, j-i+1);


        // }
        // return ans;

        int[] c = new int[26];
        int left = 0;
        int maxWindow = 0;
        int maxFreq = 0;
        for(int right = 0; right < s.length(); right++){
            //update frq map
            c[s.charAt(right)-'A']++;

            //update the window size 
            int windowSize = right-left+1;

            //update maxFreq 
            maxFreq = Math.max(maxFreq,  c[s.charAt(right)-'A']);

            //shrink window if windowSize - maxFreq > k
            if(windowSize-maxFreq > k){
                c[s.charAt(left)-'A']--;
                left++;
            }
            windowSize = right-left+1;
            maxWindow = Math.max(maxWindow, windowSize);
        }
        return maxWindow;
    }
}