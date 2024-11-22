class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n: arr){
            if(!hm.containsKey(n)){
                hm.put(n,1);
            }
            hm.put(n, hm.get(n)+1);
        }
        //now store the values in hasset
        //since hashset will not store duplicate thus we can check size
        HashSet<Integer> set = new HashSet<>(hm.values());
        return (hm.size() == set.size());
    }
}