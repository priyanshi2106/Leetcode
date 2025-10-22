class Solution {
    public int removeDuplicates(int[] nums) {
     int j = 1;
     int i = 0;
     while(j < nums.length){
        if(nums[i] == nums[j]){
            j++;
        }
        else if(nums[i] != nums[j] && i < nums.length){
            nums[i+1] = nums[j];
            i = i+1;
        }
     }
     return i+1;
    }
}