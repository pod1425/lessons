package lesson18;

public class Main04 {

    public static void doSomething() throws Exception {
        throw new Exception("haha checked");
    }
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
