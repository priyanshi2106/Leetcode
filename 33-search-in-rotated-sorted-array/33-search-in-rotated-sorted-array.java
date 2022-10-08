class Solution {
    public int search(int[] nums, int target) {
        //T: O(logN)
        //S:O(1)
        //Binary Search
        int i = 0;
        int j = nums.length-1;
        //int ans = 0;
        while(i <= j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                
                return mid;
            }
            // check if first half is non-rotated
            else if(nums[mid] >= nums[i]){
                if(target >= nums[i] && target < nums[mid]){
                    j = mid-1;
                }
                else{
                    i = mid+1;
                }
            }
           else{
               //first half is rotated
               if(target <= nums[j] && target > nums[mid]){
                   i = mid+1;
               }
               else{
                   j = mid-1;
               }
           }
            
        }
        return -1;
    }
}