class Solution {
    public int maximalSquare(char[][] matrix) {
        int large = 0;
        int rows = matrix.length;
        int col = rows > 0 ? matrix[0].length : 0;
        
        int dp[][] = new int[rows+1][col+1];
        //Starting the loop from 1 as we added the 0th row for convinience 
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= col; j++){
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]);
                    large = Math.max(large, dp[i][j]);
                }
            }
        }
        return large*large;
    }
}