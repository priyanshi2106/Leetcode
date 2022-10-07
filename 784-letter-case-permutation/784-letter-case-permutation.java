class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        // if(s == null || s.length() == 0){
        //     return res;
        // }
       // res.add(s);
        backtrack(res, s.toCharArray(), 0);
        return res;
    }
    
    
    public void backtrack(List<String> res, char a[], int indx){
        
       // We will consider this as a tree and we will stop when we reach the leaf of the tree and this is when we save the tree.
        if(indx == a.length){
            res.add(new String(a));
            return;
        }
        
        // First we chack if the char is letter or a number
        if(Character.isLetter(a[indx])){
            //if it is uppercase we change it to lowercase
            if(Character.isUpperCase(a[indx])){
                a[indx] = Character.toLowerCase(a[indx]);
                
                // we will call this function again to check for the rest of the                        char as well
                
                backtrack(res, a, indx+1);
                //changing lowercase back to uppercase so that we can use this again for the next iteration
                a[indx] = Character.toUpperCase(a[indx]);
            }
            else{
                //when the character is lowercase initially
                a[indx] = Character.toUpperCase(a[indx]);
                backtrack(res, a, indx+1);
                a[indx] = Character.toLowerCase(a[indx]);
            }
        }
        backtrack(res, a, indx+1);
        
    }
}


//4v6zl = 4v6zl, 4V6zl, 4v6Zl, 4v6zL, 4V6ZL, 4V6Zl, 4V6zL, 4v6ZL = 2^n where n = number of char in the string
