package lesson15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main02 {
    public static void main(String[] args) {
        try (OutputStream fos = new FileOutputStream("result.txt")) {
            String str = "Hello";

            fos.write(str.getBytes());
            fos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
