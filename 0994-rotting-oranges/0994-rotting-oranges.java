class Solution {
    public int orangesRotting(int[][] grid) {
        // bfs bcs we need to find min time so we visit neighbors at aeach sec as
        // compared to dfs
        // S:O(n*m)
        // t: O(n*m)
        int[][] direction = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        Queue<int[]> q = new LinkedList<>();
        int countFresh = 0;
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    //found rotten add it to queue
                    q.add(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    countFresh++;
                }
            }
        }
        if (countFresh == 0) {
            return 0;
        }

        while (!q.isEmpty()) {
            boolean foundRottenThisRound = false;
            //go through queue and see if it can rott another orange
            int size = q.size();
            for (int k = 0; k < size; k++) {
                int curr[] = q.poll();
                int row = curr[0];
                int col = curr[1];
                //check its neighbors
                for (int[] dir : direction) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    if (newRow >= 0 && newCol >= 0 && newCol < grid[0].length && newRow < grid.length
                            && grid[newRow][newCol] == 1) {
                        foundRottenThisRound = true;
                        grid[newRow][newCol] = 2;
                        q.add(new int[] { newRow, newCol });
                        countFresh--;
                    }
                }
            }
            if (foundRottenThisRound) {
                ans++;

            }
        }

        return countFresh == 0 ? ans : -1;
    }
}