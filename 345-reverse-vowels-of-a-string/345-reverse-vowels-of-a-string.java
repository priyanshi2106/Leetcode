class Solution {
    public String reverseVowels(String s) {
        //s.toLowerCase();
        char c[] = s.toCharArray();
        int i = 0;
        int j = c.length-1;
        while(i < j){
            if(i < j && !isVowel(c[i])){
                i++;
            }
            else{
                if(i < j && !isVowel(c[j])){
                    j--;
                }
                else{
                    //i is vowel and j is vowel; so exchange their places.
                    char t = c[j];
                    c[j] = c[i];
                    c[i] = t;
                    i++;
                    j--;
                }
            }
        }
        return new String(c);
    }
    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'O' || c == 'I' || c == 'U'){
            return true;
        }
        return false;
    }
}