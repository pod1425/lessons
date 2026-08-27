package lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "pear", "potato", "plum", "tomato", "carrot","cucumber",
                "pumpkin", "melon",  "cabbage", "onion", "lettuce", "tomato", "pumpkin"
        ));

        // how many letters
        char letter = 'p';

        System.out.println(list.stream()
                .map(String::toLowerCase)
                .map(s -> s.replaceAll("[^" + letter + "]", ""))
                .mapToInt(String::length)
                .sum());
        System.out.println(list.stream()
                .distinct()
                .sorted((l,r) -> Integer.compare(r.length(), l.length()))
                .limit(3)
                .sorted(Comparator.comparingInt(String::length))
                .toList());
        System.out.println(list.stream()
                .filter(
                        s -> s.length() == Arrays.stream(s.split(""))
                                .distinct()
                                .count()
                )
                .toList()
        );
    }
}
