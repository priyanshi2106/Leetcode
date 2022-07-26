class Solution {
    public String reverseWords(String s) {
        String ans ="";
        int n = s.length();
        char [] a = s.toCharArray();
        int i = 0; 
        int j = 0;
        while(j < n && i < n){
            while(i < n && a[i] == ' '){
                i++;
            }
            j = i;
            while(j < n && a[j] != ' '){
                j++;
            }
            reverse(i,j-1,a);
            i = j;
            
        }
        //reverse(i, a.length-1,a);
        return new String(a);
    }
    public void reverse(int start, int end, char[] a){
     //   String ans = "";
        while(start < end){
            char t = a[start];
            a[start] = a[end];
            a[end] = t;
            start++;
            end--;
        }
       
    }
}