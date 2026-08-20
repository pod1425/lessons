package lesson12;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hello my friends");
        list.add("Hello!!!");
        list.add("Ayo wassup dawg");
        list.add("Greetings");
        list.add("Hi");

        list.sort((e1, e2) -> {
            if (e1.length() > e2.length()) return 1;
            if (e1.length() < e2.length()) return -1;
            return 0;
        });

        System.out.println(list);
    }
}
