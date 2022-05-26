class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       //Time: O(n)
        // space: O(n)
        // HashSet<Integer> hm = new HashSet<>();
        // LinkedList<Integer> ll = new LinkedList<>();
        // for(int num : nums){
        //     hm.add(num);
        // }
        // int range = nums.length+1;
        // for(int i = 1; i< range; i++){
        //     if(!hm.contains(i)){
        //         ll.add(i);
        //     }
        // }
        // return ll;
        
        //Time: O(n)
        //space: O(1)
        
        List<Integer> ans = new LinkedList<>();
        for(int i = 0; i < nums.length; i++){
            int newIndex = Math.abs(nums[i])-1;
            
            //check if value at this index is already negative
            if(nums[newIndex] > 0){
                nums[newIndex] *= -1;
            }
        }
        for(int i = 1; i <= nums.length; i++){
            if(nums[i-1] > 0){
                ans.add(i);
            }
        }
        return ans;
    }
}