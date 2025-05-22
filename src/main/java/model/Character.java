package model;

public class Character {

    private int id;
    private String name;
    private Position positionChar;
    private int countCharacter = 0;
    private String aspect;

    public Character(int id, String name, Position positionChar, int countCharacter, String aspect) {
        this.id = id;
        this.name = name;
        this.positionChar = positionChar;
        this.countCharacter = countCharacter;
        this.aspect = aspect;
    }

    public Character(int id, String name, Position positionChar) {
        this.id = id;
        this.name = name;
        this.positionChar = positionChar;
    }

    public Character(String name, Position positionChar) {
        this.name = name;
        this.positionChar = positionChar;
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(int id, String name, String aspect) {
        this.id = id;
        this.name = name;
        this.aspect = aspect;
    }

    public Character(int countCharacter) {
        this.countCharacter = countCharacter;
    }

    public Character() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getCountCharacter() {
        return countCharacter;
    }

    public void setCountCharacter(int countCharacter) {
        this.countCharacter = countCharacter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPositionChar() {
        return positionChar;
    }

    public void setPositionChar(Position positionChar) {
        this.positionChar = positionChar;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", positionChar=" + positionChar +
                ", aspect='" + aspect + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Character character = (Character) obj;

        return name != null ? name.equals(character.name) : character.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
