package lesson15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main06 {
    public static void main(String[] args) {
        String text = "Hello there!";
        Path path = Path.of("123.txt");
        try {
            Files.writeString(path, text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
