class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int i = 0;
//         for(int j = 0; j<nums.length;j++){
//             if(nums[j] != val ){
               
//                 nums[i] = nums[j];
//                 i++;
//             }
//         }
        int n = nums.length;
        while(i<n){
            if(nums[i] == val){
                nums[i] = nums[n-1];
                n--;
            }
            else{
                i++; 
            }
           
        }
        return i;
    }
}