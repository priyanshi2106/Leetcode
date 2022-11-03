class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n: nums){
            if(!hm.containsKey(n)){
                hm.put(n,1);
            }
            else{
                int val = hm.get(n);
                hm.put(n, val+1);
            }
        }
        int ans[] = new int[nums.length];
        //Make a list and add the values from HashMap to it and then sort this list using lambdas and collections.sort.
        List<Integer> list = new ArrayList<>(hm.keySet());
        Collections.sort(list, (a,b) ->{return (hm.get(a) == hm.get(b))? b-a: hm.get(a) - hm.get(b);
                                       });
        
//         for(int i = 0; i < nums.length; i++){
            
//             ans[i] = list.get(i);
//         }
//         return ans;
        int i = 0;
        for (int num : list) {
            for (int j = 0; j < hm.get(num); j++) {
                ans[i++] = num;
            }
        }
        return ans;
    }
}