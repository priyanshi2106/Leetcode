class Solution {
    public int deleteAndEarn(int[] nums) {
        //S: O(n)
        //T: O(nlogn)

        //idea is to have a hashmap that stores the freq of each number
        //create a new array with no duplicates and sort it so it is easier to cache the result
        //go through the new array and see if we can take adjascent number or not

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) {
            if (!hm.containsKey(n)) {
                hm.put(n, 1);
            } else {
                hm.put(n, hm.get(n) + 1);
            }
        }

        //instead of array define list so we can access the points in O(1)
        List<Integer> points = new ArrayList<>(hm.keySet());
        Collections.sort(points);
        int[] dp = new int[points.size() + 1];

        dp[0] = points.get(0) * hm.get(points.get(0));
        if (points.size() == 1) {
            return dp[0];
        }
        dp[1] = (points.get(1) - 1 == points.get(0)) ? Math.max(dp[0], points.get(1) * hm.get(points.get(1)))
                : dp[0] + points.get(1) * hm.get(points.get(1));

        for (int i = 2; i < points.size(); i++) {
            if (points.get(i) - 1 == points.get(i - 1)) {
                //adjascent numbers we cant take the right value
                dp[i] = Math.max(dp[i - 1], points.get(i) * hm.get(points.get(i)) + dp[i - 2]);
            } else {
                 //can take adjascent number
                dp[i] = dp[i - 1] + points.get(i) * hm.get(points.get(i));
            }
        }
        return dp[points.size()-1];

    }
}