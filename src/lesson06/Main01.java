package lesson06;

public class Main01 {
    public static void main(String[] args) {
        int i = Integer.parseInt("123");
        System.out.println(i * 4);
        System.out.println(Integer.reverse(i));
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toString(i) + 2);
    }

}
