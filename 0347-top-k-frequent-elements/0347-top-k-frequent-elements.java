class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
         HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n : nums){
            if(!hm.containsKey(n)){
                hm.put(n, 1);
            }
            else{
                hm.put(n, hm.get(n)+1);
            }
        }
        //sort hashmap but it will take nlogn
        List<Integer> list = new ArrayList<>(hm.keySet());
        Collections.sort(list, (a,b) -> hm.get(b)- hm.get(a));
        for(int i = 0; i < k; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
} 