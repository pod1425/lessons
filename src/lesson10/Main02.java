package lesson10;

import java.util.LinkedList;
import java.util.Queue;

public class Main02 {
    public static void main(String[] args) {
        Queue<Double> queue = new LinkedList<>();

        queue.offer(4.248949);
        queue.offer(4.3);
        queue.offer(41.02);
        queue.offer(4144.64001);
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.size());

    }
}
