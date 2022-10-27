class Solution {
    public int[][] merge(int[][] intervals) {
        //bcs we have to sort it using first element so that is why we use a[0]
    Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for(int []interval: intervals){
            //first we will check if its empty and if not then make sure interval is not overlapping
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            }
            else{
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}