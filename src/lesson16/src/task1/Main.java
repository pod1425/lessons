package lesson16.src.task1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

class Main {
    static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();
        boolean[][] arr = new boolean[10][20];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextBoolean();

                System.out.print(arr[i][j] ? 1 : 0 );
               System.out.print(" ");


            }
            System.out.println();
        }
        String fileName = "matrix.txt";

            try (MatrixWrite writer = new MatrixWrite(fileName)) {
                writer.write(arr);
                System.out.println("\nМатрицю успішно записано у файл " + fileName);
            } catch (IOException e) {
                System.err.println("Помилка під час запису файлу: " + e.getMessage());
                return; // припиняємо роботу, якщо не вдалося записати
            }

            // 3 та 5. Читання даних у блоці try-with-resources
            boolean[][] readArr = null;
            try (MatrixRead reader = new MatrixRead(fileName)) {
                readArr = reader.read();
                System.out.println("\nМатрицю успішно зчитано з файлу.");
            } catch (IOException e) {
                System.err.println("Помилка під час читання файлу: " + e.getMessage());
            }
            int conter = 0;
            if (readArr != null){

                for (int i = 0 ; i < readArr.length; i++){
                    for (int j = 0 ; j < readArr[i].length; j++){
                        if (!readArr[i][j]){
                            conter++;
                        }
                    }

                }
            System.out.println("Кількість вільних місць " + conter);

       }

    }
}
