package ch01_arrays;
//Focus: Declaration, initialization, and iteration using nested loops.
public class ch01_3_2DArr_L1 {
    public static void main(String[] args) {
        // 1. Declaration and Initialization (2 rows, 3 columns)
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60}
        };

        // 2. Check dimensions
        // matrix.length returns the number of rows
        // matrix[0].length returns the number of columns in row 0
        System.out.println("Number of rows: " + matrix.length);
        System.out.println("Number of columns in row 0: " + matrix[0].length);

        // 3. Print all elements using nested loops
        System.out.println("--- Matrix Content ---");
        for (int i = 0; i < matrix.length; i++) { // Outer loop for rows
            for (int j = 0; j < matrix[i].length; j++) { // Inner loop for columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }
    }
}