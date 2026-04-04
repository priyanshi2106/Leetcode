class Solution {
    public int minOperations(int n) {
        //power of 2s always have 1 bit ....so we are either setting 1 or removing one from the number if we are using only powers of 2s

        //case 1: isolated 1 -> 01 
        // we can remove this by subtracting 1

        //case 2: only 00
        //sift right by 1 >> 1

        //case 3: double 11s
        //subtracting them one by one would require 2 ops so we just simply add 1

        int ops = 0;

        while(n != 0){
            int lastBit = n&1;
            int secondLastBit = (n >> 1) & 1;
            if(lastBit == 0){
                //do nothing and shift right
                n = n >> 1;
            }
            if(lastBit == 1){
                //base case
                if(n == 1){
                    ops++;
                    break;
                }
                if(secondLastBit == 0){
                    ops++;
                    n--;
                }
                else if(secondLastBit == 1){
                    ops++;
                    n++;
                }
            }
        }
        return ops;
    }
}