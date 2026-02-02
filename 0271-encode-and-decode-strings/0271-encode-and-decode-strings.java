public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String ss: strs){
            sb.append(ss.length()).append("#").append(ss);
        }
        return sb.toString()
;    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        int i = 0;
        List<String> ans = new ArrayList<>();
        while(i < s.length()){
            int j = i;
            //length can be double digit too
            while(s.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(s.substring(i, j));
            String word = s.substring(j+1,j+1+len);
            ans.add(word);
            i = j+1+len;
        }
        return ans;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));