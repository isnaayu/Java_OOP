package util;

public enum Day {
    SUNDAY("Senin"),
    MONDAY("Selasa"),
    WEDNESDAY("Rabu"),
    TUESDAY("Selasa"),
    THURDAY("Kamis"),
    SATURDAY("Sabtu"),
    FRIDAY("Jumat");

    private String name;

    public String getName(){
        return name;
    }

    Day(String name){
        this.name = name;
    }
    public Day nextDay(){
        return values()[this.ordinal()+1];
    }
}
