class Solution {
    public int secondsToRemoveOccurrences(String s) {
    //     int ans = 0;
    //     while(s.contains("01")){
    //         ans++;
    //         s = s.replace("01", "10");
    //     }
    //     return ans;

    int zeroes = 0;
    int sec = 0;
    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '0'){
            zeroes++;
        }
        if(s.charAt(i) == '1' && zeroes > 0){
            sec = Math.max(sec+1, zeroes);
        }
    }
    return sec;
    }
}

