package lesson04;

public class Main01 {
    public static void main(String[] args) {
        Pet cat = new Cat("Bobik");
        Pet fish = new Fish("Ding");

        Human human = new Human("Bob");
        human.setPet(fish);

        human.askAboutPet();

    }
}
