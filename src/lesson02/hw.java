package lesson02;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        System.out.println("Ведіть a");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double res;
        if (a <= -8) {
            res = 6 * Math.pow(a, 3) - 8;
            System.out.println("Результат: " + res);
        } else if (a < 0) {
            res = Math.pow(a, 3) - 8;
            System.out.println("Результат: " + res);
        } else {
            res = 2 * Math.pow(a, 2);
            System.out.println("Результат: " + res);
        }
    }
}
