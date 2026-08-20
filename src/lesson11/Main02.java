package lesson11;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main02 {
    public static void main(String[] args) {
        // void sayHello()
        Runnable helloFunction = () -> System.out.println("Hello!!");

        helloFunction.run();
        // void print(int i) {...}
        Consumer<Integer> numberPrinter = i -> System.out.println("Number: " + i);
        // Scanner getScanner() {...}
        Supplier<Scanner> scannerSupplier = () -> { return new Scanner(System.in); };
        // Scanner scanner = getScanner();
        Scanner scanner = scannerSupplier.get();
        int a = scanner.nextInt();
        // print(a)
        numberPrinter.accept(a);
    }
}
