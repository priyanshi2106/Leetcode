class Solution {
    public int lengthOfLIS(int[] nums) {
//         //T: O(n^2)
//         // S:O(N)
//         int dp[] = new int[nums.length];
//         //fill this dp array with values of 1 which is initial value
//         Arrays.fill(dp,1);
//         for(int i = 1; i < nums.length; i++){
//             for(int j = 0; j < i; j++){
                
//                 if(nums[i] > nums[j]){
//                     dp[i] = Math.max(dp[i], dp[j]+1);
//                 }
//             }
//         }
//         int longest = 0;
//         for(int c:dp){
//             longest = Math.max(longest, c);
//         }
//         return longest;
        
        //Binary Search
        //T: O(nlogn)
        //S: O(n)
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);
        
        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            if(num > sub.get(sub.size()-1)){
                sub.add(num);
            }
            else{
                int j = binarySearch(sub, num);
                sub.set(j, num);
            }
        }
        return sub.size();
    }
    public int binarySearch(ArrayList<Integer> sub, int num){
        int left = 0;
        int right = sub.size()-1;
        while(left < right){
            int mid = (left + right)/2;
            if(sub.get(mid) == num){
                return mid;
            }
            if(sub.get(mid) < num){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return right;
    }
    
}