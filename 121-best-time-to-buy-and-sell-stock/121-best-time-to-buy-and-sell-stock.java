class Solution {
    public int maxProfit(int[] prices) {
       //BRUTE FORCE 
        // Time = O(n^2)
        //Space = O(1)
//         int ans = 0;
      
//         for(int i = 0; i< prices.length-1;i++){
//             for(int j = i+1; j< prices.length;j++){
//                 int profit = prices[j] - prices[i];
//                 if(profit > ans){
//                     ans = profit;
//                 }
//             }
//         }
//         return ans;
        
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i< prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else if(prices[i] - min > max){
                max = prices[i] - min;
            }
        }
        return max;
    }
}