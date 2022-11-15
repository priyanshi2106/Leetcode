class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        //Brute force using 2 loops
        //TLE
        //T: O(n^2)
        //S: O(1)
        // int count = 0;
        // for(int i = 0; i < time.length; i++){
        //     for(int j = i+1; j < time.length; j++){
        //         if((time[i] + time[j])%60 == 0 ){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        

        //T: O(n)
        //S: O(1)
        
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < time.length; i++){
            
            if(time[i] % 60 == 0){ //case when the number is divisible by the                                             divisor i.e 60
                count += hm.getOrDefault(0,0); 
                //this will return the value stored at key 0, if not present it will                   return the default value that is 0.
            }
            else{
                //Getting the rem that is stored in the hashmap
                count += hm.getOrDefault(60-(time[i]%60), 0);
            }
            
            hm.put(time[i]%60, hm.getOrDefault(time[i]%60,0) +1);
        }
        return count;
    }
}