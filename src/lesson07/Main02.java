package lesson07;

public class Main02 {
    public static void main(String[] args) {
        String instruction = "aaabbbabab";
        for (int i = 0; i < instruction.length(); i++) {
            if (instruction.charAt(i) == 'a') {
                System.out.println("Hit!");
            }
            else if (instruction.charAt(i) == 'b') {
                System.out.println("Pull!");
            }
        }
    }
}
