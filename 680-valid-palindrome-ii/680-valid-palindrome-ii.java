class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() == 0){
            return false;
        }
       
//         if(!isPalindrome(s)){
//             //try removing one character from it
//             // first add the freq of each char in a hashmap
//             //not efficient, will take extra memory
//             HashMap<Character,Integer> hm = new HashMap<>();
//            for(int i = 0; i< s.length(); i++){
//                 if(!hm.containsKey(s.charAt(i))){
//                     hm.put(s.charAt(i),1);
//                 }
//                else{
//                    int val = hm.get(s.charAt(i));
//                    hm.put(s.charAt(i), val+1);
//                }
//            }
//             // if freq of any char is odd then try removing that char
//             int indx = -1;
//             for(int i = 0; i< hm.size(); i++){
//                 if(hm.get(s.charAt(i))%2 != 0){
//                     indx = i;
//                     String ns = s.substring(0,i) + s.substring(i+1,s.length()+1);
//                     if(isPalindrome(ns)){
//                         return true;
//                     }
                    
//                 }
//                 return false;
//             }
            
//         }
        
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
              //Found a mismatched pair - try both deletions
                return( isPalindrome(s, i, j-1) || isPalindrome(s,i+1,j));
            }
            i++;
            j--;
        }
        return true;
        
    }
    public boolean isPalindrome(String s ,int i, int j){
       
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
       
    }
}