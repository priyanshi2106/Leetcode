for (int i = 0; i < nums.length; ++i) {
int index = Math.abs(nums[i])-1;
if (nums[index] < 0)
res.add(Math.abs(index+1));
nums[index] = -nums[index];