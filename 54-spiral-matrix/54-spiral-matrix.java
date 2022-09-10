class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> ll = new LinkedList<>();
        int up = 0;
        int down = matrix.length-1;
        int left = 0; 
        int right = matrix[0].length-1;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int size = m*n;
        
        if(m == 0 || n == 0 || matrix == null ){
            return ll;
        }
        
        while(ll.size() < size){
            //left to right
            for(int i = left; i <= right && ll.size() < size; i++){
                ll.add(matrix[up][i]);
            }
            up++;
            //up to down
            for(int i = up; i <= down && ll.size() < size; i++){
                ll.add(matrix[i][right]);
            }
            right--;
            //from right to left
            for(int i = right; i >= left && ll.size() < size; i--){
                ll.add(matrix[down][i]);
            }
            down--;
            //down to up
            for(int i = down; i >= up && ll.size() < size; i--){
                ll.add(matrix[i][left]);
            }
            left++;
        }
        return ll;
    }
}