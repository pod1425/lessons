package lesson14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) throws IOException {
        File file = new File("numbers.txt");
        List<Integer> list = new ArrayList<>(List.of(4, 5, 9, 8, 4, 1,8 ,89, 1));

        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(list.toString());
        }

    }
}
