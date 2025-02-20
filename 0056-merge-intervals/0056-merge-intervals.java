class Solution {
    public int[][] merge(int[][] intervals) {
        //time: O(nlogn)
        //space: O(n)
        if(intervals.length <=1 ){
            return intervals;
        }
        List<int []> ans = new LinkedList<>();
        //sorting the arrays based on first element in the array
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]) );

        for(int i[]: intervals){
            if(ans.isEmpty() || ans.getLast()[1] < i[0]){
                ans.add(i);
            }
            else{
                //merge and change the ending index to the greater value
                ans.getLast()[1] = Math.max(i[1], ans.getLast()[1]);
            }
        }
        return ans.toArray(new  int[ans.size()][]);
    }
}