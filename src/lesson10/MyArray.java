package lesson10;

import java.util.Iterator;

public class MyArray implements Iterable<Integer> {
    private int[] data;

    public MyArray(int size) {
        data = new int[size];
    }
    public int size() {
        return data.length;
    }
    public int get(int index) {
        return data[index];
    }
    public void set(int index, int elem) {
        data[index] = elem;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(this.data);
    }

    private class MyIterator implements Iterator<Integer> {
        int index;
        int[] data;

        public MyIterator(int[] data) {
            this.data = data;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < data.length;
        }

        @Override
        public Integer next() {
            int elem = data[index];
            index++;
            return elem;
        }
    }
}
