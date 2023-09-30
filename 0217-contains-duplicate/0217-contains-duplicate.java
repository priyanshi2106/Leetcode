class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], 1);
            }
            else{
                int val = hm.get(nums[i]);
                hm.put(nums[i], val+1);
                flag = true;
            }
        }
       return flag;
    }
}