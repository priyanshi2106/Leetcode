class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        //Brute force
        
        char ans = ' ';
        char c[] = s.toCharArray();
        
        char tt[] = t.toCharArray();
//         Arrays.sort(c);
//         Arrays.sort(tt);
       
//         int i=0,j=0;
//         while(i<c.length){
//             if(c[i] != tt[i]){
//                 return tt[i];
                
//             }
//             i++;
           
//         }
    //    return tt[i];
        
        //Hashmap Time= O(n), space= O(1)
        for(int i =0; i< c.length;i++){
            if(!hm.containsKey(c[i])){
                hm.put(c[i], 1);
            }
            else{
                int val = hm.get(c[i]);
                hm.put(c[i],val+1);
            }
            
        }
        for(int i= 0; i<tt.length;i++){
            if(hm.getOrDefault(tt[i],0) == 0){
                ans = tt[i];
                break;
            }
            else{
           
                hm.put(tt[i],hm.get(tt[i])-1);
            }
            
        }
        return ans;
    }
}