class Solution {
    public int maxProduct(int[] nums) {
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int res = max_so_far;
        
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            int temp_max = Math.max(curr, Math.max(curr*max_so_far, curr*min_so_far));
            min_so_far = Math.min(curr, Math.min(max_so_far*curr, min_so_far*curr));
            max_so_far = temp_max;
            res = Math.max(max_so_far, res);
        }
        return res;
    }
}