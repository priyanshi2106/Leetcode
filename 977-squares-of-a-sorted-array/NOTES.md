int res[] = new int[nums.length];
int left = 0;
int right = nums.length-1;
for(int i = nums.length-1; i >= 0; i--){
int sq;
if(Math.abs(nums[left]) < Math.abs(nums[right])){
sq = nums[right];
right--;
}
else{
sq = nums[left];
left++;
}
res[i] = sq*sq;
}
return res;