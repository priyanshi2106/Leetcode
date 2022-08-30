class Solution {
    public int[] productExceptSelf(int[] nums) {
        //T:O(n)
        //S:O(n)
        // int left[] = new int[nums.length];
        // int right[] = new int[nums.length];
        // int ans[] = new int[nums.length];
        // //taking out product of left side
        // left[0] = 1;
        // for(int i = 1; i < nums.length; i++){
        //     left[i] = nums[i-1] * left[i-1];
        // }
        // //taking out product of right side
        // right[nums.length-1] = 1;
        // for(int i = nums.length-2; i >= 0; i-- ){
        //     right[i] = nums[i+1] * right[i+1];
        // }
        // //ans array
        // for(int i = 0; i < nums.length; i++){
        //     ans[i] = left[i] * right[i];
        // }
        // return ans;
        
        //T:O(n)
        //S:O(1)
        int ans[] = new int[nums.length];
         ans[0] = 1;
        for(int i = 1; i < nums.length; i++){
            ans[i] = nums[i-1] * ans[i-1];
        }
        int right = 1;
        for(int i = nums.length-1; i >= 0; i--){
            
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }
        return ans;
    }
}