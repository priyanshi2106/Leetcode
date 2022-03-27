class Solution {
    public String addBinary(String a, String b) {
       StringBuilder ans = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;  //because carry will always be added to the sum
            if(i>=0)  //if one of the strings ends before another
                sum += a.charAt(i)-'0'; //converting to integer
            if(j>=0)
                sum += b.charAt(j)-'0'; //converting to integer
            ans.append(sum%2); 
            //(1+1=2; 2%2 = 0)
            carry = sum/2;
            //(1+1 = 2; 2/2 = 1)
            //(1+0 = 1; 1/2 = 0)
            i--;
            j--;
        }
        if(carry != 0){
            ans.append(carry);
        }
        return ans.reverse().toString();
    }
}