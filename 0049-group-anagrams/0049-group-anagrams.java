class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> res = new ArrayList<>();
        // HashMap<String, List<String>> hm = new HashMap<>();
        // if(strs.length == 0){
        //     return res;
        // }
        // for(String s : strs){
        //     char c[] = s.toCharArray();
        //     Arrays.sort(c);
        //     String sorted = new String(c);
        //     if(!hm.containsKey(sorted)){
        //         hm.put(sorted, new ArrayList<>());
        //     }
        //     hm.get(sorted).add(s);
        // }
        // res.addAll(hm.values());
        // return res;

//Optimized solution

        //We will make string representations of the freq of each char 
        //so first make a count array and fill it
        //T:O(nk)
        //S: O(nk) total info stored in hm
        List<List<String>> ans = new ArrayList<>();
        if(strs.length == 0){
            return new ArrayList();
        }
        HashMap<String, List<String>> hm = new HashMap<>();
        int count [] = new int[26];
        for(String s: strs){
            //reset array for each string
            Arrays.fill(count, 0);
            //building the freq for each char
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < 26; i++){
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!hm.containsKey(key)){
                hm.put(key, new ArrayList<>());
            }
                hm.get(key).add(s);
        }
         ans.addAll(hm.values());
        return ans;
       
    }
}