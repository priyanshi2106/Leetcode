class Solution {
    int[][] direction = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {

        Queue<int[]> q = new LinkedList<>();
        q.add(start);
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[start[0]][start[1]] = true;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            if (curr[0] == destination[0] && curr[1] == destination[1]) {
                return true;
            }
            for (int[] dir : direction) {
                int newRow = curr[0];
                int newCol = curr[1];
                //keep on rolling till the ball hits the wall
                while (newRow + dir[0] >= 0 && newRow + dir[0] < maze.length &&
                        newCol + dir[1] >= 0 && newCol + dir[1] < maze[0].length &&
                        maze[newRow + dir[0]][newCol + dir[1]] == 0) {
                    newRow += dir[0];
                    newCol += dir[1];
                }
                if (!visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    q.add(new int[] { newRow, newCol });
                }

            }
        }
        return false;
    }
}