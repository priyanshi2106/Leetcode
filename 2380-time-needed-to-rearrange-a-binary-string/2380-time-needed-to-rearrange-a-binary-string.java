class Solution {
    public int secondsToRemoveOccurrences(String s) {
        //t:O(n^2)
        // int ans = 0;
        // while(s.indexOf("01") >= 0){
        //     s = s.replace("01", "10");
        //     ans++;
        // }
        // return ans;

    //     int ans = 0;
    //     StringBuilder sb = new StringBuilder(s);
    //     while(swapped(sb)){
    //         ans ++;
    //     }
    //     return ans;
    // }
    // public boolean swapped(StringBuilder s){
    //     boolean swappedFlag = false;
    //     for(int i = 0; i < s.length() - 1; i++){
    //         if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
    //             s.setCharAt(i, '1');
    //             s.setCharAt(i+1, '0');
    //             i++;
    //             swappedFlag = true;
    //         }
    //     }
    //     return swappedFlag;

    //T: O(n)

    //we have to move every 1 to left from right and it takes atleast  number of 0s to left of one + 1 sec to do that.

    //if two 1s are adjacent, the second 1 has to wait for the first 1 to move before it can move

    int zeros = 0;
    int sec = 0;
    for(int i = 0; i < s.length() ; i++){
        if(s.charAt(i) == '0'){
            zeros++;
        }
        if(s.charAt(i) == '1' && zeros > 0){
            sec = Math.max(sec + 1, zeros);
        }
    }
    return sec;
    }
}