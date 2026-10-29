package lesson16.src.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1. Реалізуємо AutoCloseable
public class MatrixRead implements AutoCloseable {

    private Scanner scanner;

    // 2. Відкриваємо файл у конструкторі
    public MatrixRead(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("Файл не знайдено: " + fileName);
        }
        this.scanner = new Scanner(file);
    }

    // 3. Метод читання: тепер він повертає boolean[][]
    public boolean[][] read() {
        List rows = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                continue; // пропускаємо порожні рядки, якщо вони є
            }

            // Розбиваємо рядок на масив строк по пробілу
            String[] elements = line.split(" ");
            boolean[] row = new boolean[elements.length];

            // Заповнюємо рядок матриці
            for (int i = 0; i < elements.length; i++) {
                row[i] = elements[i].equals("1");
            }
            rows.add(row);
        }

        // Перетворюємо список рядків назад у звичайний двовимірний масив
        return (boolean[][]) rows.toArray(new boolean[0][]);
    }

    // 4. Обов'язковий метод для закриття ресурсу
    @Override
    public void close() throws IOException {
        if (scanner != null) {
            scanner.close();
        }
    }
}