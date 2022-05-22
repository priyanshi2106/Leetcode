
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
//         for(int i = 0; i < arr.length; i++){
//             if(!hs.contains(arr[i])){
//                 hs.add(arr[i]);
//             }
            
//         }
        for(int i = 0; i< arr.length; i++){
            //System.out.println(hs+" "+ arr[i]);
            if(hs.contains(arr[i]*2) || arr[i]%2 == 0 && hs.contains(arr[i]/2) ){
                return true;
            }
            else{
                hs.add(arr[i]); 
            }
           
        }
        return false;
        
	// HashSet<Integer> set = new HashSet<>();
	// for(int a : arr) {
	// 	if(set.contains(a*2) || (a%2 == 0 && set.contains(a/2))) return true;
	// 	set.add(a);
	// }
	// return false;
    }
}