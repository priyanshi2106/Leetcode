class Solution {
    public int longestArithSeqLength(int[] nums) {
        // int ans = 2;
        // int n = nums.length;
        // //Now we will define an array of HashMaps
        // HashMap<Integer, Integer>[] dp = new HashMap[n];
        // int maxValue = 1;
        // //now in question it says that there will be atleast 2 elements in the array             at all times so the maxValue has to be 2 in the default case.
        // for(int i = 0; i < n; i++){
        //     int currElement = nums[i];
        //     //Now we will take diff of this currElement with every prev number in the               array and check if that diff was seen before in the hashmap of that prev               element. If it was we just simply add one to the prev value, if not then               we initialize it with 1.
        //     dp[i] = new HashMap<>();
        //     HashMap<Integer, Integer> currMap = dp[i];
        //     //creating hashmap for this curr element
        //     for(int j = 0; j < i; j++){
        //         int diff = currElement - nums[j];
        //         //we want hashmap of prev element
        //         HashMap<Integer, Integer> prevMap = dp[j];
        //         int newValue = prevMap.getOrDefault(diff, 0)+1;
        //         currMap.put(diff, newValue);
        //         dp[i] = currMap;
        //         maxValue = Math.max(maxValue, currMap.get(diff));
        //     }
        // }
        // return maxValue+1;
        //This one accounts for the case when we know that the maxValue of any diff that we got was for example 3 and it was 3 times then we would have had 4 numbers originally to get the diff 3 three times.
       
        //minimum sequence is 2 because any two numbers can be a sequence for ex: 1,2 or 1,10 or 2,7 it is a sequence
        int res = 2, n = nums.length;
        //define an array of hashmaps for a difference with previous numbers - hashmap key as difference, value as a counter
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        //outer loop - interate through numbers
        for (int j = 0; j < nums.length; j++) {
            //create a hashmap
            dp[j] = new HashMap<>();
            //iterate from beginning to find a difference with all previous numbers
            for (int i = 0; i < j; i++) {
                int d = nums[j] - nums[i];
                //for the difference, look in the "i"th hashmap if that difference exist, if it does, increment the counter
                //dp: [{},{1:2},{2:2,3:2},{3:3,5:2,6:2},{1:2,4:2,6:2,7:2}] check 3:3 for 4, 7, 10
                dp[j].put(d, dp[i].getOrDefault(d, 1) + 1);
                //take max 
                res = Math.max(res, dp[j].get(d));
            }
        }
        return res;
    }
}