package lesson10;

public class Main06 {
    public static void main(String[] args) {
        MyArray arr = new MyArray(10);
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, 12 + i * 2);
        }
        for (Integer elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
