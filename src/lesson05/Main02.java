package lesson05;

public class Main02 {
    public static void main(String[] args) {
        String s = "";

        long start = System.nanoTime();
        long end;
        for (int i = 0; i < 1000; i++) {
            s += i + " ";
        }
        end = System.nanoTime();
        System.out.println(s);
        System.out.println(end - start);

        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            sb.append(i).append(" ");
        }
        end = System.nanoTime();
        System.out.println(sb);
        System.out.println(end - start);
    }
}
