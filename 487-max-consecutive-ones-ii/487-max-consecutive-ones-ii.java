class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
//         int sum = 0;
//         int max = 0;
//         //int count = 0;
//         for(int i = 0; i< nums.length; i++){
//            int count=0;  
//                for(int j = i; j< nums.length;j++){
//                    if(nums[j] == 0 ){
             
//                 count++;
//             }
//             if(count <=1){
               
            
           
//             max = Math.max(j-i+1,max);
            
//             }
//                }
            
           
//         }
//         return max;
        
        //Solution for follow up question
        int start = 0,end = 0;
        int zeroIndex= -1;
      int result = 0;
      while (end < nums.length) {
          if (nums[end] == 0) {
              start = zeroIndex + 1;
              zeroIndex = end;
          }
            
          result = Math.max(result, end - start + 1);
          end++;
      }
  
      return result;
    }
}
