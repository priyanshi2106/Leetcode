class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //TLE
        // List<Integer> ans = new ArrayList<>();
        // char p1[] = p.toCharArray();
        // Arrays.sort(p1);
        // String p2 =String.valueOf(p1);
        // int n = p.length();
        // for(int i = 0; i <= s.length()-n; i++){
        //     String s1 = s.substring(i, n+i);
        //     char c[] = s1.toCharArray();
        //     Arrays.sort(c);
        //     String sorted = new String(c);
        //     if(sorted.equals(p2)){
        //         ans.add(i);
        //     }
        // }
        // return ans;
        
        //T: O(N) -> N is length of S
        //S: O(K)         
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> pCount = new HashMap<>();
        HashMap<Character, Integer> sCount = new HashMap<>();
        //filling pCount
        for(char c : p.toCharArray()){
            if(!pCount.containsKey(c)){
                pCount.put(c, 1);
            }
            else{
                pCount.put(c, pCount.get(c) +1);
            }
        }
        //Sliding window: we add one char at a time from right to sCount and remove           one from left if the size of sCount is more than pCount
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(sCount.containsKey(ch)){
                sCount.put(ch, sCount.get(ch)+1);
            }
            else{
                sCount.put(ch, 1);
            }
            //Now check if the i > p.length
            if(i >= p.length()){
                ch = s.charAt(i-p.length());
                if(sCount.get(ch) == 1){
                    sCount.remove(ch);
                }
                else{
                    sCount.put(ch, sCount.get(ch)-1);
                }
            }
            //Compare the hashmaps
            if(pCount.equals(sCount)){
                ans.add(i-p.length() +1);
            }
        }
        return ans;
    }
}