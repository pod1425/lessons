package lesson04;

import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 4 * (5 + i);
        }
        for (int i = 0; i < array.length; i++) {
            int ind = random.nextInt(array.length);
            int temp = array[i];
            array[i] = array[ind];
            array[ind] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
