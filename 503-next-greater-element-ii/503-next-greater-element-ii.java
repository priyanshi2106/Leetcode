class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] ans = new int[nums.length];
        
       // for(int i = 0; i< nums.length;i++){
       //     ans[i] = -1;
       //     for(int j = 1; j< nums.length; j++){
       //         if(nums[(j+i) % nums.length] > nums[i]){
       //             ans[i] = nums[(j+i) % nums.length];
       //             break;
       //         }
       //     }
       // }
       //  return ans;
        
        //Better approach -> use stack 
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans, -1);
        int n = nums.length;
        for(int i = 0; i< n*2; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i%n]){
                ans[st.pop()] = nums[i%n];
            }
           if(i < n){
               st.push(i);
           }
        }
        return ans;
    }
}