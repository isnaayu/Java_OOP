package collection;

import java.util.Iterator;
import java.util.List;

public class ExampleIterator {
    public static void main(String[] args) {
//        untuk mendefinisikan Iterator
        Iterable<String> vegetables = List.of("Seledri", "Bayam", "Kangkung");
//        Iterator untuk iterasi/perulangan
        Iterator<String> iterator = vegetables.iterator();

//        Iterator Menggunakan skema pointer

//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());

        iterator.next();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
