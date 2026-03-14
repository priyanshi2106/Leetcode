class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] -b[0]);
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        minPq.add(intervals[0][1]);

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= minPq.peek()){
                //can use the same room
                minPq.poll();
            }
            //add the last meeting in here
            minPq.add(intervals[i][1]);
        }
        return minPq.size();
    }
}