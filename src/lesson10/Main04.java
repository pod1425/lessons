package lesson10;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main04 {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        set.add(4.2);
        set.add(44.2);
        set.add(4.2);
        set.add(14.2);
        set.add(4.02);
        System.out.println(set);
        set.clear();
        List<Double> list = List.of(45.0, 62.0, 56.0, 89.0, 11.0, 32.0, 11.0, 66.0, 62.0, 33.0, 4.0);
        set.addAll(list);
        System.out.println(list);
        for (Double d : set) {
            System.out.print(d + " ");
        }
    }
}
