public class Main {
    public static void main(String[] args) {
//        Instansiasi -> membuat objek dari kelas
        Car terios = new Car("Terios", true, 80);
//        Memanipulasi Properti secara langsung
        terios.name = "Terios";
        terios.isStart = true;
        System.out.println(terios.name);
        System.out.println(terios.fuel);

        terios.started();
        System.out.println(terios.cekFuel());
        System.out.println(terios.print());





    }
}