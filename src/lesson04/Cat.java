package lesson04;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void feed() {
        System.out.println("Cat eats dry feed");
    }
}
