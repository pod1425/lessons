package lesson18;

public class Main05 {

    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from 1");
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            throw new IllegalArgumentException("haha");
        });
        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("Hello from 2");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        th1.start();
        th2.start();
        System.out.println("Start!");
        Thread.sleep(4000);
        throw new IllegalArgumentException("main dead");

    }
}
