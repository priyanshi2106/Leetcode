class Solution {
    public int[] sortedSquares(int[] nums) {
//         for(int i = 0; i< nums.length; i++){
//             nums[i] = nums[i]*nums[i];
            
//         }
//         Arrays.sort(nums);
//      
        int ans[] = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i = nums.length-1; i >= 0; i--){
            int sq;
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                sq = nums[right];
                right--;
            }
            else{
                sq = nums[left];
                left++;
            }
            ans[i] = sq*sq;
        }
        return ans;
    }
}