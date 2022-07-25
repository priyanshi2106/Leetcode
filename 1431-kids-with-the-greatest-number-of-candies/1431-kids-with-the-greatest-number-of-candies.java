class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        ArrayList<Boolean> result = new ArrayList<>();
        for(int i : candies){
            if(i > max){
                max = i;
            }
        }
        for(int i : candies){
            if(extraCandies + i >= max){
               result.add(true);
            }
            else{
                result.add(false);
            }
            
        }
        return result;
    }
}