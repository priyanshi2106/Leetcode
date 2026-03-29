class Solution {
    public int orangesRotting(int[][] grid) {
        // bfs bcs we need to find min time so we visit neighbors at aeach sec as
        // compared to dfs
        // S:O(n*m)
        // t: O(n*m)
        Queue<int[]> q = new LinkedList<>();
        int countFresh = 0;
        int directions[][] = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                    // bfs(grid, i, j, directions)
                } else if (grid[i][j] == 1) {
                    countFresh++;
                }
            }
        }
        if (countFresh == 0) {
            return 0;
        }
        int ans = 0;
        // int rotten = false;
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rottenThisRound = false; // Flag to track if any fresh orange at each level
            for (int i = 0; i < size; i++) {
                int curr[] = q.poll();
                int row = curr[0];
                int col = curr[1];
                // check all 4 neighbors of this element
                for (int dir[] : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    if (newCol >= 0 && newRow >= 0 && newCol < grid[0].length && newRow < grid.length
                            && grid[newRow][newCol] == 1) {
                        q.add(new int[] { newRow, newCol });
                        grid[newRow][newCol] = 2;
                        rottenThisRound = true;
                        countFresh--;
                    }
                }
            }
            if (rottenThisRound) {
                ans++; // Increment minutes only if we rotted at least one orange
            }
        }
        return countFresh == 0 ? ans : -1;

    }
}