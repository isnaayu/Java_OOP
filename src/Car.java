public class Car {
//    field/attribut
    private String name;
    private boolean isStart;
//    Primitif
    int Years;
//    Non-Primitif
    private Integer fuel;

//    constructor
    public Car(){
//        Default
    }
    public Car(String name, boolean isStart, Integer fuel) {
        this.name = name;
        this.isStart = isStart;
        this.fuel = fuel;
    }
//    Untuk mengakses dan memodifikasi method/field private
//    Bisa menggunakan Setter dan Getter
//    Getter -> Untuk mengakses metod private
    public String getName(){
        return this.name;
    }

    public boolean getIsStart(){
        return this.isStart;
    }

    public Integer getFuel(){
        return this.fuel;
    }

//    Setter -> digunakan untuk memodifikasi method private

    public void setName(String name){
        this.name = name;
    }

    public void setIsStart(boolean isStart){
        this.isStart = isStart;
    }

    public void setFuel(Integer fuel){
        this.fuel = fuel;
    }

    public void started(){
        System.out.println("Bremmm");
    }

    public Integer cekFuel(){
        return fuel;
    }

    public String print(){
        return "Car: name : "+name+ " is start "+isStart+ " fuel "+ fuel;
    }
}
