class Solution {
    public int hammingWeight(int n) {
        //s: O(1)
        //t: O(32)
        int temp = n;
        int ans = 0;
      while(n != 0){
        ans += n & 1; //add one if one is present in rightmost position(here the n is trated as binary)
        //shift the binary number by 1 so we can look at other digits
        n >>>= 1;
      }
        return ans;
    }
}

//there is one more efficient sol look it up 
//wher ethe t: O(1)
//n = n&(n-1)