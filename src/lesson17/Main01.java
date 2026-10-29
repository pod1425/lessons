package lesson17;

public class Main01 {
    // information expert - всі класи керують лише своїми даними
    static class BankAccount {
        private double balance = 0;

        public void deposit(double amount) {
            if (amount > 0)
                balance += amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.deposit(100);
        System.out.println(ba.getBalance());
    }
}
