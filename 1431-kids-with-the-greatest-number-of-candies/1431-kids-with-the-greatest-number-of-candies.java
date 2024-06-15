class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxCandyVal = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > maxCandyVal){
                maxCandyVal = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= maxCandyVal){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}