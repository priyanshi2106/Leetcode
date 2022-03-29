class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
     
        HashSet<Integer> hm = new HashSet<>();
        for(int i = 0; i< nums1.length; i++){
           
                hm.add(nums1[i]);
           
        }
        HashSet<Integer> intersection = new HashSet<>();
        for(int i = 0 ; i < nums2.length;i++){
            if(hm.contains(nums2[i])){
                intersection.add(nums2[i]);
            }
        }
        int [] ans = new int[intersection.size()];
        int indx = 0;
        for(int i: intersection){
            ans[indx++] = i;
        }
        return ans;
    }
}