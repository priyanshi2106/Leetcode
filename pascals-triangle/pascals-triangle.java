class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        //Base case is that the first row is always 1
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        
        for(int i = 1; i < numRows; i++){
            //define row and prevrow
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = ans.get(i-1);
            
            row.add(1);
            for(int j = 1; j < prevRow.size(); j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);
            ans.add(row);
        }
        return ans;
    }
}