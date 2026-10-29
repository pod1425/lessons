package lesson16.src.task2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // введіть назву, введіть кількість людей....

        // це можна залишити
        City city = new City("Kyiv", 100000, 60300, CityType.CAPITAL, 988, 25000, 800000, "Ukraine");
        city.say();
        System.out.println();

    }
}

