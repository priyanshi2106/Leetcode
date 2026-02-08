class Solution {
    public int reverseBits(int n) {
        //so if ip is 00110 the op should be 01100
        //if we had to return list as ans it was easy since we could just do & with 1 and it would give us the list.
        //but we have to return the int so we need to do & with 1 and also add the ans to it using left shift << 1

        int ans = 0;
        int times = 32;
        List<Integer> l = new ArrayList<>();
        while(times > 0){
            int t = n&1;
            l.add(t);
            n >>>=1;
            //right shift is basically division by 2
            times--;
        }
        for(int i = 0; i < 32; i++){
            //make space for what we want to store
           ans = ans <<1;
           ans = ans | (l.get(i));
        }
        return ans;
    }
}