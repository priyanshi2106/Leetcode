class Solution {
    int directions[][] = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    public int getMaximumGold(int[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j< grid[0].length; j++){
                if(grid[i][j] != 0){
                    //explore this index and its neighbors
                    ans = Math.max(ans,dfs(grid, i, j));
                }
            }
        }
        return ans;
    }
    public int dfs(int[][] grid, int i , int j){
        //base case
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        int temp = grid[i][j];
        int maxAns = 0;
        //mark this as visited for now
        grid[i][j] = 0;
        //explore the other directions
        for(int dir[] : directions){
            maxAns = Math.max(maxAns, dfs(grid, i + dir[0], j + dir[1]));
        }
        grid[i][j] = temp;
        return maxAns+temp;
    }
}