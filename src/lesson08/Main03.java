package lesson08;

public class Main03 {
    public static void main(String[] args) {
        try {
            throw new Exception("AAAAAAAAAAAAA");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
