class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        if(s.length() != t.length()){return false;}

        for(int i = 0; i < s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0; i < t.length(); i++){
             hm.put(t.charAt(i), hm.get(t.charAt(i)-1));
            if(!hm.containsKey(t.charAt(i)) || hm.get(t.charAt(i)) == 0){
                return false;
            }
          
        }
        return true;
    }
}