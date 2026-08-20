package lesson12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hello my Friends");
        list.add("Hello!!!");
        list.add("Ayo wassup DAWG");
        list.add("Greetings");
        list.add("HI");

        list.sort(Comparator.comparingInt(String::length));

        System.out.println(list);

        list.sort(Comparator.comparingInt(
                s -> s.replaceAll("[^A-Z]", "").length()));

        System.out.println(list);
    }
}
