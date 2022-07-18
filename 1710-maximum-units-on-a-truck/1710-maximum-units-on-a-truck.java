class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //sort the array so as to get the maximum number of units
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        //b[1] -a[1] bcs we need descending order
        int maxUnits = 0;
        for(int box[] : boxTypes){
            if(truckSize < box[0]){
                return maxUnits + truckSize*box[1];
            }
            maxUnits += box[1] * box[0];
            truckSize -= box[0];
        }
        return maxUnits;
    }
    
}