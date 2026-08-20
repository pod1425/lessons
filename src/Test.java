public class Test {

    public static void main(String[] args) {
        for (double i = 0, j = 0; i <= 15; i += 15/12.0, j++) {
            System.out.println(j + ": " + (int)i);
        }
    }
}
