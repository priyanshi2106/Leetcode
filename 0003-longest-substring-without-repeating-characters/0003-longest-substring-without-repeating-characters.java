class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int max = 0;
        int j = 0;
        int i = 0;
        int count = 0;
        while(i <= j && j < s.length()){
            //check for the char in hm, if present that means we already have that in pur substring
            if(!hm.containsKey(s.charAt(j))){
                  hm.put(s.charAt(j), j);
                max = Math.max(max, hm.size());
                j++;
            }
            else{
                //count++;
                hm.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}