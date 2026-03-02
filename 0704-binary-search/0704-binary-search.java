class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int ans = -1;
        while(left < right){
            int mid = (left+right-1)/2;
            if(nums[mid] < target){
                left = mid+1;
            }
            else if(nums[mid] > target){
                right = mid-1;
            }
            else{
                ans = mid;
            }
            left++;
            right--;
        }
        return ans;
    }
}