class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        
        //boolean used[] = new boolean[n];
        List<Integer> comb = new ArrayList<>();
        helper(n, k, 1, comb, res);
        return res;
    }
    public void helper(int n, int k, int start, List<Integer> comb, List<List<Integer>> res){
        if(k == 0){
            res.add(new ArrayList<>(comb));
            return;
        }
        for(int i = start; i <= n; i++){
            
            comb.add(i);
            //used[i] = true;
            helper(n, k-1, i+1, comb, res);
            comb.remove(comb.size()-1);
        }
        
        
    }
}