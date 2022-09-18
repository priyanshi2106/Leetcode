class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0 || nums == null){
            return res;
        }
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, subset, 0, res);
        return res;
    }
    public void helper(int[] nums, List<Integer> subset, int start, List<List<Integer>> res){
        res.add(new ArrayList<>(subset));
        for(int i = start; i < nums.length; i++){
           if(i > start && nums[i] == nums[i-1]) continue;
            subset.add(nums[i]);
            helper(nums, subset, i+1, res);
            subset.remove(subset.size()-1);
        }
    }
}