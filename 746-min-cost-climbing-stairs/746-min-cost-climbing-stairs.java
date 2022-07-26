class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //Time: O(n)
        //Space: O(n)
//         int dp[] = new int[cost.length+1];
        
//         for(int i = 0; i < cost.length; i++){
//             if(i < 2){
//                 dp[i] = cost[i];
//             }
//             else{
//                             dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);

//             }
            
//         }
//         return Math.min(dp[cost.length-1], dp[cost.length-2]);
        
        
        // Time : O(n)
        //Space: O(1)
        int first = cost[0];
        int second = cost[1];
        int n = cost.length;
        // if(n < 2){
        //     return Math.min(first,second);
        // }
        for(int i = 2; i < n; i++){
            int curr = cost[i] + Math.min(first, second);
            first = second;
            second = curr;
        }
        return Math.min(first, second);
    }
}