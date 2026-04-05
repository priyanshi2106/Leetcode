class Solution {
    public int minRemoval(int[] nums, int k) {
        //condition to check: max <= k * min
        //T:O(nlogn)
        //S:(logn) stack for sorting
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j < nums.length){
            if((long)nums[i] * k >= nums[j]){
                //now we can explore more max elements
                j++;
                ans = Math.max(ans, j-i);
                //j-i gives us how many valid elements we have so far
            }
            else{
                i++;
            }
        }
        return nums.length-ans;
        
    }
}
