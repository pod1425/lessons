package lesson02;

public class Main03 {
    public static void main(String[] args) {
        Human human1 = new Human("Jack", 23, 1.8);
        Human human2 = new Employee("Bob", 25, 1.79, 25000);
        Human human3 = new Driver("Matt", 28, 1.68);
        Car car = new Car("Daewoo Matiz", "Red");
        Driver winner = null;
        if (human1 instanceof Driver) {
            winner = (Driver) human1;
        } else if (human2 instanceof Driver) {
            winner = (Driver) human2;
        } else if (human3 instanceof Driver) {
            winner = (Driver) human3;
        }
        winner.setCar(car);
        winner.introduce();
        winner.tellAboutCar();
    }
}
