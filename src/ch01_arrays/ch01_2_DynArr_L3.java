package ch01_arrays;

import java.util.Arrays;
//Focus: Generic implementation <T> to store any type.
// Generic Class: T can be any type (Integer, String, etc.)
public class ch01_2_DynArr_L3<T> {
    private Object[] data;
    private int size;
    private int capacity;

    public ch01_2_DynArr_L3(int initialCapacity) {
        this.capacity = initialCapacity;
        this.data = new Object[capacity];
        this.size = 0;
    }

    public void add(T value) {
        if (size == capacity) {
            capacity *= 2;
            data = Arrays.copyOf(data, capacity);
        }
        data[size++] = value;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        // String Type
        ch01_2_DynArr_L3<String> strList = new ch01_2_DynArr_L3<>(2);
        strList.add("Hello");
        strList.add("World");
        strList.add("Java"); // Resize
        System.out.println("Index 1: " + strList.get(1));

        // Integer Type
        ch01_2_DynArr_L3<Integer> intList = new ch01_2_DynArr_L3<>(2);
        intList.add(100);
        intList.add(200);
        System.out.println("Index 0: " + intList.get(0));
    }
}