class Solution {
      int directions[][] = {{0,1}, {0,-1}, {1,0}, {-1, 0}};
    public int getMaximumGold(int[][] grid) {
      //dfs
      int max = 0;
      for(int i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){
            if(grid[i][j] != 0){
                //we can explore further
                max = Math.max(max, dfs(grid,i, j) );
            }
        }
      }
      return max;
    }
    public int dfs(int grid[][], int i , int j){
        //base case
        if( i< 0 || i >= grid.length || j >=grid[0].length ||j < 0 || grid[i][j] == 0){
            return 0;
        }
        int temp = grid[i][j];
        //mark it as visited for now
        grid[i][j] = 0;
        int maxGold = 0;
        //explore other directions through this element
        for(int dir[] : directions){
            maxGold = Math.max(maxGold,dfs(grid, i + dir[0], j + dir[1]));
        }
        //restore cell as we have explored directions
        grid[i][j] = temp;
        return temp+maxGold;
    }
}