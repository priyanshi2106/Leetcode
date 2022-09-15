class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> hs = new HashSet<>();
        for(int num : nums){
           hs.add(num);
            
        }
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int currStreak = 1;
            if(!hs.contains(curr-1)){
                while(hs.contains(curr+1)){
                    curr += 1;
                    currStreak += 1;
                }
            }
            longest = Math.max(longest, currStreak);
        }
        return longest;
    }
}