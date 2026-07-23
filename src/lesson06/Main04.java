package lesson06;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main04 {
    public static void main(String[] args) {
        BigDecimal i = new BigDecimal("0.0200000000000000001000000000000000000000000001");
        System.out.println(i.multiply(new BigDecimal("2")).toString());

    }
}
