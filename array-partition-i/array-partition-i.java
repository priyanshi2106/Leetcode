class Solution {
    public int arrayPairSum(int[] nums) {
       Arrays.sort(nums);
        int n = nums.length;
        int size = n/2;
        //1,2,2,5,6,6
        
        int j = n-1;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n; i = i+2){
            min = Math.min(nums[i], nums[i-1]);
            sum = sum + min;
        }
        return sum;
    }
}