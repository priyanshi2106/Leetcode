class Solution {
    public void sortColors(int[] nums) {
        int left = 0; 
        int right = nums.length-1;
        int curr = 0;
//1)- use three pointers one for left end , one for right end and one for iteration.
// 2)-if you see 0 swap it with left pointer and increase the left pointer by one and curr by one.
// 3)-if you see 2 swap it with right pointer and decrease right pointer by one.
// 4)-else increase the iterating pointer.
// 5)-run this loop while the iterating pointer<=right pointer.
// right pointer=n-1
// left pointer=0
// iterating pointer =0 runs while it is<=right pointer.
        while(curr <=right){
            if(nums[curr] == 0){
                int temp = nums[left];
                nums[left] = nums[curr];
                nums[curr] = temp;
                left++;
                curr++;
            }
            else if(nums[curr] == 2){
                int temp = nums[right];
                nums[right] = nums[curr];
                nums[curr] = temp;
                right--;
            }
            else{
                //we see 1 dont do anything
                curr++;
            }
        }
    }
}