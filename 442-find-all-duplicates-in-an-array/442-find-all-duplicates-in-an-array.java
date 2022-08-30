class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // T:O(n)
        //S:O(1)
        List<Integer> ll = new LinkedList<>();
        for(int i = 0; i < nums.length; i++){
            int newIndex = Math.abs(nums[i])-1;
            if(nums[newIndex] < 0){
                // if it is already negative mtlab dekha hua. hai ise hmne
                ll.add(newIndex+1);
                 
            }
           nums[newIndex] = -nums[newIndex];
        }
        return ll;
    }
}