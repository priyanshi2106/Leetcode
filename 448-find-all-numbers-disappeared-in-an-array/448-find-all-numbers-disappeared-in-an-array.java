class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        LinkedList<Integer> ll = new LinkedList<>();
        for(int num : nums){
            hm.add(num);
        }
        int range = nums.length+1;
        for(int i = 1; i< range; i++){
            if(!hm.contains(i)){
                ll.add(i);
            }
        }
        return ll;
    }
}