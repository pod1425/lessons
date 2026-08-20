package lesson11;

public class Main01 {

    public static void main(String[] args) {
        // auto function = (int a)[]{ cout << a; }
        Executable function = () -> {
            System.out.println("hello");
        };
        System.out.println("1");
        function.execute();
    }
}
