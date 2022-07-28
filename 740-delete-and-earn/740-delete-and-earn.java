class Solution {
    public int deleteAndEarn(int[] nums) {
        //Declare a hashmap that stores the max points we can get from each num in nums[]
        HashMap<Integer, Integer> points = new HashMap<>();
        int MaxNumber = 0;
        //computing the points
        for(int num : nums){
            points.put(num, points.getOrDefault(num,0) + num);
            //Calculate max points side by side
            MaxNumber = Math.max(MaxNumber, num);
        }
        
        //Base Case
        int maxPoints[] = new int[MaxNumber+1];
        maxPoints[1] = points.getOrDefault(1, 0);
        
        for(int i = 2; i < maxPoints.length; i++){
            int curr = points.getOrDefault(i, 0);
            maxPoints[i] = Math.max(maxPoints[i-1], maxPoints[i-2] + curr);
        }
        return maxPoints[MaxNumber];
    }
}