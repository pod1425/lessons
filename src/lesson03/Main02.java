package lesson03;

public class Main02 {
    public static void main(String[] args) {
        Human human1 = new Human("Valera", 28, 1.81);
        Human human2 = new Human("Valera", 27, 1.61);
        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());


        if (human1.equals(human2)) {
            System.out.println("Same person");
        } else {
            System.out.println("Different people");
        }
    }
}
