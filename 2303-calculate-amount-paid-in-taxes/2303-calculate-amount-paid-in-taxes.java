class Solution {
    public double calculateTax(int[][] brackets, int income) {
       double tax = 0;
        int prev = 0;
        for(int b[] : brackets){
            int curr = b[0];
            int percent = b[1];
            if(income >= curr){
                tax += (curr-prev)*percent/100d;
                prev = curr;
            }
            else{
                tax += (income-prev)*percent/100d;
                return tax;
            }
        }
        return tax;
        

    }
}