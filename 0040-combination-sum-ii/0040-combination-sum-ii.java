class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans =new  ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, ans, new ArrayList<>(), target, 0);
        return ans;
    }
    public void backtrack(int candidates[], List<List<Integer>> ans, List<Integer> curr, int target, int start){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            
        }
        if(target < 0){
            return;
        }
        else{for(int i = start; i < candidates.length; i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            curr.add(candidates[i]);
            backtrack(candidates, ans, curr, target-candidates[i], i+1);
            curr.removeLast();
        }}
    }
}