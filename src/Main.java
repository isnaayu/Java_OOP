import model.*;
import util.Day;

public class Main {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);
        Day days = Day.SUNDAY;
        switch (days){
            case SUNDAY:
                System.out.println("It Sunday");
                break;
            case MONDAY:
                System.out.println("It Monday");
                break;
        }

        for (Day day : Day.values()){
            System.out.println(day.getName()+ " "+days.ordinal());
        }

        System.out.println(days.nextDay());

//        Cat cat = new Cat();
//        String result1 = cat.makeSound("Meong");
//        cat.typeAnimal("Cat");
//
//        Dog dog = new Dog();
//        String result2 = dog.makeSound("Guk");
//
//        System.out.println(result1);
//        System.out.println(result2);
//
////        Untuk mengubah tipe datanya
//        Animal garong = new Cat();
//        Cat orange = (Cat) garong; //DownCasting -> dari bentuk umum ke spesifik
//
//        Dog myDog = new Dog();
//        Animal myAnimal = (Animal) myDog; //UpperCating .=> dari bentuk spesifik ke umum


//        Block newBlock = new Block(20, 30,25);
//        System.out.println(newBlock.getVolumeBlock());
//        Hero nana = new Hero("nana", 600,80, 100);
//        Hero Gatotkaca = new Hero("Gatot Kaca", 1000,80, 100);
//        Hero Angela = new Hero("Gatot Kaca", 700,80, 100);
//        System.out.println(nana);
//
//        Hero gatotKaca = new Hero("gatotKaca", 1000, 80, 100);
//        Monster butoIjo = new Monster("Monster", 800, 50);
//        gatotKaca.attackBy(butoIjo);
//        System.out.println(gatotKaca);
//
//        butoIjo.attackBy(butoIjo);
//
//        butoIjo.attack(gatotKaca);
//        System.out.println(gatotKaca);
    }
}