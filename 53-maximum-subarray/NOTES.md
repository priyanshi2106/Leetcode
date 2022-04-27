int max_so_far = Integer.MIN_VALUE;
int max_ending_here = 0;
int max_element = Integer.MIN_VALUE;
for(int i =0; i< nums.length;i++){
max_ending_here = max_ending_here + nums[i];
if(max_ending_here < 0){
max_ending_here = 0;
}
if(max_so_far < max_ending_here){
max_so_far = max_ending_here;
}
max_element = Math.max(max_element, nums[i]);
}
if(max_so_far == 0){
max_so_far = max_element;
}
return max_so_far;