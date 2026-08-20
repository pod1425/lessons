package lesson12;

import java.util.Optional;

public class Main04 {
    public static void main(String[] args) {
        Integer i = null;

        System.out.println(i);
        //System.out.println(i.intValue());


        Optional<Integer> optional = Optional.empty();

        System.out.println(optional);
        System.out.println(optional.orElse(-100));
        optional = Optional.of(55);

        System.out.println(optional);
        System.out.println(optional.orElse(-100));
    }
}
