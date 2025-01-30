class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(!hm.containsKey(nums[i])){
        //         hm.put(nums[i], 1);
        //     }
        //     else{
        //         hm.put(nums[i], hm.get(nums[i]+1));
        //     }
        // }
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            if(hm.getOrDefault(k-x, 0) > 0){
                hm.put((k-x), hm.get(k-x)-1);
                count++;
            }
            else{
                hm.put(x, hm.getOrDefault(x,0)+1);
            }
        }
        return count;
    }
}