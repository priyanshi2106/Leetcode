class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int ans = 0;
        while(s.contains("01")){
            ans++;
            s = s.replace("01", "10");
        }
        return ans;
    }
}

