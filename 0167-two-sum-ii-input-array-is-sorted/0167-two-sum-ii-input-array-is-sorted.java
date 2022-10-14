class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
      for(int i = 0; i < numbers.length; i++){
             hm.put(numbers[i], i+1);
        }
        for(int i = 0; i < numbers.length; i++){
            int val = target - numbers[i];
            if(hm.containsKey(val)){
                return new int[]{ i+1, hm.get(val)};
                
            }
            
        }
        return new int[]{-1,-1};
    }
}