package lesson17;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    // Creator - клас створює об'єкти допоміжних класів і сам ними керує
    public static class Order {
        private List<OrderItem> items = new ArrayList<>();

        public void addItem(String productName, int quantity) {
            items.add(new OrderItem(productName, quantity));
        }
        public void print() {
            for (OrderItem i : items) {
                System.out.println(i.quantity + " " + i.name);
            }
        }
    }

    static class OrderItem {
        public String name;
        public int quantity;

        public OrderItem(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }
    }
    // Controller - розділення логіки програми на окремі модулі
    // + відокремлення бізнес-логіки від інтерфейсу
    class CheckoutController {
        public void checkout(Order order) {
            System.out.println("Checking out: ");
            order.print();
            System.out.println("Plez pay mone");
        }
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.addItem("Powerbank", 1);
        order.addItem("Flashlight", 2);
        order.addItem("Phone case", 1);

    }
}
