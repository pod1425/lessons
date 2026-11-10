package lesson18;

public class Main01 {
    public static void main(String[] args) {
        ArithmeticException ex = new ArithmeticException("u stupid");
        System.out.println("Hello!");
        throw ex;
    }
}
