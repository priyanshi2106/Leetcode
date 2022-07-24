class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0, j = n;
        int ans[] = new int[nums.length];
        int k = 0;
        while(i < n && j < nums.length && k < nums.length){
            ans[k] = nums[i];
            k++;
            ans[k] = nums[j];
            i++;
            j++;
            k++;
        }
        return ans;
    }
}