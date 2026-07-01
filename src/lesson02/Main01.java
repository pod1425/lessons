package lesson02;

public class Main01 {
    public static void main(String[] args) {
        Human human1 = new Human("Jack", 23, 1.8);
        Human human2 = new Human("Bob", 24, 1.79);
        human1.introduce();
        human1.setAge(25);
        human1.introduce();
        human1.setSpecies("Sapiens");
        System.out.println(human2.getSpecies());
    }
}
