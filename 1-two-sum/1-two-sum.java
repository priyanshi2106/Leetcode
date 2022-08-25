class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> hm = new HashMap<>();
        int ans[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            int val = target - x;
            if(hm.containsKey(val)){
                return new int[]{hm.get(val), i};
            }
            else{
                hm.put(x, i);
            }
        }
        return null;
    }
}