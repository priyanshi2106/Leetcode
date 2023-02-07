class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = nums[0];
        for(int n :  nums){
            if(hm.containsKey(n)){
                hm.put(n, hm.get(n) + 1);
                if(hm.get(n) > nums.length/2){
                    ans = n;
                }
            }
            else{
                hm.put(n,1);
            }
        }
        return ans;
    }
}