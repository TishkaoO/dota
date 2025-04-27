package model;

public class Character {

    private int id;
    private String name;
    private Position positionChar;

    public Character(String name, Position positionChar) {
        this.name = name;
        this.positionChar = positionChar;
    }

    public Character(int id, String name, Position positionChar) {
        this.id = id;
        this.name = name;
        this.positionChar = positionChar;
    }

    public Character(int id, String name) {
        this.id = id;
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
    }

    public Position getPositionChar() {
        return positionChar;
    }

    public void setPositionChar(Position positionChar) {
        this.positionChar = positionChar;
    }


    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", positionChar=" + positionChar +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Character character = (Character) obj;

        return name != null ? name.equals(character.name) : character.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
