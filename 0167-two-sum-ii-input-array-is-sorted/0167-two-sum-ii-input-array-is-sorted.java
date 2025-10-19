class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Not really efficient solution because we are using O(n) space to store the           numbers in the hashmap
        //T: O(n)
        //S: O(n)
//         HashMap<Integer, Integer> hm = new HashMap<>();
//       for(int i = 0; i < numbers.length; i++){
//              hm.put(numbers[i], i+1);
//         }
//         for(int i = 0; i < numbers.length; i++){
//             int val = target - numbers[i];
//             if(hm.containsKey(val)){
//                 return new int[]{ i+1, hm.get(val)};
                
//             }
            
//         }
//         return new int[]{-1,-1};
        
        //Using two pointers
        int i = 0;
        int j = numbers.length-1;
        while(i <= j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                return new int[]{i+1, j+1};
            }
            else if(sum < target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}