package lesson06;

public class Main05 {
    static class Dummy{}

    public static void main(String[] args) {
        Dummy d1 = new Dummy();
        Dummy d2 = new Dummy();

        System.out.println(d1 == d2);
        d1 = d2;
        System.out.println(d1 == d2);

        String s1 = "hello"; // add to string pool
        String s2 = "hello"; // get from string pool
        System.out.println(s1 == s2);
    }
}
