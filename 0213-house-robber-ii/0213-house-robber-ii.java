class Solution {
    public int rob(int[] nums) {
    // Here we need to make sure that if we pick the first index then we should               avoid the last index and vice versa
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
            
        }
        return Math.max(rob(0, nums.length-1, nums), rob(1, nums.length, nums));
    }
    public int rob(int start, int end, int nums[]){
        int dp[] = new int[nums.length+1];
        dp[0] = 0;
        dp[start+1] = nums[0];
        for(int i = 1; i < end; i++){
          dp[i+1] = Math.max(dp[i], dp[i-1] + nums[i]);
        }
        return dp[end];
    }
}