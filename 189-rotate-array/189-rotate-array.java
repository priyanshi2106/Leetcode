class Solution {
    public void rotate(int[] nums, int k) {
        
//         int c = 0;
//         int ans[] = new int[nums.length];
//        while(c < k){
//             for(int i = nums.length-k; i < nums.length; i++){
//             ans[c++] = nums[i];
              
//         }
           
        
//        }
//         int p = 0;
//         c=k;
//         while(p < nums.length-k && c < nums.length){
//             ans[c++] = nums[p++];
//         }
//         for(int i = 0; i < nums.length; i++){
//             nums[i] = ans[i];
//         }
        
        //reverse the array first
        //then reverse first k numbers
        //then reverse k+1 to n numbers
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);
    }
    public void reverse(int []nums, int start, int end){
        while(start < end){
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start++;
            end--;
        }
    }
}