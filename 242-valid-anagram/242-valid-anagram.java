class Solution {
    public boolean isAnagram(String s, String t) {
        // //O(nlogn)
        // if(s.length() != t.length()){
        //     return false;
        // }
        // char c1[] = s.toCharArray();
        // char c2[] = t.toCharArray();
        // // sorting O(log n)
        // Arrays.sort(c1);
        // Arrays.sort(c2);
        // for(int i = 0; i < c1.length;i++){
        //     if(c1[i] != c2[i]){  // O(n)
        //         return false;
        //     }
        // }
        // return true;
        
        // O(n)
        if(s.length() != t.length()){
            return false;
        }
        int counter[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            //For every char in s we will inc the counter but will dec it for every char in t
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(int count : counter){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}