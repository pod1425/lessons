package lesson04;

public class Fish extends Pet {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("blub blub");
    }

    @Override
    public void feed() {
        System.out.println("Fish eats fish food");
    }
}
