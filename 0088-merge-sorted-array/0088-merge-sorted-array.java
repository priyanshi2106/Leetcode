class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       //we can merge nums2 into nums1 and then sort the array but time complexity is nlogn
       int i = m-1;
       int j = n-1;
       for(int k = m+n-1; k >= 0; k--){
        if(j < 0){
            break;
        }
        if(i >= 0 && nums1[i] > nums2[j]){
            nums1[k] = nums1[i];
            i--;
        }
        else{
            nums1[k] = nums2[j];
            j--;
        }
       }
    }
}