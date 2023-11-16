package model;

public class Hero {
    private String name;
    private Integer hp;
    private Integer damage;
    private Integer mana;

    public Hero(String name, Integer hp, Integer damage, Integer mana) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.mana = mana;
    }

    public Hero() {
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

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", mana=" + mana +
                '}';
    }

    public void attackBy(Hero hero){
        if (hero.equals(this)){
            System.out.println("Cannnot hit my self");
            return;
        }
        this.hp -= hero.getDamage();
    }

    public void attackBy(Monster monster){
        this.hp -= monster.getDamage();
//        monster.setHp(monster.getHp()-this.getDamage());
    }
}
