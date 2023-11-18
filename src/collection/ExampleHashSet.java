package collection;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>(); //mutable
        Set<String> fruitsAgain = Set.of("Jambu"); //Immutable, tidak bisa ditambah lagi

        fruits.add("Semangka");
        fruits.add("Mangga");
        fruits.add("Jambu");
        fruits.add("Jeruk");

        System.out.println(fruits);
//        Hash Set di tampilkan secara acak

        for (String newFruits : fruits){
            System.out.println(newFruits);
        }
    }

}
