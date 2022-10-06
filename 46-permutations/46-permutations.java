class Solution {
    public List<List<Integer>> permute(int[] nums) {
        //T: O((n!)n)
        //S: O(n!)
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0 || nums == null){
            return res;
        }
        boolean used[] = new boolean[nums.length];
        List<Integer> permutation = new ArrayList<>();
        helper(res, permutation, used, nums);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> permutation, boolean[] used, int[] nums){
        if(permutation.size() == nums.length){
            //storing deep copy because arrayList is a reference data type toh whenever we make changes then all the changes will be reflected in the orig array and we do not want that.
            res.add(new ArrayList<>(permutation));return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i] == true){
                continue;
            }
            used[i] = true;
            permutation.add(nums[i]);
            helper(res, permutation, used, nums);
            permutation.remove(permutation.size()-1);
            used[i] = false;
        }
    }
}