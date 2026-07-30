package lesson07;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // number -?[0-9]+(\.[0-9]+)? or -?\d+(\.\d+)?

        String regex = "[A-Za-z\\d_.]{3,63}@([A-Za-z\\d]+\\.)+[A-Za-z\\d]+";
        Pattern pattern = Pattern.compile(regex);

        String s = "NyMail129@gmail.com";
        if (s.matches(pattern.pattern())) {
            System.out.println("Match!");
        } else {
            System.out.println("NO match.");
        }
    }
}
