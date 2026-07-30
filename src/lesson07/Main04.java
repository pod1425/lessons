package lesson07;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main04 {
    public static void main(String[] args) {
        String regex = "#\\d+";

        Pattern pattern = Pattern.compile(regex);
        String text = "Order #456 and order #789 ready";
        Matcher matcher = pattern.matcher(text);
        int count = 1;

        while (matcher.find()) {
            System.out.println(count + ": " + matcher.group());
            count++;
        }

    }
}
