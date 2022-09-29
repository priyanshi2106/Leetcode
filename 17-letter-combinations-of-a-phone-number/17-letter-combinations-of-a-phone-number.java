class Solution {
     Map<Character,String> hm = Map.of('2', "abc", '3', "def", '4', "ghi", '5',         "jkl", '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    
    public List<String> letterCombinations(String digits) {
   List<String> res = new ArrayList<>();
        
        if(digits == null || digits.length() == 0){
            return res;
        }
        
       StringBuilder sb = new StringBuilder();
        
        letterCombRec(res, digits,sb,0);
        return res;
        
    }
    public void letterCombRec(List<String> res,String digits,StringBuilder sb,int i){
        if(i == digits.length()){
            res.add(sb.toString());
            return;
        }
        //Get the letters that a number corresponds to and then loop through it
        String possibleSet = hm.get(digits.charAt(i));
        // now this possibleSet is a string and we want individual char from this so we take out that 
        for(char c: possibleSet.toCharArray()){
            sb.append(c);
            letterCombRec(res,digits,sb,i+1);
            sb.deleteCharAt(sb.length()-1);//removing a when we have used it 
            
        }
    }
}