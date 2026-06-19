class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //O(n) space
        //     int ans[] = new int[2];
        //     HashMap<Integer, Integer> hm = new HashMap<>();
        //     for(int i = 0; i < numbers.length; i++){
        //         int x = target - numbers[i];
        //         if(!hm.containsKey(x)){
        //             hm.put(numbers[i], i+1);
        //         }
        //         else{
        //             ans[0] = hm.get(x);
        //             ans[1] = i+1;
        //         }
        //     }
        //     return ans;

        //binary search

        int left = 0;
        int right = numbers.length - 1;
        int ans[] = new int[2];
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                ans[0] = left+1;
                ans[1] = right + 1;
                return ans;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[] {-1,-1};
    }

}
