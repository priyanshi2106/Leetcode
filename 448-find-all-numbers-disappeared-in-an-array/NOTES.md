In second solution we will consider the element at each index as index of that particular value. And we will negate this index as we go through the array. After looping through the array again if we find a value which is > 0 then that means that index or number was not present.
​
//Time: O(n)
// space: O(n)
// HashSet<Integer> hm = new HashSet<>();
// LinkedList<Integer> ll = new LinkedList<>();
// for(int num : nums){
//     hm.add(num);
// }
// int range = nums.length+1;
// for(int i = 1; i< range; i++){
//     if(!hm.contains(i)){
//         ll.add(i);
//     }
// }
// return ll;
//Time: O(n)
//space: O(1)
List<Integer> ans = new LinkedList<>();
for(int i = 0; i < nums.length; i++){
int newIndex = Math.abs(nums[i])-1;
//check if value at this index is already negative
if(nums[newIndex] > 0){
nums[newIndex] *= -1;
}
}
for(int i = 1; i <= nums.length; i++){
if(nums[i-1] > 0){
ans.add(i);
}
}
return ans;