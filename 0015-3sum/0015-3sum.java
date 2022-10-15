class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        //we will take one index and then find another pair that when added with    this number results in a zero. So basically, we are going to call two sum n times    for every n numers in the array.
        for(int i = 0; i < nums.length-2; i++){
            if(i == 0 || i > 0 && nums[i] != nums[i-1]){
                //since we do not want duplicates
                int left = i+1;
                int right = nums.length-1;
                int sum = 0 - nums[i];
                while(left < right){
                    if(nums[left] + nums[right] == sum){
                        res.add(Arrays.asList(nums[i],nums[left], nums[right]));
                        //Don't want duplicates
                        while(left < right && nums[left] == nums[left+1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(nums[left] + nums[right] > sum){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return res;
        
    //     List<List<Integer>> res = new ArrayList<>();
    // Arrays.sort(nums);
    // for (int i = 0; i + 2 < nums.length; i++) {
    //     if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
    //         continue;
    //     }
    //     int j = i + 1, k = nums.length - 1;  
    //     int target = -nums[i];
    //     while (j < k) {
    //         if (nums[j] + nums[k] == target) {
    //             res.add(Arrays.asList(nums[i], nums[j], nums[k]));
    //             j++;
    //             k--;
    //             while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
    //             while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
    //         } else if (nums[j] + nums[k] > target) {
    //             k--;
    //         } else {
    //             j++;
    //         }
    //     }
    // }
    // return res;
    }
}