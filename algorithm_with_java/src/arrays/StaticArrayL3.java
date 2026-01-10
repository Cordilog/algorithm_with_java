package arrays;
//Focus: 2D Array manipulation and Snail (Spiral) Traversal logic.
public class StaticArrayL3 {
    public static void main(String[] args) {
        int n = 5; // Create a 5x5 matrix
        int[][] matrix = new int[n][n];

        int value = 1; // Value to fill (1 to 25)

        // Direction vectors: Right, Down, Left, Up
        // dRow changes the row index, dCol changes the column index.
        int[] dRow = {0, 1, 0, -1};
        int[] dCol = {1, 0, -1, 0};

        int direction = 0; // 0:Right, 1:Down, 2:Left, 3:Up
        int row = 0, col = 0; // Starting coordinates

        while (value <= n * n) {
            matrix[row][col] = value++;

            // Calculate the next potential coordinates
            int nextRow = row + dRow[direction];
            int nextCol = col + dCol[direction];

            // Check boundary conditions and if the cell is already visited (not 0).
            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || matrix[nextRow][nextCol] != 0) {
                // Change direction: (0 -> 1 -> 2 -> 3 -> 0)
                direction = (direction + 1) % 4;
                nextRow = row + dRow[direction];
                nextCol = col + dCol[direction];
            }

            // Update coordinates
            row = nextRow;
            col = nextCol;
        }

        // Print the matrix
        System.out.println("=== Snail (Spiral) Matrix Output ===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", matrix[i][j]); // Formatted output
            }
            System.out.println();
        }
    }
}