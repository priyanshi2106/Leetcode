class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        //starting from back so as to get max value of perimeter
        for(int i = nums.length-3; i >= 0; i--){
            if(nums[i]+nums[i+1] > nums[i+2]){
                return nums[i] + nums[i+1] + nums[i+2];
                
            }
            
        }
        return ans;
    }
}