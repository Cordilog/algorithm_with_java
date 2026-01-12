package ch01_arrays;
//Focus: Creating arrays with different row lengths (Jagged Array).
public class ch01_3_2DArr_L2 {
    public static void main(String[] args) {
        // 1. Create a jagged array (rows have different lengths)
        // Scenario: A cinema where rows have different number of seats.
        int[][] cinema = new int[3][];

        cinema[0] = new int[2]; // Row 0 has 2 seats
        cinema[1] = new int[4]; // Row 1 has 4 seats
        cinema[2] = new int[3]; // Row 2 has 3 seats

        // 2. Fill the array with seat numbers sequentially
        int seatNum = 1;
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                cinema[i][j] = seatNum++;
            }
        }

        // 3. Print the jagged structure
        // Using 'Enhanced for-loop' for cleaner syntax
        System.out.println("--- Cinema Seat Map ---");
        for (int[] row : cinema) {
            System.out.print("Seats: ");
            for (int seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }
}