class Solution {
    public int lengthOfLIS(int[] nums) {
        //    int dp[] = new int[nums.length+1];
        //    Arrays.fill(dp, 1);
        //    for(int i = 1; i < nums.length; i++){
        //     for(int j = 0; j < i; j++){
        //         if(nums[i] > nums[j]){
        //             dp[i] = Math.max(dp[i], dp[j]+1);
        //         }
        //     }
        //    }
        //    //find the max from dp and return that
        //    int longest = 0; 
        //    for(int i: dp){
        //     if(i > longest){
        //         longest = i;
        //     }
        //    }
        //    return longest;

        //if nums[i] > dp[at last index]
        //add it to the list if not then binary search and find the nums[i] in dp list or any element just greater to nums[i]

        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > dp.get(dp.size() - 1)){
                dp.add(nums[i]);
            }
            else{
                int j = binarySearch(nums[i], dp);
                //replacing the num in dp with the new num
                dp.set(j, nums[i]);
            }
        }
        return dp.size();
    }
    public int binarySearch(int num, ArrayList<Integer> dp){
        int low = 0;
        int high = dp.size()-1;
        while(low < high){
            int mid = (low+high)/2;
            if(num == dp.get(mid)){
                return mid;
            }
            else if(num > dp.get(mid)){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}