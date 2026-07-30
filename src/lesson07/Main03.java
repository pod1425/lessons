package lesson07;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main03 {
    public static void main(String[] args) {
        String regex = "[^.?!]+[.?!]\\s?";
        System.out.println();
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text.matches(regex));
        Matcher matcher = pattern.matcher(text);
        int count = 1;

        System.out.println(matcher.hasMatch());
        while (matcher.find()) {
            System.out.println(count + ": " + matcher.group());
            count++;
        }

    }
}
