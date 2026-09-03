package lesson14;

import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        List <Integer> arr = new ArrayList<>(List.of(1,2,-3,4,-5,6,-7,8,9));
        List<String> str = new ArrayList<>( List.of("apple grape tomato onio onio")) ;
        List<String> str02 = new ArrayList<>( List.of("apple","grape" ,"tomato", "onio",  "onioooooooooooo"));

        System.out.println(arr.stream().filter(s -> s < 0).count());
        System.out.println(str.stream().flatMap(s -> Arrays.stream(s.split(" "))).filter(s -> s.equals("onio")).count());
        System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        System.out.println(str02.stream().allMatch(s -> s.length() > 10));

        System.out.print(arr.stream().sorted(Comparator.reverseOrder()).limit(5).toList());

    }
}