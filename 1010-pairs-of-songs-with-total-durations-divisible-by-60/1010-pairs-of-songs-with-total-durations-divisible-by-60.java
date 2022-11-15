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
        
//         int count = 0;
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         //This map will store the rem and the freq of each rem
//         for(int i = 0; i < time.length; i++){
//             //Take out the rem
//             int rem = time[i] % 60;
//             int target = 60 - (rem);
//             //check if the target is present in the map
//             if(hm.containsKey(target)){
//                 //if present add it to the count
//                 count += hm.get(target);
                
//             }
//             if(rem != 0){
//                     hm.put(rem, hm.getOrDefault(rem,0) +1);
//                 }
//                 else{
//                     hm.put(60, hm.getOrDefault(60,0)+1);
//                 }
//         }
//         return count;
        
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < time.length; i++){
            if(time[i] % 60 == 0){ //case when the number is divisible by the                                            divisor i.e 60
                count += hm.getOrDefault(0,0);    
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