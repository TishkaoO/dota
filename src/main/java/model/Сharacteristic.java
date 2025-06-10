package model;

public class Сharacteristic {

   private int strength;
   private int agility;
   private int intelligence;
   private int health;
   private int mana;

    public Сharacteristic(int strength, int agility, int intelligence, int health, int mana) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.health = health;
        this.mana = mana;
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
        return "Statistica{"
                + "strength=" + strength
                + ", agility=" + agility
                + ", intelligence=" + intelligence
                + ", health=" + health
                + ", mana=" + mana
                + '}';
    }
}
