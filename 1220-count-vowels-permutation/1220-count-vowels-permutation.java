class Solution {
    
    public int countVowelPermutation(int n) {
        long aCount = 1, eCount = 1, iCount = 1, oCount = 1, uCount = 1;
        int MOD = 1000000007;
        
        for(int i = 1; i < n; i++){
            long aCountNew = (eCount + iCount + uCount) % MOD;
            long eCountNew = (aCount+ iCount) % MOD;
            long iCountNew = (eCount + oCount) % MOD;
            long oCountNew = (iCount) % MOD;
            long uCountNew = (iCount + oCount) % MOD;
            
            // assign these new count values to the original variables so as to make it count towards the answer.
            aCount = aCountNew;
            eCount = eCountNew;
            iCount = iCountNew;
            oCount = oCountNew;
            uCount = uCountNew;
            
        }
        //result will be the sum of all these count variables.
        long res = (aCount + eCount + iCount + oCount + uCount) % MOD;
        return (int)res;
    }
}