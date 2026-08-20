package lesson12;

public class Main01 {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    System.out.println("a");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        th.run();
        th.join();
    }
}
