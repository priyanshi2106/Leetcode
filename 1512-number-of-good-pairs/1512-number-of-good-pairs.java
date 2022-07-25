class Solution {
    public int numIdenticalPairs(int[] nums) {
        //First count the frequency of each number and then count the pairs using the formula => n(n-1)/2
        int freq[] = new int[101];
        int ans = 0;
        for(int i : nums){
            freq[i]++;
        }
        for(int n: freq){
            ans += (n * (n-1))/2;
        }
        return ans;
    }
}