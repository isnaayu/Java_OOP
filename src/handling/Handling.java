package handling;

public class Handling {
    public static void main(String[] args) {
//        Error checked => error yang tidak dicek saat compile
//        String[] trainee = {"Isna", "andi", "yogi"};
//        System.out.println(trainee[3]);
//        Program berjalan dan berhenti ketika terjadi error

            /*Cara melakukan error handling ada 2
            1. Melakukan validasi

            2. melakukan blok try catch
            try berisi kode yang beresiko error
            catch kondisi untuk menangani error
            * */
        System.out.println("1");
        try {
            String[] trainee = {"Isna", "andi", "yogi"};
            System.out.println(trainee[3]);
        }catch (Exception e){
//            Jika tidak tau error yang terjadi secara spesifik maka bisa menggunakan kelas parent
            System.out.println(e.getMessage());
        }
        System.out.println("2");

        System.out.println();

        System.out.println("1");
        try {
            String[] trainee = {"Isna", "andi", "yogi"};
            System.out.println(trainee[3]);
        }catch (RuntimeException e){
//            Atau bisa menggunakan kelas runtime jika tau terjadi error pada kelas checked atau unchecked
            System.out.println(e.getMessage());
        }
        System.out.println("2");

        System.out.println();

        System.out.println("1");
        try {
            String[] trainee = {"Isna", "andi", "yogi"};
            System.out.println(trainee[3]);
        }catch (IndexOutOfBoundsException e){
//            Atau bisa menggunakan kelas secara spesifik dengan menggunakan tipe error
            System.out.println(e.getMessage());
        }
        System.out.println("2");

        System.out.println();

        System.out.println("1");
        try {
            String[] trainee = {"Isna", "andi", "yogi"};
            System.out.println(trainee[3]);
        }catch (IndexOutOfBoundsException | NullPointerException e){
//            Atau bisa menggunakan kelas secara spesifik dengan beberapa kemungkinkan menggunakan tipe error
            System.out.println(e.getMessage());
        }
        System.out.println("2");

        System.out.println();

        System.out.println("1");
//        jika terjadi error maka akan langsung kedalam penanganan error, error hanya menangkap satu
//        untuk melihat lebih jelas letak error namun terjadi banyak error maka bisa menggunakan debugging
        try {
            String[] trainee = {"Isna", "andi", "yogi"};
            System.out.println(trainee[3]);
            System.out.println(trainee[4]);
            System.out.println("jika aman tidak ada erorr");
        }catch (IndexOutOfBoundsException | NullPointerException e){
//            Atau bisa menggunakan kelas secara spesifik dengan beberapa kemungkinkan menggunakan tipe error
            System.out.println(e.getMessage());
            System.out.println("jika terjadi error");
        }finally {
            System.out.println("dijalankan ada atapun tidak ada error");
        }
        System.out.println("2");

        System.out.println();



        System.out.println("untuk throw");

//        getName(4);

//        try {
//            getName(8);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }

//        Jika ingin menggunakan exceptions parent pada unchecked
        try {
            getName(8);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            getAddress(8);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void getName(Integer index) throws Exception {
        Integer[] angka = {1,2,3,4};
//        jika ditangani menggunakan try catch
//        try {
//            System.out.println(angka[index]);
//        }catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }

//        System.out.println(index);
        if (index>angka.length)
            throw new Exception("Anda error");

//        System.out.println("g");
    }

    public static void getAddress(Integer index) throws NotFoundExcetions {
        Integer[] angka = {1,2,3,4};
        if (index>angka.length)
            throw new NotFoundExcetions("Anda error");

    }
}
