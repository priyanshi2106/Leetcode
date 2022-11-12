class Solution {
    private int count = 0;
    public int countArrangement(int n) {
        //Calculate permutations while also checking for the condition that needs to             be followed
        //T: O(valid permutations)
        //S:(n) depth of recursion tree 
        boolean used[] = new boolean[n+1];
        calculate(used, n, 1);
        return count;
    }
    private void calculate(boolean used[], int n, int pos){
        if(pos > n){
            //we have the permutation, so inc the count.
            count++;
        }
        for(int i = 1; i <= n; i++){
            if(!used[i] && (pos%i == 0 || i% pos == 0)){
                used[i] = true;
                calculate(used, n, pos+1);
                used[i] = false;
            }
        }
       
    }
    
}