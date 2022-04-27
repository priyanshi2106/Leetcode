class Solution {
    public int singleNumber(int[] nums) {
        
        int ans = 0;
        for(int in:nums){
           ans = ans ^ in;
        }
        return ans;
    }
}