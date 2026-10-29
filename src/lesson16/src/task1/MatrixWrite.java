package lesson16.src.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MatrixWrite implements AutoCloseable{
    private FileWriter fw;

    public MatrixWrite(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        this.fw = new FileWriter(file );
    }

    public static void write(boolean[][] arr) throws IOException {
        File file = new File("matrix.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter fw = new FileWriter(file)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    fw.write((arr[i][j] ? "1" : "0") + " ");
                }
                fw.write("\n");
            }
        }
    }

    @Override
    public void close() throws IOException {
        if (fw != null) {
            fw.close(); // Саме тут ми фізично закриваємо файл
        }
    }
}