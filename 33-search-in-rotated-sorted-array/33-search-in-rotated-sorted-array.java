class Solution {
    public int search(int[] nums, int target) {
        //T: O(logN)
        //S:O(1)
        //Binary Search
       int i = 0; 
        int j = nums.length-1;
        while(i <= j){
            int mid = (i+j)/2;
            if(target == nums[mid]){
                return mid;
            }
            // if we know that left side is sorted and right is not and mid is in left side
            if(nums[mid] > nums[i] || nums[mid] > nums[j]){
                if(target >= nums[i] && target < nums[mid]){
                    j = mid-1;
                }
                else{
                    i = mid+1;
                }
            }
            //right is sorted
            else if(nums[mid] < nums[j] || nums[mid] < nums[i]){
                if(target > nums[mid] && target <= nums[j]){
                    i = mid+1;
                }
                else{
                    j = mid-1;
                }
            }
            else{
                //If we got here, that means nums[i] == nums[mid] == nums[j], then shifting out
                // remove duplicates
                j--;
            }
        }
        return -1;
    }
}