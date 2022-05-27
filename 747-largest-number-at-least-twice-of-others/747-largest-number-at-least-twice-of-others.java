class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int highest = -1, secondHighest = -1;
        int ans = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > highest){
                secondHighest = highest; 
                highest = nums[i];
                
                ans = i;
                
            }
            else if(nums[i] > secondHighest){
                secondHighest = nums[i];
            }
            
        
        }
        
        return (highest >= 2*secondHighest) ? ans:-1;
    }
}