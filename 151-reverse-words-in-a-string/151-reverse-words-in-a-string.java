import java.util.*;
class Solution {
    public String reverseWords(String s) {
        
        //Method 1:
    // s=s.trim();
    //     //convert arrays to list
    //     List<String> stringlist = Arrays.asList(s.split("\\s+"));//splitting by multiple spaces
    //     Collections.reverse(stringlist);
    //     return String.join(" ",stringlist);
        
        //Method 2
        
//         if(s == null){
//             return null;
//         }
        
//         char a[] = s.toCharArray();
//         int n = a.length;
        
//         //Step 1: Reverse the array
//         reverse(a, 0, n-1);
        
//         //Step 2: Reverse each word
//         reverseWordss(a, n);
        
//         //Step 3: Remove extra spaces
//        return removeSpaces(a, n);
        
//     }
//     public void reverse(char a[], int i, int j){
//         while(i < j){
//             char t = a[i];
//             a[i++] = a[j];
//             a[j--] = t;
//         }
//     }
//     public void reverseWordss(char a[], int n){
//          int i = 0, j = 0;
//         while (j < n) {
//             while (i < n && a[i] == ' ') {
//                 i++;  //skipping leading spaces
//             }
//             j = i; //start of the word
//             while (j < n && a[j] != ' '){
//                j++;   //figuring out end of the word
//             } 
//             reverse(a, i, j - 1);
//             i = j++;
//         }
//     }
    
   
//     public String removeSpaces(char a[], int n){
//         int i = 0, j = 0;
//         while(j < n){
//             while(j < n && a[j] == ' '){ // To remove leading spaces
//                 j++;
//             }
//             while(j < n && a[j] != ' '){
//                 a[i++] = a[j++];
//             }
//             while(j < n && a[j] == ' '){ // To remove trailing spaces
//                j++;
//             }
            
//             if(j < n){
//                 a[i++] = ' '; // keeping 1 extra space for when we use substring 
//             }
//         }
//         return new String(a).substring(0,i);
        
        //Method 3 
        //String builder
        // String words[] = s.trim().split(" ");
        // StringBuilder ans = new StringBuilder();
        // for(int i = words.length-1; i >=0; i--){
        //     if(!words[i].isEmpty()){
        //         ans.append(words[i]).append(" ");
        //     }
        // }
        // return ans.toString().trim();
        
        s = s.trim();
        String a[] = s.split("\\s+");
        Stack<String> st = new Stack<>();
        for(String str: a){
            st.push(str);
        }
        String ans ="";
        while(!st.isEmpty()){
            ans += st.pop();
            ans +=" ";
        }
        ans = ans.trim();
        return ans;
    }
}