package collection;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ExampleArrayList {
    public static void main(String[] args) {
        ArrayList<String> trainee = new ArrayList<>();

        trainee.add("Adam");
        trainee.add("Ibnu");
        trainee.add("Andi");
        trainee.add("baim");
        trainee.add("Alvin");
        trainee.add("mikhael");

        Collection<String> trainee2 = List.of("Baskara", "Isna", "Fabian");
        trainee.remove(2);

        trainee.addAll(trainee2);
        System.out.println(trainee);

//        String[] pascal14 = new String[6];
        String[] pascal14 = {"Yazid", "fikrom", "Dimas", "Leo"};
        String[] pascal14Again = Arrays.copyOf(pascal14, 7);

        List<Car> listMobil = new ArrayList<>();
        Car tesla = new Car("Tesla", true, 900);
        Car hrv = new Car("hrv", true, 900);

        listMobil.add(tesla);
        listMobil.add(hrv);

        System.out.println(listMobil);
        System.out.println(listMobil.contains(tesla));
    }

}
