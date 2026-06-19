class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if(hm.containsKey(num)){
                ans[0] = i;
                ans[1] = hm.get(num);
            }
            else{
                hm.put(nums[i], i);
            }
            
        }
        return ans;
    }
}