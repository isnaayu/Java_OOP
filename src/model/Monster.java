package model;

public class Monster implements Action{
    private String name;
    private Integer hp;
    private Integer damage;

    public Monster(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public Monster() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }

    @Override
    public void attackBy(Monster monster){
        if (monster.equals(this)){
            System.out.println("Cannnot hit my self");
            return;
        }
        this.hp -= monster.getDamage();
    }

    @Override
    public void attackBy(Hero hero){
        this.hp -= hero.getDamage();
    }

//    public void attackBy(Monster monster){
//        this.hp -= monster.getDamage();
//    }
}
