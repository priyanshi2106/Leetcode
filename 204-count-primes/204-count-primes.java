class Solution {
    public int countPrimes(int n) {
       //Sieve of Eratosthenes
//         int notPrime[] = new int[n];
//         for(int i = 0; i < n; i++){
//             notPrime[i] = i;
//         }
//         int count = 0;
//         for(int i = 2; i < Math.sqrt(n); i++){
//             for(int j = 2; (i*j) < n; j++) //multiples of i
//             {
//                 if(notPrime[i*j] != -1){
//                     notPrime[i*j] = -1;
//                 }
                
//             }
//         }
//         for(int i = 2; i < n; i++){
//             if(notPrime[i] != -1){
//                 count++;
//             }
//         }
//         return count;
        
        boolean notPrime[] = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
            if(notPrime[i] == false){
                    count++;
                
            for(int j = 2; i*j < n; j++){
                
                
                    notPrime[i*j] = true;
                }
            }
        }
        return count;
        
//         boolean[] notPrime = new boolean[n];
//         int count = 0;
//         for (int i = 2; i < n; i++) {
//             if (notPrime[i] == false) {
//                 count++;
//                 for (int j = 2; i*j < n; j++) {
//                     notPrime[i*j] = true;
//                 }
//             }
//         }
        
//         return count;
    }
}