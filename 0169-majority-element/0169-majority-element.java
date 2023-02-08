class Solution {
    public int majorityElement(int[] nums) {
        //T: O(n)
        //S: O(n)
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // int ans = nums[0];
        // for(int n :  nums){
        //     if(hm.containsKey(n)){
        //         hm.put(n, hm.get(n) + 1);
        //         if(hm.get(n) > nums.length/2){
        //             ans = n;
        //         }
        //     }
        //     else{
        //         hm.put(n,1);
        //     }
        // }
        // return ans;
        
        //Boyer-Moore Voting Algorithm
        //T: O(n)
        //S: O(1)
        
        int count = 1;
        int ans = nums[0];
        //Assuming the first element is the answer
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != ans){
                count--;
            }
            else{
                count++;
            }
            if(count == 0){
            ans = nums[i];
                count++;
        }
        }
        
        
        return ans;
    }
}