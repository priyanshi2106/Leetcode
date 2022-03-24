class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> merged = new LinkedList<>();
        int temp[] = newInterval;
        for(int [] interval: intervals){
            // if(merged.isEmpty()){
            //     merged.add(interval);
            // }
            if(interval[0] > temp[1]){
                merged.add(temp);
                temp = interval;
            }
            else if(interval[1] < temp[0]){
                merged.add(interval);
            }
            else{
                temp[1] = Math.max(interval[1],newInterval[1]);
                temp[0] = Math.min(interval[0],newInterval[0]);
            }
        }
        merged.add(temp);
        return merged.toArray(new int[merged.size()][]);
    }
}