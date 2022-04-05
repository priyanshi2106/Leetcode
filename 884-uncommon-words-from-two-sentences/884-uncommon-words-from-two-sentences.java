class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        //Use one HashMap to store both strings and store the freq as well
        HashMap<String,Integer> words = new HashMap<>();
        String a[] = s1.split(" ");
       
       String b[] = s2.split(" ");
       for(int i = 0; i< a.length; i++){
           if(!words.containsKey(a[i])){
               words.put(a[i],1);
           }
           else{
               int value = words.get(a[i]);
               words.put(a[i], value+1);
           }
       } 
        for(int i = 0; i< b.length; i++){
           if(!words.containsKey(b[i])){
               words.put(b[i],1);
           }
           else{
               int value = words.get(b[i]);
               words.put(b[i], value+1);
           }
       }
        ArrayList<String> ans = new ArrayList<>();
        for(String w: words.keySet()){
            if(words.get(w) == 1){
                ans.add(w);
            }
        }
        return ans.toArray(new String[ans.size()]);
        
        
    }
}