class Solution {
    public int fib(int n) {
        // 0 1 1 2 3 5
        int first = 0;
        int second = 1;
        int third = 0;
        //int i = 0;
        if(n <= 1){
            return n;
        }
        for(int i = 2; i <= n; i++){
            third = first+second;
            first = second;
            second = third;
        }
        return third;
    }
}