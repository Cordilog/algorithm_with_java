package ch01_arrays;

import java.util.Arrays;
//Focus: Implementing resize logic (doubling capacity).
public class ch01_2_DynArr_L2 {
    private int[] data;
    private int size;
    private int capacity;

    public ch01_2_DynArr_L2(int initialCapacity) {
        this.capacity = initialCapacity;
        this.data = new int[capacity];
        this.size = 0;
    }

    public void add(int value) {
        // Double the capacity if the array is full
        if (size == capacity) {
            capacity *= 2;
            data = Arrays.copyOf(data, capacity);
            System.out.println("[Resize] Capacity increased to: " + capacity);
        }
        data[size++] = value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return data[index];
    }

    public void print() {
        System.out.println("Data: " + Arrays.toString(Arrays.copyOf(data, size)));
    }

    public static void main(String[] args) {
        ch01_2_DynArr_L2 arr = new ch01_2_DynArr_L2(2); // Start with small capacity
        arr.add(1);
        arr.add(2);
        arr.add(3); // Trigger resize here
        arr.print();
    }
}