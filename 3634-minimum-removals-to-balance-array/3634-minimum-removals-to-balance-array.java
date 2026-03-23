class Solution {
    public int minRemoval(int[] nums, int k) {
        //condition to check: max <= k * min
        Arrays.sort(nums);
        int ans = 0;
        int i = 0; int j = 0;
        while(j < nums.length){
            if((long)nums[i] * k >= nums[j]){
                j++;
                ans = Math.max(ans, j-i);
            }
            else{
                i++;
            }
        }
        return nums.length -ans; 
        
    }
}