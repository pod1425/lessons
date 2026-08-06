package lesson09;

public class Main02 {

    public static void printInfo(Human person) {
        System.out.println(person.getName());
    }

    // generic bound
    public static <T extends Human> void printContainerBound(Container<T> c) {
        T a = c.getValue();
        System.out.println(a.getName());
    }
    // generic wildcard
    public static void printContainerWildcard(Container<?> c) {
        // T a = c.getValue();
        System.out.println(c.getValue());
    }
    // bound wildcard
    public static void printContainerBoth(Container<? extends Human> c) {
        // T a = c.getValue();
        System.out.println(c.getValue());
    }

    public static void main(String[] args) {
        Human jobless = new Human("Max", 21);
        Employee employee = new Employee("Bob", 21, 2000);
        Container<Employee> ec = new Container<>(employee);
        Container<Human> jc = new Container<>(jobless);
        printContainerBound(ec);
        printContainerWildcard(ec);
        printContainerBound(jc);
        printContainerWildcard(jc);

        printInfo(employee);
    }
}
