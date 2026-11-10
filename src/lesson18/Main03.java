package lesson18;

public class Main03 {
    /**
     * Throws: RuntimeException when always
     */
    public static void doSomething() {
        throw new RuntimeException("haha");
    }

    public static void main(String[] args) {
        try {
            doSomething();
            // if (ex instanceof ArithmeticException)
        } catch (ArithmeticException ex) {
            System.out.println("caught: " + ex.getMessage());
        }

    }
}
