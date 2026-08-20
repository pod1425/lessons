package lesson12.hw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;

public class MyArray<T> implements Collection<T> {
    private Object[] data;
    private int ArSize;

    public MyArray(int size) {
        data = new Object[size];
        ArSize = 0;
    }

    @Override
    public int size() {
        return ArSize;
    }

    @Override
    public boolean isEmpty() {
        return ArSize == 0;

    }

    @Override
    public boolean contains(Object o) {
        for(Object element : data){
            if (o.equals(element)){
                return true;
            }
        }
        return false;
    }

    @Override
    public MyIterator iterator() {
        return new MyIterator(this.data);
    }
    private class MyIterator implements Iterator<T> {
        int index;
        Object[] data;

        public MyIterator(Object[] data) {
            this.data = data;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < data.length;
        }

        @Override
        public T next() {
            Object elem = data[index];
            index++;
            return (T) elem;
        }
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[ArSize];

        for (int i = 0; i < data.length; i++){
            array[i] = data[i];
        }
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        boolean chage = true;
        if (ArSize == data.length){
            data = Arrays.copyOf(data,data.length + 1);
        }
        
        data[ArSize++] = t;
        return chage;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < data.length; i++){
            if(o.equals(data[i])){
                data[i] = null;
                ArSize--;
            }
            if(data[i] == null){
                data[i + 1] = data[i];
            }
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean change = false;
        int a = 0;

       for (Object elem : c) {
           if (contains(elem)){
               continue;
           }
           else {
               change = true;
           }
       }
       return change;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean change =  false;

        if (c.isEmpty()){
            return false;
        }
        for (T element : c){
            data[ArSize] = element;
                ArSize++;
                change = true;
            }
        return change;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean change =  false;
        for (int i = 0 ; i < data.length; i++){
            if (c.contains(data[i])){
                data[i] = null;
                ArSize--;
                change = true;
            }
        }
        return change;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean change =  false;
        for (int i = 0 ; i < data.length; i++){
            if (!(c.contains(data[i]))){
                data[i] = null;
                ArSize--;
                change = true;
            }
        }
        return change;
    }

    @Override
    public void clear() {
        for (int i = 0 ; i < data.length; i++){
            data[i] = null;
        }
    }

}