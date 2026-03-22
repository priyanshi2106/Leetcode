class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int ans = 0;
        while(s.indexOf("01") >= 0){
            s = s.replace("01", "10");
            ans++;
        }
        return ans;
    }
}