class Solution {
    public int longestConsecutive(int[] nums) {
        //we can sort the array but that will be O(nlogn)
        //use hashset to store numbers and then we look up the number's left    neighbor and the right neighbor to determine the longest seq...the lookup time will be O(n)

        Set<Integer> set = new HashSet<>();
        //add numbers to the hashset
        for(int n: nums){
            set.add(n);
        }
        int longest = 0;
        for(int n: nums){
            //first check if it has left neighbor or not
            //if it does not then that means it is the start of the seq
            if(!set.contains(n-1)){
                int currLength = 1;
                int currNum = n;
                //check for right neighbors now 
                while(set.contains(currNum+1)){
                    currNum = currNum+1;
                    currLength +=1;
                }
                longest = Math.max(longest, currLength);
            }
        }
        return longest;
    }
}