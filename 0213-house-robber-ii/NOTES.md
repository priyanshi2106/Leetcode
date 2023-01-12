//T: O(n)
//S: O(1)
public int rob(int[] nums) {
if(nums.length == 1){
return nums[0];
}
return Math.max(rob(0, nums.length-1, nums), rob(1,nums.length, nums));
}
public int rob(int start, int end, int nums[]){
int prevOne = 0, prevTwo = 0, max = 0;
for(int i = start; i < end; i++){
max = Math.max(prevOne, prevTwo + nums[i]);
prevTwo = prevOne;
prevOne = max;
}
return max;
}