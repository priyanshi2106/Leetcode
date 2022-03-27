class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int ans = -1;
        
       char c[] = s.toCharArray();
        for(int i = 0; i< c.length;i++){
            if(!hm.containsKey(c[i])){
                hm.put(c[i],1);
            }
            else{
                int val = hm.get(c[i]);
                hm.put(c[i],val+1);
            }
            //hm.put(c[i],hm.getOrDefault(c[i],0)+1);
        }
        for(int i = 0; i<s.length();i++){
            int val = hm.get(c[i]);
            if(val == 1){
                ans = i;
                return ans;
            }
           
        }
        return ans;
    }
}