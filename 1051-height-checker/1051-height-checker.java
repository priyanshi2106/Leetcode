class Solution {
    public int heightChecker(int[] heights) {
        // if(heights.length == 0){
        //     return 0;
        // }
        // int expected[] = heights.clone();
        // Arrays.sort(expected);
        // int count = 0;
        // for(int i = 0; i < heights.length; i++){
        //     if(heights[i] != expected[i]){
        //         count++;
        //     }
        // }
        // return count;
        
        int[] bucket = new int[101];
        for(int number : heights) {
            bucket[number]++;
        }
        
        // check the ammount of disparities between the input array and the bucket
        int count = 0, index = 0;
        for(int i = 1; i <= 100; i++) {
            while(bucket[i] > 0) {
                if(i != heights[index++]) count++;
                bucket[i]--;
            }
        }
        return count;
    }
}