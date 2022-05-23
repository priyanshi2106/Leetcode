class Solution {
    public int[] sortArrayByParity(int[] nums) {
    //quicksort
        int i = 0, j = nums.length-1;
        while(i<j){
            // if(nums[i]%2 == 0 && nums[j]%2 != 0){
            //     i++;
            //     j--;
            // }
            if(nums[i]%2 > nums[j]%2){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            if(nums[i]%2 == 0){
                i++;
            }
            if(nums[j]%2 == 1){
                j--;
            }
            
        }
        return nums;
    }
}