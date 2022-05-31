class Solution {
    public int arrayPairSum(int[] nums) {
        //time complexity will be O(nlogn) as we used the inbuilt sorting function
//        Arrays.sort(nums);
//         int n = nums.length;
//         int size = n/2;
//         //1,2,2,5,6,6
        
//         int j = n-1;
//         int sum = 0;
//         int min = Integer.MAX_VALUE;
//         for(int i = 1; i < n; i = i+2){
//             min = Math.min(nums[i], nums[i-1]);
//             sum = sum + min;
//         }
//         return sum;
        
        // sorting the array first by using sounting sort like algo so time complexity is O(n)

        int exist[] = new int[20001];
        int sum = 0;
        // accounting for negative numbers as well as it is mentioned in the question
        for(int i = 0; i < nums.length; i++){
            exist[nums[i]+10000]++;
        }
        boolean shouldpick = true;
        for(int i = 0; i < exist.length; i++){
            while(exist[i] > 0){
                if(shouldpick){
                    sum = sum + i-10000;
                }
                shouldpick = !shouldpick;
                exist[i]--;
            }
        }
        return sum;
    }
}