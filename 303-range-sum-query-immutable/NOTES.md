int[] dp;
public NumArray(int[] nums) {
int n = nums.length;
dp = new int[n+1];
dp[0] = 0;
for(int i = 1; i<= n; i++){
dp[i] = dp[i-1] + nums[i-1];
}
}
return dp[right+1]-dp[left];