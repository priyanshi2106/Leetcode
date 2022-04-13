class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
           boolean found = false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            hm.put(nums2[i],i);
        }
        int j = 0;
        for(int i = 0 ; i < nums1.length; i++){
            for(j = hm.get(nums1[i])+1; j < nums2.length; j++){
                if(nums1[i] < nums2[j]){
                    ans[i] = nums2[j];
                    break;
                }
            }
            if(j == nums2.length){
                ans[i] = -1;
            }
        }
        return ans;
    }
}