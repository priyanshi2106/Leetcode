class Solution {
    public List<String> commonChars(String[] words) {
        //First define a list that will contain the output
        ArrayList<String> output = new ArrayList<>();
        
        //Define an array Min Freq that will contain the min freq of all the strings
        int min_freq[] = new int[26];
        Arrays.fill(min_freq,Integer.MAX_VALUE);
        
        //Loop through the words array and pick each string one by one
        for(String currString : words){
            //Define an array for keeping track of freq of each char in each string
            int char_freq[] = new int[26];
            for(char c : currString.toCharArray()){
                //Incrementing the frequency
                char_freq[c-'a']++;
            }
            //Now find and update the. min_freq for each char
           for(int i = 0; i < 26 ; i++){
                min_freq[i] = Math.min(min_freq[i], char_freq[i]);
           }
        }
        //Now add the answer to the final list
        for(int i = 0; i < 26 ; i++){
            while(min_freq[i] > 0){
                output.add(""+(char)(i+'a'));
                min_freq[i]--;
            }
        }
        return output;
    }
}