package oops.customarraylist;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // the initial size, keeps track of number of elements

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T value) {
        if(isFull()) {
            resize();
        }
        data[size++] = value; // Insert at index `size` and then increment `size`
    }
    private boolean isFull() {
        return size == data.length;
    }
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for(int i=0; i<data.length; i++) { // copy the items
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove() {
        T removed = (T)(data[--size]); // Type Casting cause in the smaller type we putting in the big type
        return removed;
    }
    public T get(int index) {
        return (T)data[index];
    }
    public int size() {
        return size;
    }
    public void set(int index, T value) {
        data[index] = value;
    }
    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
