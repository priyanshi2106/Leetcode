class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        int lastIndex = 0;
        while(j < chars.length){
            j=i+1;
            while(j < chars.length && chars[j] == chars[i]){
                j++;
            }
            int freq = j-i;
            chars[lastIndex++] = chars[i];
            if(freq > 1){
                //convert freq to string first and then to char array
                for(char c: String.valueOf(freq).toCharArray()){
                    chars[lastIndex++] = c;
                }
            }
            i = j;
        }
        return lastIndex;
    }
}