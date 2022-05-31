class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0; 
        int j = 0;
        int ans = Integer.MAX_VALUE;
       for(int i = 0; i < nums.length; i++){
          
              sum = sum + nums[i];
           
           while(sum >= target){
               ans = Math.min(ans,(i-j+1));
               //As we have to find the min length of contiguous array so we perform the next step
               sum -= nums[j++];
           }
         
       }
        return (ans!=Integer.MAX_VALUE)? ans:0;
    }
}