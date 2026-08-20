package lesson12.hw;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    MyArray<Integer> a = new MyArray<>(10);
    MyArray<String> b = new MyArray<>(5);
    b.add("anhfbds");
    b.add("agfvfvf");
    b.add("a1d1sa");
    b.add("aadad");
    b.add("adada");

    a.addAll(List.of(4,5,8,9,2,1,2,3,4));
    a.addAll(List.of(4,5,8,9,2,1,2,3,4));
    a.addAll(List.of(4,5,8,9,2,1,2,3,4));

    System.out.println(a.contains(2));

    System.out.println(a.size());
    System.out.println(a.size());
    System.out.println(a.size());
    for (String elemts : b){
      System.out.print(elemts + " ");
    }
    System.out.println(Arrays.toString(a.toArray()));



  }
}
