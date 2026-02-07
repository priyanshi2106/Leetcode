class Solution {
    public int[] countBits(int n) {
        // int ans[] = new int[n+1];
        // for(int i = 0; i <= n; i++){
        //     int count = 0;
        //     int temp = i;
        //     while(temp != 0){
        //         count += temp & 1;
        //         temp >>>=1;
        //     }
        //     ans[i] = count;
        // }
        // return ans;

        // dp solution
        //we need to offset the bit by most significant bit
        // 1+ dp[n-most significant bit]
        //how do we find/compute this msb? msb*2 == i? if yes update msb

        int dp[] = new int[n+1];
        int msb = 1;
        for(int i = 1; i <=n; i ++){
            if(msb *2 == i){
                msb = i;
            }
            dp[i] = 1+dp[i-msb];
        }
        return dp;
    }
}