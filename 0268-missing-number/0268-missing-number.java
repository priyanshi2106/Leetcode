class Solution {
    public int missingNumber(int[] nums) {
        //use xor here
        // 0^0 -> 0
        //1^0 -> 1
        //1^1 - > 0
        int missing = nums.length;
        //Initialize missing = nums.length to include the last number n, then XOR it with all indices and array elements; all duplicates cancel and only the missing number remains.

        //index only goes till length-1 
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}