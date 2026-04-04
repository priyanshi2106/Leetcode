class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //cant use arrays directly as we do not know the size of the ans array
       ArrayList<int[]> ans = new ArrayList<>();
       int i = 0;
       //no overlapping
       while(i<intervals.length && intervals[i][1] < newInterval[0]){
        ans.add(intervals[i]);
        i++;
       }
       //overlapping
       while( i < intervals.length && intervals[i][0]<= newInterval[1]){
        newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
        newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
        i++;
       }
       ans.add(newInterval);
       while(i < intervals.length){
        ans.add(intervals[i]);
        i++;
       }
       return ans.toArray(new int[ans.size()][]);
           }
}