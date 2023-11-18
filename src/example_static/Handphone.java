package example_static;

public class Handphone {
    public static String brand;
    public String version;

    public Handphone(){
        System.out.println("This is Constructor");
    }

    static{
        System.out.println("This is static");
    }

    public final static String YEAR = "2022";
    public final String MADE_IN = "Indonesia"; //Value tidak bisa diubah lagi

    //    Static itu bisa digunakan di method dan variabel
//    data, properti yang menggunakan static dia melekat pada class bukan objek
    public static void starting(){
        System.out.println("On Progress ....");
    }

    public final static void starting2(){
        System.out.println("On Progress ....");
    }

    public void powerOff(){
        System.out.println("OTW OFF");
    }
}
