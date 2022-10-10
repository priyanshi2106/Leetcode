class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int ans = -1;
        while(i <= j){
            int mid = (i+j)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                ans = mid;
                return mid;
            }
            else if(arr[mid] < arr[mid+1]){
                i = mid+1;
            }
            else if(arr[mid] < arr[mid-1]){
                j = mid-1;
            }
        }
        return ans;
    }
}