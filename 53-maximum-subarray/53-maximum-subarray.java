class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int max_element = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            sum = sum+nums[i];
            if(max < sum){
                max = sum;
            }
            if(sum < 0){
               sum = 0;
            }
            max_element = Math.max(max_element, nums[i]);
        }
        if(max == 0){
            max = max_element;
        }
        return max;
    }
}