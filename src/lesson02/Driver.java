package lesson02;

public class Driver extends Human {
    private Car car;

    public Driver(String name, int age, double height) {
        super(name, age, height);
    }

    public void tellAboutCar() {
        System.out.println("I have a " + car.getColor() + " " + car.getBrand() + "!");
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
