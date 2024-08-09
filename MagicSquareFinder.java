public class MagicSquareFinder {

    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;

        // Loop through each possible 3x3 subgrid
        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[0].length - 3; j++) {
                if (isMagic(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isMagic(int[][] grid, int row, int col) {
        // Array to check if numbers 1 to 9 are used
        boolean[] used = new boolean[10];

        // Check for distinct numbers from 1 to 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = grid[row + i][col + j];
                if (num < 1 || num > 9 || used[num]) {
                    return false;
                }
                used[num] = true;
            }
        }

        // Check sums of rows, columns, and diagonals
        int sum = grid[row][col] + grid[row][col + 1] + grid[row][col + 2];
        for (int i = 0; i < 3; i++) {
            if (grid[row + i][col] + grid[row + i][col + 1] + grid[row + i][col + 2] != sum) {
                return false;
            }
            if (grid[row][col + i] + grid[row + 1][col + i] + grid[row + 2][col + i] != sum) {
                return false;
            }
        }
        if (grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] != sum) {
            return false;
        }
        if (grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col] != sum) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        MagicSquareFinder finder = new MagicSquareFinder();
        int[][] grid = {
            {4, 3, 8, 4},
            {9, 5, 1, 9},
            {2, 7, 6, 2}
        };
        System.out.println(finder.numMagicSquaresInside(grid)); // Output: 1
    }
}
