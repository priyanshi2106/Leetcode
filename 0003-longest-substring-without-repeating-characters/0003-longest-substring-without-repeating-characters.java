class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                j++;
                max = Math.max(max, hs.size());
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return max;
        //T: O(n)
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