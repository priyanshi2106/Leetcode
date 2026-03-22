class Solution {
    public int compress(char[] chars) {
        int i = 0; 
        int lastIndex = 0;//to re-create the char array;
        while( i < chars.length){
            int j = i+1;
            while(j < chars.length && chars[i] == chars[j]){
                j++;
            }
            int count = j-i;
            //write the char first then we write the freq
            chars[lastIndex++] = chars[i];
            //write the freq
            if(count > 1){
                for(char c: String.valueOf(count).toCharArray()){
                    chars[lastIndex++] = c;
                }
            }
             i = j;
        }
        return lastIndex;


    }
}