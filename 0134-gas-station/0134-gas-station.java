class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //first check the sum of both the array
        //if sum(gas) >= sum(cost) 
        //then the loop exists otherwise it will not
        int surplus = 0;
        int total_surplus = 0;
        int n = gas.length;
        int start_point = 0;
        for(int i = 0; i < n; i++){
            surplus += gas[i] - cost[i];
            total_surplus += gas[i] - cost[i];
            if(surplus < 0){
                surplus = 0;
                start_point = i+1;
            }
        }
        return (total_surplus < 0) ? -1 : start_point;
    }
}
//gas-cost+gas_new
//gas = [1,2,3,4,5]
//cost = [3,4,5,1,2]
// Now here cost[0] means we would need 3 units of gas to move to next station.
// Therefor, we can say that gas[i] >= cost[i] in order to start our journey from that point.
// At each point keep a track of surplus fuel that you have bcs that will determine if we can move forward or not.
//So whenever the surplus(gas[i]-cost[i]) is negative, we set it to 0 again bcs we are not going to choose that point.
