class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(target, candidates, ans, new ArrayList<>(),0);
        return ans;
    }
    public void backtrack(int target, int candidates[], List<List<Integer>> ans, List<Integer>curr, int start){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        else if(target < 0){
            return;
        }
        for(int i = start; i < candidates.length; i++){
            curr.add(candidates[i]);
            backtrack(target-candidates[i], candidates,ans, curr, i);
            curr.removeLast();
        }
    }
}