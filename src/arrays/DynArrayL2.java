package arrays;

import java.util.Arrays;
//Focus: Implementing resize logic (doubling capacity).
public class DynArrayL2 {
    private int[] data;
    private int size;
    private int capacity;

    public DynArrayL2(int initialCapacity) {
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
        DynArrayL2 arr = new DynArrayL2(2); // Start with small capacity
        arr.add(1);
        arr.add(2);
        arr.add(3); // Trigger resize here
        arr.print();
    }
}