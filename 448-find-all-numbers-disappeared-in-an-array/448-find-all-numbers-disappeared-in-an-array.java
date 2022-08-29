class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      HashSet<Integer> hs = new HashSet<>();
        LinkedList<Integer> ll = new LinkedList<>();
        int n = nums.length;
        //first add all the values into hashset
        for(int i = 0; i < n; i++){
            hs.add(nums[i]);
        }
        for(int i = 1; i < n+1; i++){
            if(!hs.contains(i)){
                ll.add(i);
            }
        }
        return ll;
    }
}