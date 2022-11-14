class Solution {
    //Sliding window technique
    //T: O(n)
    //S: O(1)
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }
    public int atMost(int nums[], int goal){
        int left = 0; 
        int right = 0;
        int sum = 0; //keeps the track of sum
        int res = 0;
        while(right < nums.length){
            sum = sum + nums[right];
            while(left <= right && sum > goal){
                //we need to dec the sum because it exceeded the goal
                sum = sum - nums[left];
                left++;
            }
            res = res+(right-left);
            right++;
        }
        return res;
    }
}