package lesson08;

import java.util.Scanner;

public class Main02 {

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            calculate();
        } catch (ArithmeticException e) {
            System.out.println("Ділити на ноль не можна!!!!!!!!");
        }
    }
}
