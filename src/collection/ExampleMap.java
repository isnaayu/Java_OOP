package collection;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
//        Map(Key, Value)
        Map<String, Integer> oldTrainee = new HashMap<>();

        oldTrainee.put("Ibnu", 27);
        oldTrainee.put("Yazid", 24);
        oldTrainee.put("Dimas", 28);

        System.out.println(oldTrainee.get("Ibnu"));
        oldTrainee.replace("Yazid", 17);
        System.out.println(oldTrainee);
        oldTrainee.remove("Dimas");
        System.out.println(oldTrainee);

        Map<Integer, Car> listMobil = Map.of(1, new Car("Tesla", true, 900));

        Map<String, String> address = Map.of("Wisma", "Ragunan", "Enigma", "Ragunan", "Depok", "Jakarta");
//        address.remove("enigma"); // Immutable

        System.out.println(address);


    }
}
