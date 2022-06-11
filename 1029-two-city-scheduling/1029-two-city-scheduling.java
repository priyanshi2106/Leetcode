class Solution {
    public int twoCitySchedCost(int[][] costs) {
        //first take out the total cost by adding all cost[0]
        int total = 0;
        int n = costs.length/2;
        int savings[] = new int[n*2];
        int i = 0;
        for(int cost[]:costs){
            //savings = costB- coatA
            //if savings is -ve that means we would choose to select costB because that saves us money 
            savings[i++] = cost[1] - cost[0];
            total += cost[0];
        }
        //sort the savings array
        Arrays.sort(savings);
        for(int j = 0; j < n; j++){
            total += savings[j];
        }
        return total;
    }
}