class Solution {
    public int missingNumber(int[] nums) {
       //  //T:O(n) and S:O(n)
       //  int n = nums.length;
       // for(int i = 0; i < nums.length; i++){
       //     n^= i^nums[i]; 
       // }
       //  return n;
        
        //Second method
        //T:O(n) S:O(n)
        int n = nums.length;
        int sum = n*(n+1)/2;
        int s = 0;
        for(int i = 0; i < n; i++){
            s = s + nums[i];
        }
        return sum-s;
    }
}
