package example_static;

public class Counter {
    public static void main(String[] args) {
        Handphone.brand = "Xiamoi";

        Handphone apple = new Handphone();
        apple.version = "14 Pro Max";

        Handphone.starting();
        apple.powerOff();


    }

    public static void sayHello(){
        System.out.println();
//        Jika dalam kelas yang sama, untuk memanggil method static harus sama dengan statit
            sayHello();
//        Jika bukan static harus di instanciate
            Counter co = new Counter();
            co.sayHello2();
    }

    public void sayHello2(){
        System.out.println();
    }
}
