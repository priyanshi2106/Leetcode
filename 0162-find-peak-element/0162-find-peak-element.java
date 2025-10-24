class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int max = -1;
        if(nums.length == 1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[j] > nums[j-1]){
            return j;
        }
        i = 1;
        j = nums.length-2;
        while(i <= j){
            int mid = (i+j)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){ // mid is the peak
                max = mid;
                return max;
            }
            else if(nums[mid] < nums[mid+1]){
                i = mid+1;
            }
            else if(nums[mid] < nums[mid-1]){
                j = mid-1;
            }
            
            
        }
        return max;
    }
}