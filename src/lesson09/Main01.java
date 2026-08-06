package lesson09;

public class Main01 {

    public static void printContainer(Container<Double> c) {
        System.out.println("Contents: " + c.getValue());
    }

    public static void main(String[] args) {
        Container<String> container = new Container<>("Hello");
        Container<String> c = container;
        System.out.println(c.getValue());
        // printContainer(c); // помилка - не існує конверсії
    }
}
