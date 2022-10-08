class Solution {
    public int findMin(int[] nums) {
        //T: O(log n)
        //S: O(1)
        int i = 0;
        int j = nums.length-1;
        int small = Integer.MAX_VALUE;
        
        if(nums.length == 1){
            return nums[0];
        }
        
            //No rotation
        if(nums[j] > nums[i]){
                return nums[0];
            }
        
        
        while(i <= j){
            
            int mid = (i+j)/2;
            if(nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid-1] > nums[mid]){
                return nums[mid];
            }
            if(nums[mid] < nums[0]){
                j = mid - 1;
                
            }
            else {
                i = mid+1;
            }
            
        }
        return small;
        
    }
}