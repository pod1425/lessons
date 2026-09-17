package lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main05 {
    public static void main(String[] args) {
        String filePath = "text.txt";

        try {
            List<String> list = Files.readAllLines(Path.of(filePath));
            System.out.println(list);

            File file = new File(filePath);

            byte[] buf = Files.readAllBytes(file.toPath());
            for (int i = 0; i < buf.length; i++) {
                System.out.print((char)buf[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
