package model;

public class InformationCharacter extends Character{

    int id;
    String name;
    String typeAttack;
    String aspect;
    int strength;
    int agility;
    int intelligence;
    int health;
    int mana;

    public InformationCharacter(int id, String name, String typeAttack, String aspect, int strength, int agility, int intelligence, int health, int mana) {
        this.id = id;
        this.name = name;
        this.typeAttack = typeAttack;
        this.aspect = aspect;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.health = health;
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeAttack() {
        return typeAttack;
    }

    public void setTypeAttack(String typeAttack) {
        this.typeAttack = typeAttack;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "InformationCharacter{" +
                "name='" + name + '\'' +
                ", typeAttack='" + typeAttack + '\'' +
                ", aspect='" + aspect + '\'' +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                ", health=" + health +
                ", mana=" + mana +
                '}';
    }



    //-Новый метод получения персонажа из драфта и выод информации о его статах
    // (имя, тип атаки, назначенный аспект, сила, ловкость, интелект, запас здоровья, запас маны)

}
