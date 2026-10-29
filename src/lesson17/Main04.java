package lesson17;

public class Main04 {
    // High cohesion - кожен клас виконує тільки свої задачі
    // в певному чітко окресленому діапазоні
    static class CheckoutController {
        public void processCart() {}
        public void applyCoupon() {}
        public void finalizeOrder() {}
        public void transferToSeller() {}
    }

    static class CartController {
        public void addToCart() {}
        public void removeFromCart() {}
        public void changeQuantity() {}
    }

    public static void main(String[] args) {

    }
}
