package lesson08;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // InputMismatchException якщо ввести букви
        System.out.println("Hello".charAt(a)); // StringIndexOutOfBoundsException якщо а >= 5
        int[] arr = new int[2];
        arr[a] = 45; // ArrayIndexOutOfBoundsException якщо a >= 2
        System.out.println(4 / a); // ArithmeticException якщо a = 0

    }
}
