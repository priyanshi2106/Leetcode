int majorityElement(vector<int>& nums) {
//assume the first element is the answer
int ans = nums[0], count = 1;
for (int i = 1; i < nums.size(); i++) {
if (ans != nums[i]) {
count--;//if meet different value,count--
} else { //if meet the same value, count++
count++;
}
//if the current best ans is no longer the majority
// i.e. it's count is not larger than i / 2
if (count == 0) {
count = 1;
ans = nums[i];
}
}
return ans;
​