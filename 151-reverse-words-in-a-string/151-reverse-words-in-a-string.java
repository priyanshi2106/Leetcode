import java.util.*;
class Solution {
    public String reverseWords(String s) {
    s=s.trim();
        //convert arrays to list
        List<String> stringlist = Arrays.asList(s.split("\\s+"));//splitting by multiple spaces
        Collections.reverse(stringlist);
        return String.join(" ",stringlist);
    }
}