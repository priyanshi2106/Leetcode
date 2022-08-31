class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //T:O(nlogn) S:O(1)
        int start = 0;
        int end = letters.length-1;
        char ans = letters[0];
        while(start <= end){
            int mid = (start + end)/2;
            if(target == letters[mid]){
                start = mid+1;
            }
            else if(target > letters[mid]){
                start = mid+1;
            }
             else if(target  < letters[mid] ){
                ans = letters[mid];
                end = mid-1;
                //break;
            }
        }
        return ans;
        
        
       
    }
}