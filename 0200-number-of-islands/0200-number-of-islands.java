// class Solution {
//     public int numIslands(char[][] grid) {
//         int ans = 0;
//         for(int i = 0; i < grid.length; i++){
//             for(int j = 0; j < grid[0].length; j++){
//                 if(grid[i][j] == '1'){
//           //if we see 1 we know there is definitely an island 
//          //  now we  want to visit all its neighbours
//                     ans +=calc(grid, i, j);
                    
//                 }
//             }
//         }
//         return ans;
//     }
//     public int calc(char grid[][], int i, int j){
//         //check if the indices we are given are valid
//         if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){
//             return 0;
//         }
//         //To not calculate the same 1 again and again(sinking the island)
//         grid[i][j] = '0';
//         calc(grid, i+1,j);
//         calc(grid, i-1, j);
//         calc(grid, i, j-1);
//         calc(grid, i, j+1);
//        return 1;
//     }
// }

class Solution {
    int[][] directions = {{0,1},{0,-1}, {1,0}, {-1,0}};
    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    //explore further
                    ans++;
                    bfs(grid, i, j);
                }
            }
        }
        return ans;
    }
    public void bfs(char[][] grid, int i , int j){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        grid[i][j] = '0';
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            for(int dir[]:directions){
                int newRow = row+dir[0];
                int newCol = col+dir[1];
                if(newRow >= 0 && newRow < grid.length && newCol >=0 && newCol< grid[0].length && grid[newRow][newCol] == '1'){
                    q.add(new int[]{newRow, newCol});
                    grid[newRow][newCol] = '0';
                }
            }
        }
    }
}