class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();
        if(strs.length == 0){
            return res;
        }
        for(String s: strs){
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(!hm.containsKey(sorted)){
                hm.put(sorted,new ArrayList<>());
            }
            hm.get(sorted).add(s);
        }
        res.addAll(hm.values());
        return res;
        
    }
}