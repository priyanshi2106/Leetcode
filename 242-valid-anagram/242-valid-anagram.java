class Solution {
    public boolean isAnagram(String s, String t) {
        //O(nlogn)
        if(s.length() != t.length()){
            return false;
        }
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();
        // sorting O(log n)
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i = 0; i < c1.length;i++){
            if(c1[i] != c2[i]){  // O(n)
                return false;
            }
        }
        return true;
    }
}