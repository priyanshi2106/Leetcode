class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int ans[] = new int[nums.length];
        //taking out product of left side
        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = nums[i-1] * left[i-1];
        }
        //taking out product of right side
        right[nums.length-1] = 1;
        for(int i = nums.length-2; i >= 0; i-- ){
            right[i] = nums[i+1] * right[i+1];
        }
        //ans array
        for(int i = 0; i < nums.length; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}