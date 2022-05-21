class Solution {
    public void duplicateZeros(int[] arr) {
        int zeroes = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }
        for(int i = arr.length-1, j = arr.length+zeroes-1; i < j; j--, i--){
            if(arr[i] != 0){
                if(j < arr.length){
                    arr[j] = arr[i];
                }
            }
            else{
                if(j < arr.length){
                    arr[j] = arr[i];
                }
                j--;
                if(j < arr.length){
                    arr[j] = arr[i];
                }
            }
        }
    }
}