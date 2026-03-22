class Solution {
    public int secondsToRemoveOccurrences(String s) {
        //t:O(n^2)
        int ans = 0;
        while(s.indexOf("01") >= 0){
            s = s.replace("01", "10");
            ans++;
        }
        return ans;

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
    }
}