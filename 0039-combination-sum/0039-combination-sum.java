class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(target, ans, new ArrayList<>(), 0, candidates);
        return ans;
    }
    public void backtrack(int target, List<List<Integer>> ans, List<Integer> curr, int start, int[] candidates){
        if(target == 0){
            ans.add(new ArrayList(curr));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = start; i < candidates.length; i++){
            curr.add(candidates[i]);
            backtrack(target-candidates[i], ans, curr, i, candidates);
            curr.removeLast();
        }
    }
}