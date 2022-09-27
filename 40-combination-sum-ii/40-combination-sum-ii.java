class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        //boolean used[] = new boolean[candidates.length];
        Arrays.sort(candidates);
        backtrack(res, comb, target, 0, candidates);
        return res;
    }
    public void backtrack(List<List<Integer>> res, List<Integer> comb, int target, int start, int candidates[]){
        if(target < 0){
            return;
        }
       if(target == 0){
            res.add(new ArrayList<>(comb));
           // return;
        }
        else{
            for(int i = start; i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i-1]){
                    continue;
                }
               // used[i] = true;
                comb.add(candidates[i]);
                backtrack(res, comb, target-candidates[i], i+1, candidates);
                comb.remove(comb.size()-1);
            }
        }
    }
}
//not using used array here because in that case both the ones as shown in first example will have used[i] = false initially and both of them will be added and we do not want that