class Solution {
    public boolean hasValidPath(int[][] grid) {
        boolean[][] visited= new boolean[grid.length][grid[0].length];
        return dfs(grid, 0, 0, visited);
    }
    private boolean dfs(int[][] grid, int i, int j, boolean[][] visited){
      int m = grid.length;
      int n = grid[0].length;

       if (i == m - 1 && j == n - 1) {
            return true;  
            }
        visited[i][j] = true;

        int street = grid[i][j];

        // left
        if (street == 1 || street == 3 || street == 5) {
            int ni = i;
            int nj = j - 1;

            if (isValid(grid, ni, nj, visited) &&
                connectsRight(grid[ni][nj])) {
                if (dfs(grid, ni, nj, visited)) return true;
            }
        }

        // right
        if (street == 1 || street == 4 || street == 6) {
            int ni = i;
            int nj = j + 1;

            if (isValid(grid, ni, nj, visited) &&
                connectsLeft(grid[ni][nj])) {
                if (dfs(grid, ni, nj, visited)) return true;
            }
        }

        // up
        if (street == 2 || street == 5 || street == 6) {
            int ni = i - 1;
            int nj = j;

            if (isValid(grid, ni, nj, visited) &&
                connectsDown(grid[ni][nj])) {
                if (dfs(grid, ni, nj, visited)) return true;
            }
        }

        // down
        if (street == 2 || street == 3 || street == 4) {
            int ni = i + 1;
            int nj = j;

            if (isValid(grid, ni, nj, visited) &&
                connectsUp(grid[ni][nj])) {
                if (dfs(grid, ni, nj, visited)) return true;
            }
        }

        return false;
    }

    private boolean isValid(int[][] grid, int i, int j, boolean[][] visited) {
        return i >= 0 && j >= 0 &&
               i < grid.length && j < grid[0].length &&
               !visited[i][j];
    }

    private boolean connectsLeft(int street) {
        return street == 1 || street == 3 || street == 5;
    }

    private boolean connectsRight(int street) {
        return street == 1 || street == 4 || street == 6;
    }

    private boolean connectsUp(int street) {
        return street == 2 || street == 5 || street == 6;
    }

    private boolean connectsDown(int street) {
        return street == 2 || street == 3 || street == 4;
    }
}
