class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length == k) {
            return k;
        }
        int zeroCount = 0;
        int maxOne = 0;
        int start = 0;
        int end = nums.length;
         for( int j = 0; j < end; j++){
            if(nums[j] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[start] == 0){
                    zeroCount--;
                }
                start++;
            }
            maxOne = Math.max(maxOne, j-start+1);
         }
        return maxOne;
    }
}