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
                max = Math.max(max, j-i+1);
                j++;
            }
            else{
                //count++;
                hm.remove(s.charAt(i));
                i++;
            }
        }
        return max;
        ////T: O(n)
        //S: O(n) -> bcs worst case the substring is the whole original string itself
        // int a_pointer = 0;
        // int b_pointer = 0;
        // int max = 0;
        // HashSet<Character> hs = new HashSet<>();
        // //using hashset because lookup time for hashset is O(1)
        // while(b_pointer < s.length()){
        //     if(!hs.contains(s.charAt(b_pointer))){
        //         hs.add(s.charAt(b_pointer));
        //         b_pointer++;
        //         max = Math.max(max, hs.size());
                
        //     }
        //     else{
        //         hs.remove(s.charAt(a_pointer));
        //         //max--;
        //         a_pointer++;
        //     }
        // }
        // return max;
    }
}