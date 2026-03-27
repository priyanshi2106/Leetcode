class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // int ans[] = new int[k];
        //  HashMap<Integer, Integer> hm = new HashMap<>();
        // for(int n : nums){
        //     if(!hm.containsKey(n)){
        //         hm.put(n, 1);
        //     }
        //     else{
        //         hm.put(n, hm.get(n)+1);
        //     }
        // }
        // //sort hashmap but it will take O(nlogn)
        // List<Integer> list = new ArrayList<>(hm.keySet());
        // Collections.sort(list, (a,b) -> hm.get(b)- hm.get(a));
        // for(int i = 0; i < k; i++){
        //     ans[i] = list.get(i);
        // }
        // return ans;
        
        //                        BUCKET SORT
        //T: O(n)
        //S: O(n)
      HashMap<Integer, Integer> hm = new HashMap<>();
        int ans[] = new int[k];
      for(int n: nums){
        if(!hm.containsKey(n)){
            hm.put(n,1);
        }
        else{
            hm.put(n, hm.get(n)+1);
        }
      }

      List<Integer> [] bucket = new List[nums.length+1];
      for(int i = 0; i < bucket.length; i++){
        bucket[i] = new ArrayList<>();
      }
      //add to bucket
      for(int key: hm.keySet()){
        bucket[hm.get(key)].add(key);
      }

      List<Integer> flattened = new ArrayList<>();

      for(int i = bucket.length-1; i>=0; i--){
        for(int n: bucket[i]){
            flattened.add(n);
        }
      }
      for(int i = 0 ; i < k; i++){
        ans[i] = flattened.get(i);
      }
      return ans;

    }
} 