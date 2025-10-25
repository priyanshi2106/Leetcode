class Solution {
    public int maxDistToClosest(int[] seats) {
        int prev = -1;
        int max = 0;
        int n = seats.length;
        for(int i = 0; i < n; i++){
            //loop through each seat
            if(seats[i] == 1){
                //seat at curr index is not empty..
                //check if there was an occupied seat before this
                if(prev == -1){
                    //first seat occupied from 0 to i-1 so max dist is i as 
                    // person can sit at index 0
                    max = i;
                }
                else{
                    max = Math.max(max, (i-prev)/2);
                }
                prev = i;
            }
        }
         // After the loop, consider trailing empty seats after the last 1
        // 'n - 1 - prev' = empty seats from the last occupied seat to the end
        max = Math.max(max, (n-1-prev));
        return max;
    }
}