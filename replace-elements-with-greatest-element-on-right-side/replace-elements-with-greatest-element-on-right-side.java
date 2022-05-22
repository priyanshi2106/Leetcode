class Solution {
    public int[] replaceElements(int[] arr) {
        
       for(int i = 0; i< arr.length; i++){
           arr[i] = max(i+1, arr);
       }
        arr[arr.length-1] = -1;
        return arr;
    }
    public int max(int i, int arr[]){
        int max = 0;
        for(int j = i; j<arr.length; j++ ){
            if(arr[j] > max){
                max = arr[j];
            }
        }
        return max;
        
    }
}