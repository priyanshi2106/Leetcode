class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //TLE
        // int n = temperatures.length;
        // int ans[] = new int[n];
        // for(int i = 0; i < n; i++)
        // {
        //     int count = 0;
        //     for(int j = i+1; j < n; j++){
        //         if(temperatures[i] < temperatures[j]){
        //             ans[i] = j-i;
        //             break;
        //         }
        //     }
        // }   
        // return ans;
        
        //MONOTONIC STACK
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int ans[] = new int[n];
        
        for(int i = 0; i < n; i++){
            int currTemp = temperatures[i];
            while(!st.isEmpty() && temperatures[st.peek()] < currTemp){
                // Add the new higher temp to the stack, remove the peek element                        from the stack and then calculate the ans
                int prevDay = st.pop();
                ans[prevDay] = i - prevDay;
                
            }
            //No higher temp was found, so we simply add this value to the stack
            st.push(i);
        }
        return ans;
    }
}