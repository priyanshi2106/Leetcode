class Solution {
    // int board[][] = new int[3][3];
    //     int player = 1;
    public String tictactoe(int[][] moves) {
        //int n = moves.length;
        
        
//         for(int move[] : moves){
//             int row = move[0];
//             int col = move[1];
//             //MARKING THE POSITION OF PLAYER ON BOARD
//             board[row][col] = player;
            
//             //check if this player is winning
//             if(chkRow(row,player) || chkCol(col,player) || (row == col && chkDiag(player)) || (row+col == 2 && chkAntiDiag(player))){
//                 return player == 1? "A": "B";
//             }
//             player*= -1;
//         }
//         return moves.length == 3 * 3 ? "Draw" : "Pending";
//     }
    
//     public boolean chkRow(int row, int player){
//         for(int col = 0; col < 3; col++){
//             if((board[row][col] != player)){
//                 return false;
//             }
            
//         }
//         return true;
//     }
    
//     public boolean chkCol(int col, int player){
//         for(int row = 0; row < 3; row++){
//             if(board[row][col] != player){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public boolean chkDiag(int player){
//         for(int row = 0; row < 3; row++){
//             if(board[row][row] != player){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public boolean chkAntiDiag(int player){
//         for(int row = 0; row < 3; row++){
//             if(board[row][2-row] != player){
//                 return false;
//             }
//         }
//         return true;
        
        int rows[] = new int[3];
        int cols[] = new int[3];
        int diag = 0;
        int anti_diag = 0;
        int player = 1;
        
        for(int move[] : moves){
            int row = move[0];
            int col = move[1];
            
            //update the board with the moves
            rows[row] += player;
            cols[col] += player;
            if(row == col){
                diag += player;
            }
            if(row+col == 2){
                anti_diag += player;
            }
            
            //checking if any conditions meet the winning criteria
            if(Math.abs(rows[row]) == 3 || Math.abs(cols[col]) == 3 || Math.abs(diag) == 3 || Math.abs(anti_diag) == 3){
                return player == 1? "A": "B";
            } 
            player *=-1;
        }
        return moves.length == 3*3?"Draw": "Pending";
    }
    
}