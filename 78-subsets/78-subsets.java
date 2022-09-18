class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0 || nums == null){
            return res;
        }
        //we dont care about the order [2,1] is
        //same as[1,2] so we will only count one of them
        List<Integer> subset = new ArrayList<>();
        generateSubset(nums, subset, 0, res);
        return res;
    }
    public void generateSubset(int[] nums, List<Integer> subset, int index, List<List<Integer>> res){
        res.add(new ArrayList<>(subset));
        for(int i = index; i < nums.length; i++){
            subset.add(nums[i]);
            generateSubset(nums, subset, i+1, res);
            subset.remove(subset.size()-1);
        }
    }
}