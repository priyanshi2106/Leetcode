class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char ans = ' ';
        char c[] = s.toCharArray();
        
        char tt[] = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(tt);
        // if(tt.length == c.length){
        //     return ans;
        // }
        int i=0,j=0;
        while(i<c.length){
            if(c[i] != tt[i]){
                return tt[i];
                
            }
            i++;
           
        }
        return tt[i];
    }
}