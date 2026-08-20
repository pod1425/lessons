package lesson11;

import java.util.List;
import java.util.function.Function;

public class Main03 {
    private static final List<String> SWEAR_WORDS = List.of("shit", "piss", "poop", "cunt", "fuck");

    private static final Function<String, String> stringCensorMapper = s -> {
        return SWEAR_WORDS.contains(s.toLowerCase().trim().replaceAll("[^a-z]", ""))
                ? "*".repeat(s.trim().length()) : s;
    };

    private static void printCensored(String message) {
        String[] words = message.trim().split(" ");

        for (String word : words) {
            System.out.print(stringCensorMapper.apply(word) + " ");
        }
    }

    public static void main(String[] args) {
        printCensored("This shit is ridiculous!!!");
    }
}
