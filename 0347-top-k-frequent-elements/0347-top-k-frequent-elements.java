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
        
        //Bucket Sort 
        //T: O(n)
        //S: O(n)
        
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
        
        //Make a list of arrayas named buckets so that you can store the no in the particular freq represented by the index. Doing so( making the index as freq) will make it easier for us to find the top k elements bcs then we can iterate from the end and see if that index has any element stored in it.
        
        //Creating a bucket and they will store the list of numbers of that freq
        List<Integer> [] buckets = new List[nums.length+1];
        //The size is length + 1 bcs no element is going to have freq of 0 so that is going to remain empty.
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }
        for(int key:hm.keySet()){
            buckets[hm.get(key)].add(key);
        }
        //now create the flattened list of nums in sorted manner and then we will store the values of this list to ans array.
        
        List<Integer> flattened = new ArrayList<>();
        for(int i = buckets.length -1; i >= 0; i--){
            for(int num : buckets[i]){
                flattened.add(num);
            }
        }
        for(int i = 0; i < k; i++){
            ans[i] = flattened.get(i);
        }
        return ans;
    }
} 