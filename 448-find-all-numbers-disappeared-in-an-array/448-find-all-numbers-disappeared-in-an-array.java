class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Time: O(n)
        //S: O(n)
      // HashSet<Integer> hs = new HashSet<>();
         LinkedList<Integer> ll = new LinkedList<>();
      //   int n = nums.length;
      //   //first add all the values into hashset
      //   for(int i = 0; i < n; i++){
      //       hs.add(nums[i]);
      //   }
      //   for(int i = 1; i < n+1; i++){
      //       if(!hs.contains(i)){
      //           ll.add(i);
      //       }
      //   }
      //   return ll;
        
        //T:O(n)
        //S:O(1)
//         8
//         [4,3,2,7,8,2,3,1]
//          0,1, 2, 3, 4, 5, 6, 7   
            
//         [-4,-3,-2,-7,-8,2,3,-1]
//           0. 1. 2. 3  4.5. 6  7
            
            for(int i = 0; i < nums.length; i++){
                int newIndex = Math.abs(nums[i])-1;
                if(nums[newIndex] > 0){
                    nums[newIndex]*= -1;
                }
            }
        for(int i = 1; i < nums.length+1; i++){
            if(nums[i-1] >0){
                ll.add(i);
            }
        }
        return ll;
    }
}