import java.lang.*;
class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag1 = false;
        boolean flag2 = false;
        int count = 0;
        int count1 = 0;
        int pos = -1;
        char c[] = word.toCharArray();
        for(int i = 0; i< c.length; i++){
            if(Character.isUpperCase(c[i])){
                flag1 = true;
                count++;
                pos = i;
            }
            else if(Character.isLowerCase(c[i])){
                flag2 = true;
                count1++;
                
            }
        }
        if(flag1 == true && count == c.length){
            return true;
        }
        else if(flag1 == true && pos == 0 ){
            return true;
        }
        else if(flag2 == true && count1 == c.length ){
            return true;
        }
        else{
            return false;
        }
    
    }
}