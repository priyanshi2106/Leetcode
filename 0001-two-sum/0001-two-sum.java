class Solution {
    public int[] twoSum(int[] nums, int target) {
        // x = nums[i]-target
        // check for x in hm, if we find it we store the ans if not we move forward and
        // add nums[i] to hm with index as values

        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (hm.containsKey(x)) {
                ans[0] = hm.get(x);
                ans[1] = i;
                return ans;
            } else {
                hm.put(nums[i], i);
            }
        }
         return ans;
    }
}