class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length == k) {
            return k;
        }
        int start = 0;
        int j = 0;
        int end = nums.length;
         int maxLength = 0;
         for( j = 0; j < end; j++){
            if(nums[j] == 0){
                k--;
            }
            if(k<0){
                if(nums[start] == 0){
                    k++;
                }
                start++;
            }
         }
        return j-start;
    }
}