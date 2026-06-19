class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length() == 1){
        return 1;
       }
       HashMap<Character, Integer> hm = new HashMap<>();
       int i = 0;
       int j = 0;
       int ans = 0;
       while(j < s.length()){
        if(!hm.containsKey(s.charAt(j))){
            hm.put(s.charAt(j), j);
            ans = Math.max(ans, hm.size());
            j++;
        }
        else{
            hm.remove(s.charAt(i));
            i++;
        }
       }
       return ans;
    }
}