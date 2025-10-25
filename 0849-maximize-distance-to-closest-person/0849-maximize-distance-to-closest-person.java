class Solution {
    public int maxDistToClosest(int[] seats) {
        int j = 0;
        int i = 0;
        int max = 0;
        int prevOne = -1;
        while(i < seats.length && j < seats.length){
            if(seats[j] == 1){
                prevOne = j;
                i = j;
                 j++;
            }
            else{
                int ans = j-i/2;
                max = Math.max(max, ans);
               j++;
            }
             
        }
        return max;
    }
}