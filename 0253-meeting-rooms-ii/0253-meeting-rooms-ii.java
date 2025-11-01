class Solution {
    public int minMeetingRooms(int[][] intervals) {
        // Instead of manually iterating on every room that's been allocated and
        // checking if the room is available or not, we can keep all the rooms in a min
        // heap where the key for the min heap would be the ending time of meeting.
       Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       pq.add(intervals[0][1]);
       for(int i = 1; i < intervals.length; i++){
        //no conflict
        if(intervals[i][0] >= pq.peek()){
            pq.poll();
        }
        pq.add(intervals[i][1]);
       }
       return pq.size();
    }
}