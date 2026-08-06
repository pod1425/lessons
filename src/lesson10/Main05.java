package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("onion", 10);
        map.put("cabbage", 15);
        map.put("cucumber", 20);
        map.put("potato", 18);
        map.put("cucumber", 25);
        map.putIfAbsent("potato", 20);


        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine().toLowerCase();
        System.out.println(map.get(product));
        System.out.println(map.getOrDefault(product, 0));
        if (map.containsKey(product)) {
            System.out.println("Price is: " + map.get(product));
        } else {
            System.out.println("No such product");
        }

        System.out.println("All prices:");
        String[] products = map.keySet().toArray(new String[0]);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + ": " + map.get(products[i]));
        }

    }
}
