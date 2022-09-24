class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
       List<List<Integer>> res = new ArrayList<>();
        List<Integer> combSum = new ArrayList<>();
        Arrays.sort(candidates);
        helper(res, target, candidates, combSum,0);
        return res;
    }
    public void helper(List<List<Integer>> res, int target, int candidates[], List<Integer> combSum, int start){
        if(target < 0){
            return;
        }
        if(target == 0){
            res.add(new ArrayList<>(combSum));
          //  return;
        }
        else{
          for(int i = start; i < candidates.length; i++){
            combSum.add(candidates[i]);
            helper(res, target-candidates[i], candidates, combSum,i);
            combSum.remove(combSum.size()-1);
        }  
        }
        
    }
}