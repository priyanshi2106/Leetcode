class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
         boolean check[] = new boolean[nums.length];
         Arrays.sort(nums);
        backtrack(nums, ans, new ArrayList<>(), check);
       
        return ans;
    }
    public void backtrack(int nums[], List<List<Integer>> ans, List<Integer> curr, boolean check[]){
        if(curr.size() == nums.length && !ans.contains(curr)){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!check[i]){
                if(i > 0 && nums[i] == nums[i-1] && !check[i-1]){
                    continue;
                }
                check[i] = true;
                curr.add(nums[i]);
                backtrack(nums, ans, curr, check);
                curr.remove(curr.size()-1);
                check[i] = false;
            }
        }
    }
}