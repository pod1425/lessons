package lesson06;

import java.math.BigInteger;

public class Main03 {
    public static void main(String[] args) {
        BigInteger i = new BigInteger("9999999465345" +
                "37469999999453453783753797777777777756656565653111111111119999999999990");
        System.out.println(i.pow(496).toString().length());

    }
}
