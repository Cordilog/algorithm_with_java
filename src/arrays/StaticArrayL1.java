package arrays;
//Focus: Declaration, Access, and Traversal.
public class StaticArrayL1 {
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        // Fixed size of 5, indices range from 0 to 4.
        int[] scores = {90, 80, 70, 60, 50};

        // 2. Accessing Data
        // Remember: Array indexing is zero-based.
        System.out.println("First element: " + scores[0]);
        System.out.println("Last element: " + scores[scores.length - 1]);

        // 3. Modifying Data
        // Change the value at index 2 (70) to 100.
        scores[2] = 100;

        // 4. Traversal (Iteration)
        // Calculate the sum and average of the scores.
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Index " + i + ": " + scores[i]);
            sum += scores[i];
        }

        System.out.println("Total Sum: " + sum);
        System.out.println("Average: " + (double) sum / scores.length);

        // NOTE: Static arrays cannot exceed their initial size.
        // The line below would throw an ArrayIndexOutOfBoundsException if uncommented.
        // scores[5] = 10;
    }
}