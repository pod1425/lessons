package lesson05;

public class Main01 {
    public static void main(String[] args) {
        String s = " Hello  John Doe";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf('e', 2));
        System.out.println(s.trim());
        System.out.println("*a".repeat(8));
        System.out.println(s.indent(8));
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                System.out.println(arr[i]);
            }
        }
        System.out.println(s.endsWith("Doe"));
        System.out.println(s.endsWith("Smith"));
        System.out.println(s.substring(2, 10));
        System.out.println("   ".isBlank());
        System.out.println("   ".isEmpty());
        System.out.println(s.replace("e", "o"));
        System.out.println(s.replace("e", ""));
        System.out.println(s.replace(" ", ""));
    }
}
