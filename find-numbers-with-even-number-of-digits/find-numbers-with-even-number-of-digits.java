class Solution {
    public int findNumbers(int[] nums) {
//         int count = 0;
//         int ans = 0;
//         for(int i = 0; i < nums.length; i++){
//             int n = nums[i];
//             while(nums[i] != 0)
//             {
//                 //int rem = n%10;
            
//                 nums[i] = nums[i]/10;
//                     count++;
//             }
//             if(count%2 == 0){
//                 ans++;
//             }
//         }
//         return ans;
        
        int even = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
           int counter = 0;
            while(nums[i] != 0){
                 nums[i] /= 10;
            counter++;
            }
        if (counter % 2 == 0){
            even++;
        }
        }
    return even;  
    }
}