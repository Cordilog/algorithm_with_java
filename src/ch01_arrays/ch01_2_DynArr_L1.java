package ch01_arrays;

import java.util.ArrayList;
//Focus: Using the built-in ArrayList.
public class ch01_2_DynArr_L1 {
    public static void main(String[] args) {
        // 1. Initialize ArrayList (Dynamic Array)
        // Unlike static arrays, we don't need to specify the size.
        ArrayList<Integer> list = new ArrayList<>();

        // 2. Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Current List: " + list); // [10, 20, 30]

        // 3. Access element
        System.out.println("Element at index 1: " + list.get(1));

        // 4. Remove element
        list.remove(0); // Remove element at index 0
        System.out.println("After removal: " + list);

        // 5. Check size
        System.out.println("Current size: " + list.size());
    }
}