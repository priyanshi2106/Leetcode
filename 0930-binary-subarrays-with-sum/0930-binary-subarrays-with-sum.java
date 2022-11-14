class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }
    public int atMost(int nums[], int goal){
        int l = 0; 
        int r = 0;
        int sum = 0; //keeps the track of sum
        int res = 0;
        while(r < nums.length){
            sum = sum + nums[r];
            while(l <= r && sum > goal){
                //we need to dec the sum because it exceeds the goal
                sum = sum - nums[l];
                l++;
            }
            res = res+(r-l);
            r++;
        }
        return res;
    }
}