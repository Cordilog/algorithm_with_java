package arrays;

import java.util.Arrays;
//Focus: Simulating deletion in a fixed-size array (Shifting elements).
public class StaticArrayL2 {
    public static void main(String[] args) {
        // Initial array with 5 elements.
        int[] arr = {1, 2, 999, 4, 5};
        System.out.println("Before deletion: " + Arrays.toString(arr));

        // Mission: Delete the element at index 2 (value 999).
        // Since the array size is fixed, we must shift subsequent elements to the left.
        int targetIndex = 2;

        // 1. Shift elements to the left starting from the target index.
        // arr[2] becomes arr[3], arr[3] becomes arr[4]...
        for (int i = targetIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // 2. Reset the last element (optional but good practice).
        // Since the data was shifted, the last element is now a duplicate or garbage.
        arr[arr.length - 1] = 0;

        System.out.println("After deletion:  " + Arrays.toString(arr));
        System.out.println(">> The physical size of the array remains 5.");
    }
}