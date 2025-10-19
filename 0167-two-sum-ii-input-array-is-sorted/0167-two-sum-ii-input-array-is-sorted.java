class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int x = target - numbers[i];
            if(!hm.containsKey(x)){
                hm.put(numbers[i], i+1);
            }
            else{
                ans[0] = hm.get(x);
                ans[1] = i+1;
            }
        }
        return ans;
    }
}