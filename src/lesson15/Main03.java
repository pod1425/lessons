package lesson15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main03 {
    public static void main(String[] args) throws IOException {
        File file = new File("res.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter fw = new FileWriter("res.txt")) {
            fw.write("Hello!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
