class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       //Approach 1: Merge sort ( Time complexity: O(m+n)log(m+n), Space complexity O(n))
      //  for(int i = 0; i < n; i++){
        //    nums1[m+i] = nums2[i];
        // }
        // Arrays.sort(nums1);
        
        
        //Approach 2: Two pointers (Time complexity: O(m+n), Space complexity: O(m))
        //first make a copy of nums1
        // int nums1copy[] = new int[m];
        // for(int i = 0; i < m; i++){
        //     nums1copy[i] = nums1[i];
        // }
        // int p1 = 0, p2 = 0;
        // for(int p = 0; p < m+n; p++){
        //     if(p2 >= n || (p1 < m && nums1copy[p1] < nums2[p2])){
        //         nums1[p] = nums1copy[p1++];
        //     }
        //     else{
        //         nums1[p] = nums2[p2++];
        //     }
        // }
        
        //Approach 3: Three Pointers (Time complexity: O(m+n), space complexity: O(1))
        int p1 = m-1;
        int p2 = n-1;
        for(int p = m+n-1; p >= 0; p--){
            if(p2 < 0){
                break;
            }
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1--];
            }
            else{
                nums1[p] = nums2[p2--];
            }
        }
    }
}