package lesson10;

import java.util.*;

public class Main07 {
    public static void main(String[] args) {
        int[] array = new int[] {11, 65, 88, 95, 13};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        List<Integer> list = List.of(11, 65, 88, 95, 13);
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        List<Integer> linkedList = new LinkedList<>(list);
        for (int i : linkedList) {
            System.out.print(i + " ");
        }
        System.out.println();
        Set<Integer> set = new HashSet<>(list);
        for (int i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
        Queue<Integer> queue = new PriorityQueue<>(list);
        for (int i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
        Set<Integer> tree = new TreeSet<>(list);
        for (int i : tree) {
            System.out.print(i + " ");
        }
    }
}
