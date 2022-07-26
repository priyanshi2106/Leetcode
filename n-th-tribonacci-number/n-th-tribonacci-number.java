class Solution {
    public int tribonacci(int n) {
        int dp[] = new int[n];
        if(n < 3){
            return n == 0? 0: 1;
        }
      int first = 0;
       int second = 1;
       int third = 1;
        for(int i = 3; i <= n; i++){
           
                int t = first + second + third;
            first = second;
            second = third;;
            third = t;
            
            
            
        }
        return third;
    }
}