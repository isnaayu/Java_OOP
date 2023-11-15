public class Car {
//    field/attribut
    String name;
    boolean isStart;
//    Primitif
    int Years;
//    Non-Primitif
    Integer fuel;

//    constructor
    public Car(){
//        Default
    }
    public Car(String name, boolean isStart, Integer fuel) {
        this.name = name;
        this.isStart = isStart;
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
