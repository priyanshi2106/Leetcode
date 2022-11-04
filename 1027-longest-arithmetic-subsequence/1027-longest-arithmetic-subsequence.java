class Solution {
    public int longestArithSeqLength(int[] nums) {
        
        //EXPLANATION OF THE ALGORITHM IN THE NOTES!
        
        
        //T: O(n^2)
        //S: O(n^2)
        int ans = 2;
        int n = nums.length;
        //Now we will define an array of HashMaps
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        int maxValue = 1;
        //now in question it says that there will be atleast 2 elements in the array             at all times so the maxValue has to be 2 in the default case.
        for(int i = 0; i < n; i++){
            int currElement = nums[i];
            //Now we will take diff of this currElement with every prev number in the               array and check if that diff was seen before in the hashmap of that prev               element. If it was we just simply add one to the prev value, if not then               we initialize it with 1.
            dp[i] = new HashMap<>();
            HashMap<Integer, Integer> currMap = dp[i];
            //creating hashmap for this curr element
            for(int j = 0; j < i; j++){
                int diff = currElement - nums[j];
                //we want hashmap of prev element
                HashMap<Integer, Integer> prevMap = dp[j];
                int newValue = prevMap.getOrDefault(diff, 0)+1;
                currMap.put(diff, newValue);
                dp[i] = currMap;
                maxValue = Math.max(maxValue, currMap.get(diff));
            }
        }
        return maxValue+1;
        //This one accounts for the case when we know that the maxValue of any diff that we got was for example 3 and it was 3 times then we would have had 4 numbers originally to get the diff 3 three times.
    }
}