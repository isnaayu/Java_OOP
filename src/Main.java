import model.Block;
import model.Hero;
import model.Monster;

public class Main {
    public static void main(String[] args) {
//        Block newBlock = new Block(20, 30,25);
//        System.out.println(newBlock.getVolumeBlock());
//        Hero nana = new Hero("nana", 600,80, 100);
//        Hero Gatotkaca = new Hero("Gatot Kaca", 1000,80, 100);
//        Hero Angela = new Hero("Gatot Kaca", 700,80, 100);
//        System.out.println(nana);

        Hero gatotKaca = new Hero("gatotKaca", 1000, 80, 100);
        Monster butoIjo = new Monster("Monster", 800, 50);
        gatotKaca.attackBy(butoIjo);
        System.out.println(gatotKaca);

        butoIjo.attackBy(butoIjo);
//
//        butoIjo.attack(gatotKaca);
//        System.out.println(gatotKaca);
    }
}