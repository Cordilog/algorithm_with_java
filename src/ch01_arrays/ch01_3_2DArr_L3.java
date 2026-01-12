package ch01_arrays;
//Focus: Rotating an NxN matrix 90 degrees clockwise using index manipulation.
import java.util.Arrays;

public class ch01_3_2DArr_L3 {
    public static void main(String[] args) {
        // 1. Create a 3x3 Matrix
        int[][] original = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = original.length;

        // Create a new array to store the rotated result
        int[][] rotated = new int[n][n];

        // 2. Rotate Logic (90 degrees clockwise)
        // Rule: The element at [i][j] moves to [j][n-1-i]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = original[i][j];
            }
        }

        // 3. Print Results
        System.out.println("--- Original Matrix ---");
        printMatrix(original);

        System.out.println("--- Rotated Matrix (90 deg) ---");
        printMatrix(rotated);
    }

    // Helper method to print the matrix nicely
    public static void printMatrix(int[][] grid) {
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
    }
}