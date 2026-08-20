package lesson11.hw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;

public class MyArray<T> implements Collection<T> {
    private Object[] data;
    private int arSize;

    public MyArray(int size) {
        data = new Object[size];
        arSize = 0;
    }

    @Override
    public int size() {
        return arSize;
    }

    @Override
    public boolean isEmpty() {
        return arSize == 0;
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
    public Iterator<T> iterator() {
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[arSize];

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
        if (arSize == data.length){
            data = Arrays.copyOf(data,data.length + 1);
        }
        
        data[arSize++] = t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int temp = arSize;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == o) {
                data[i + 1] = data[i];
                arSize--;
            }
        }
        return arSize != temp;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean change = true;
        for (Object elem : c) {
           if (!contains(elem)){
               change = false;
           }
       }
       return change;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T element : c) {
            data[arSize] = element;
            arSize++;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean change = false;
        for (int i = 0 ; i < data.length; i++){
            if (c.contains(data[i])){
                data[i] = null;
                arSize--;
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
                arSize--;
                change = true;
            }
        }
        return change;
    }

    @Override
    public void clear() {
        data = new Object[0];
        arSize = 0;
    }

}