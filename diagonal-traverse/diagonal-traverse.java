class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //Time: O(m*n)
        //Space: O(m*n) or O(1)
//c xz since it is a requirement mentioned in the program itself        
        int m = mat.length; // rows
        int n = mat[0].length; //column
        boolean up = true;
        int row = 0, col = 0, i = 0;
        int ans[] = new int[m*n];
         if(mat[0].length == 0 || mat.length == 0){
             return new int[0];
         }
        while(row < m && col < n){
           if(up){
            //going up
            while(row > 0 && col < n-1){
                ans[i++] = mat[row][col];
                row--;
                col++;
            }
               //when col == n-1
               ans[i++] = mat[row][col];
               if(col == n-1){
                   row++;
               }
               else{
                   col++;
               }
        }
        else{
            //going down
            while(row < m-1 && col > 0){
                ans[i++] = mat[row][col];
                row++;
                col--;
            }
            //when row == m-1
            ans[i++] = mat[row][col];
            // when at last row, you cannot inc the row but you can inc the column
            if(row == m-1){
                col++;
            }
            else{
                row++;
            }
        }
        up = !up; 
        }
        return ans;
    }
}