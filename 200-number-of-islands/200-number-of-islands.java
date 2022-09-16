class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    ans ++;
                    calc(grid, i, j);
                }
            }
        }
        return ans;
    }
    public void calc(char grid[][], int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){
            return;
        }
        //To not calculate the same 1 again and again/
        grid[i][j] = '0';
        calc(grid, i+1,j);
        calc(grid, i-1, j);
        calc(grid, i, j-1);
        calc(grid, i, j+1);
       
    }
}