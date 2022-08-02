class Solution {
    int n, m;
    int [] nums, multipliers;
    int memo[][];
    
    public int maximumScore(int[] nums, int[] multipliers) {
        n = nums.length;
        m = multipliers.length;
        this.memo = new int[m][m];
        this.nums = nums;
        this.multipliers = multipliers;
        return dp(0, 0);
    }
    public int dp(int i, int left){
        //Base case
        if(i == m){
            return 0;
        }
        
        int mult = multipliers[i];
        int right = n - 1 - (i - left);
        
        if(memo[i][left] == 0){
            
            memo[i][left] = Math.max(mult * nums[left] + dp(i + 1, left + 1), 
                                     mult * nums[right] + dp(i + 1, left));
            
        }
        return memo[i][left];
    }
}