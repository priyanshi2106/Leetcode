class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        
       //we will start our search from the top-right corner.
        //if we find out that target > mat[i][j] then we go down that is we increase            row  j++
        // if we find out that target < mat[i][j] then we go towards left and decrease            i--
        while(row < matrix.length && col >= 0){
            
            if(target == matrix[row][col]){
                return true;
            }
            else if(target < matrix[row][col]){
                col--;
            }
            else{
                row++;;
            }
        }
        return false;
    }
}