class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        //This dp array will contain the max value up untill the last index that we            can get as an ans
        int dp[] = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i+1] = Math.max(dp[i], dp[i-1] + nums[i]);
        }
        //Not returning dp[nums.length-1] bcs we started putting our ans from 1st             index
        return dp[nums.length];
    }
}