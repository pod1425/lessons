package lesson15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class Main04 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("res.txt")) {
            CharBuffer cb = CharBuffer.allocate(32);
            fr.read(cb);
            System.out.println(cb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
