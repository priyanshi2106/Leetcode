class Solution {
    public int trap(int[] height) {
        //T: O(n) (only single iteration)
        //S: O(1)
        //we find the min(height at left pt and height at right pt)
        int left = 0;
        int right = height.length-1;
        int left_max = 0;
        int right_max = 0;
        int ans = 0;
        
        while(left < right){
            if(height[left] < height[right]){//this condition checks the min of height at left and right
                if(height[left] >= left_max){
                    left_max = height[left];
                }
                else{
                    ans+=(left_max-height[left]);
                }
                
                left++;
            }
            else{
                if(height[right] >= right_max){
                    right_max = height[right];
                }
                else{
                    ans+=(right_max-height[right]);
                }
                
                right--;
                
            }
        }
        return ans;
    }
}
