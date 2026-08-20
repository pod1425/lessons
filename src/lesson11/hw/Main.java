package lesson11.hw;

import java.util.Arrays;
import java.util.Iterator;

class Main{
  public static void main(String[] args) {
    MyArray<Integer> a = new MyArray<>(10);

    a.add(1);
    a.add(1);
    a.add(1);
    a.add(1);
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(1);
    a.add(1);
    a.add(1);
    a.add(1);
    a.add(1);

    System.out.println(a.contains(2));
    System.out.println(a.size());
    System.out.println(a.size());
    System.out.println(a.size());
    for (int n : a) {
      System.out.print(n + " ");
    }
    System.out.println(Arrays.toString(a.toArray()));



  }
}
