class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //cant use arrays directly as we do not know the size of the ans array
        ArrayList<int[]> ans = new ArrayList<>();
        int i = 0;
        //no overlapping
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        // if overlapping happens - calculate newInterval 
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;

        }
        ans.add(newInterval);
        //this makes sure even if we do not have overlapping case newInterval gets added

        //no overlapping after we merge
        while (i < intervals.length) {
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);

    }
}