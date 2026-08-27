package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "potato", "potato", "celery", "tomato", "carrot","cucumber",
                "pumpkin", "pumpkin",  "cabbage", "onion", "lettuce", "tomato","pumpkin"
        ));
        System.out.println(list);

        System.out.println(list.stream().filter(s -> s.length() > 6).toList());
        System.out.println(list.stream().limit(4).toList());
        System.out.println(list.stream().skip(4).toList());
        //System.out.println(list.stream().peek(System.out::println).toList());
        System.out.println(list.stream().map(s -> s.length()).toList());
        System.out.println(list.stream().map(s -> "*".repeat(s.length())).toList());
        System.out.println(list.stream().distinct().toList());
        System.out.println(list.stream().sorted().toList());
        System.out.println(list.stream().dropWhile(s-> s.length() >= 6).toList());

        System.out.println(list.stream().filter(s -> s.length() > 6).distinct().count());
        System.out.println(list.stream().map(String::length).reduce((accum, elem) -> accum + elem).get());
        System.out.println(list.stream().reduce((accum, elem) -> accum + elem).get().length());
    }
}
