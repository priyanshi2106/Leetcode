class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList();
        //initializing the arrayList first
        for(int i = 0; i < rowIndex+1; i++){ //third row has 4 elements
            ans.add(1);
        }
        for(int i = 0; i < rowIndex; i++){
            for(int j = i; j > 0; j--){
                ans.set(j,ans.get(j)+ans.get(j-1));
            }
        }
        return ans;
    }
}