class Solution {
    public int minMeetingRooms(int[][] intervals) {
        //T:O(NlogN) S:O(N)
        int start[] = new int[intervals.length];
        int end[] = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0, j = 0;
        int rooms = 0;
        while(i < intervals.length && j < intervals.length){
            if(start[i] < end[j]){
                //overlaping
                rooms++;
                i++;
            }
            else{
                i++;
                j++;
            }
        }
        return rooms;
    }
}
//[2,4], [7,10]