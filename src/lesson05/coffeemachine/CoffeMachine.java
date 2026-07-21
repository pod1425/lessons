package lesson05.coffeemachine;

import java.util.Scanner;

public class CoffeMachine implements fuct{
    public static final String PIN = "8956";

    private int money;
    private int cups ;
    private int water;
    private int milk ;
    private int powder ;

    public CoffeMachine(int money, int cups, int water, int milk, int powder) {
        this.money = money;
        this.cups = cups;
        this.water = water;
        this.milk = milk;
        this.powder = powder;
    }
    public String getinput () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public void cleanscreen(){
        System.out.println(" " .repeat(30));
    }


    public boolean enterPin() {
        while(true){
            System.out.println("Enter PIN");
            String input = getinput();

            if (input.equals("0")){
                return false;
            }
            if (input.equals(PIN)) {
                return true;
            }
            System.out.println("Try again: ");
        }
    }
    public boolean hasingridients (Recipe r) {
        return cups >= r.getCupsnumber()
                && milk >= r.getMilknumber()
                && powder >= r.getPowdernumber()
                && water >= r.getWaternumber();
    }

    public void spendingridients(Recipe r){
        water -= r.getWaternumber();
        cups -= r.getCupsnumber();
        milk -= r.getMilknumber();
        powder -= r.getPowdernumber();
    }
    public void refill(){
        powder = 500;
        milk = 3000;
        water = 7000;
        cups = 50;
    }

    public void makecoffee(Recipe r) {
        if (!hasingridients(r)){
            System.out.println("not enough");
            return;
        }
        spendingridients(r);
        money += r.getPrice();
        System.out.println("Take your coffe");
    }

    public  void takeMoney() {
        System.out.println("You took " + money + " money.");
        money = 0;
    }

    public void coffeemenu() {
        Recipe espresso = new Recipe("Espresso", 3, 1, 15, 150, 1);
        Recipe latte = new Recipe("Latte", 5, 1, 50, 100, 1);
        Recipe americano = new Recipe("Americano", 4, 1, 0, 100, 1);
        Recipe mocacchino = new Recipe("Mocacchino", 6, 1, 100, 100, 2);

        Recipe[] menu = {americano, latte, espresso, mocacchino};

        System.out.println("==Coffee Menu==");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " - " + menu[i].getName());
        }
        System.out.println("0 - Back");

        int choice = Integer.parseInt(getinput());
        if (choice == 0) {
            return;
        }
        else if (choice <= menu.length) {
            makecoffee(menu[choice - 1]);
        }
        else {
            System.out.println("Invalid choice.");
        }
        cleanscreen();
    }

    public void servicemenu() {
        if (!enterPin()) {
            return;
        }

        while (true){
            System.out.println("=== SERVICE MENU ===");
            System.out.println("1 - Take money");
            System.out.println("2 - Refill ingredients");
            System.out.println("3 - Shut down machine");
            System.out.println("0 - Back");

            String choice = getinput();
            switch (choice){
                case "1":
                    takeMoney();
                    break;
                case  "2":
                    refill();
                break;
                case "3":
                    System.exit(0);
                break;
                case "0":
                    return;
            }
        }
    }

    public void mainmenu() {
        while (true){
            System.out.println("=== COFFEE MACHINE ===");
            System.out.println("1 - Buy coffee");
            System.out.println("2 - Open machine");
            System.out.println("0 - Exit");

            String choice = getinput();

            switch (choice){
                case "1":
                    coffeemenu();
                    break;
                case "2":
                    servicemenu();
                break;
                case "0":
                    return;
                default:
                    System.out.println("Invalid symvol");
            }

        }
    }

}
