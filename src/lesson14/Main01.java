package lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        if (!file.exists()) {
            System.out.println("File doesnt exist!!!");
            return;
        }
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
