class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       //Time limit exceeds
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
        
       int max = 0;
        int left = 0;
        int right = 0;
        int numOfZeroes = 0;
        while(right < nums.length){
            
            if(nums[right] == 0){
                numOfZeroes++;
            }
            //when we encounter more than 1 zero
            while(numOfZeroes == 2){
               
                if(nums[left] == 0){
                    numOfZeroes--;
                }
                 left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}
