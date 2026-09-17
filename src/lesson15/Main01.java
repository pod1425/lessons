package lesson15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) throws FileNotFoundException {
        //FileInputStream fis = null;

        try (FileInputStream fis = new FileInputStream("text.txt")) {
            byte[] buf = new byte[32];
            while (fis.read(buf) != -1) {
                for (int i = 0; i < buf.length; i++) {
                    System.out.print((char)buf[i]);
                }
                buf = new byte[32];
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
