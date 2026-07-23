package lesson06;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        System.out.println(Character.getNumericValue(ch));
        System.out.println("digit - " + Character.isDigit(ch));
        System.out.println("letter - " + Character.isLetter(ch));
        System.out.println("Space - " + Character.isWhitespace(ch));
    }
}
