class Solution {
    int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(i, j, board, word, visited, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean backtrack(int i, int j, char[][] board, String word, boolean[][] visited, int k) {
        if (k == word.length())
            return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return false;
        }
        if (visited[i][j]) {
            return false;
        }

        if (board[i][j] != word.charAt(k)){
            return false;
        }
        visited[i][j] = true;
        //explore other directions
        for (int[] dir : directions) {
            int newRow = i + dir[0];
            int newCol = j + dir[1];
           if( backtrack(newRow, newCol, board, word, visited, k+1)){
            return true;
           }
        }
        visited[i][j] = false;
        return false;
    }
}