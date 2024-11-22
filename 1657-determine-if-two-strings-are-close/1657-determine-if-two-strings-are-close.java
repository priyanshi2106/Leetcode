class Solution {
    public boolean closeStrings(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        if(len1 != len2){
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(char w1: word1.toCharArray()){
            if(!hm.containsKey(w1)){
                hm.put(w1,1);
            }
            hm.put(w1, hm.get(w1)+1);
        }
        for(char w2: word2.toCharArray()){
            if(!hm2.containsKey(w2)){
               hm2.put(w2, 1);
            }
            hm2.put(w2, hm2.get(w2)+1);
        }
        //check keys for both hashmaps
        if(!hm.keySet().equals(hm2.keySet())){
            return false;
        }
        //sort the values for both hashmaps
        List<Integer> l1 = new ArrayList<>(hm.values());
        List<Integer> l2 = new ArrayList<>(hm2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);
    }
}