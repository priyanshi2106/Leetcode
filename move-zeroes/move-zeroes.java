class Solution {
    public void moveZeroes(int[] nums) {
      
        for(int j = 0, i = 0; j< nums.length && i<nums.length; j++){
            if(nums[j] != 0){
                int t = nums[i];
                nums[i++] = nums[j];
                nums[j] = t;
            }
        
        }
    }
}