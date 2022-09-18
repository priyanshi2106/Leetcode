class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length == 0 || nums == null){
            return res;
        }
        boolean used[] = new boolean[nums.length];
        List<Integer> permutation = new ArrayList<>();
        helper(permutation, res, used, nums);
        return res;
    }
    public void helper(List<Integer> permutation, List<List<Integer>>res, boolean[] used, int[] nums){
        if(permutation.size() == nums.length){
            res.add(new ArrayList<>(permutation));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i] == true){
                continue;
            }
            used[i] = true;
            permutation.add(nums[i]);
            helper(permutation, res, used, nums);
            permutation.remove(permutation.size()-1);
            used[i] = false;
            while(i+1 < nums.length && nums[i] == nums[i+1]){
                i++;
            }
        }
    }
}