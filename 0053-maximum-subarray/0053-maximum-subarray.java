class Solution {
    public int maxSubArray(int[] nums) {
        //T:O(n)
        //S:O(1)
        // int max = Integer.MIN_VALUE;
        // int sum = 0;
        // int max_element = Integer.MIN_VALUE;
        // for(int i = 0; i< nums.length; i++){
        //     sum = sum+nums[i];
        //     if(max < sum){
        //         max = sum;
        //     }
        //     if(sum < 0){
        //        sum = 0;
        //     }
        //     max_element = Math.max(max_element, nums[i]);
        // }
        // if(max == 0){
        //     max = max_element;
        // }
        // return max;
        
        
        //Solving using DP
        int dp[] = new int[nums.length];
        int max = nums[0];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            //if dp[i-1] + nums[i] is not max than nums[i] than we will simply start again so that is why we take nums[i] in dp[i] at that time.
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
}