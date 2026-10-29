package lesson16.src.task3;

public class main {
    static void main() {
        Computer computer = new Computer(2000 , 2 , 2048 , 310);
        Computer laptop = new Laptop(2000, 2, 2048 , 340 , 70);
        computer.information();

        System.out.println(   computer.calculatePrice());
        System.out.println(laptop.calculatePrice());
    }
}
