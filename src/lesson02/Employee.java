package lesson02;

public class Employee extends Human {
    private int salary;

    public Employee(String name, int age, double height, int salary) {
        super(name, age, height);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
