class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length == 0 || arr.length <3){
            return false;
        }
       int i = 0;
        while(i+1 < arr.length && arr[i] < arr[i+1]){ //going up
            i++;
        }
         if(i == 0 || i == arr.length-1){
            return false;
        }
        while(i+1 < arr.length && arr[i] > arr[i+1]){ //coming down
            i++;
        }
       
        return i == arr.length-1;
    }
}