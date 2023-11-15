public class Main {
    public static void main(String[] args) {
//        Instansiasi -> membuat objek dari kelas
        Car terios = new Car("Terios", true, 80);
//        Memanipulasi Properti secara langsung
        terios.setName("Terios");
        terios.setIsStart(true);
        System.out.println(terios.getName());
        System.out.println(terios.getFuel());

        terios.started();
        System.out.println(terios.cekFuel());
        System.out.println(terios.print());





    }
}