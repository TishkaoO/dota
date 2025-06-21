package model;

import java.util.List;

public class Character {

    private int id;
    private String name;
    private Position positionChar;
    private InformationCharacter informationCharacter;
    private List<CharacterPumping> pumpingList;
    //privet Map<>;

    public Character(int id, String name, Position positionChar) {
        this.id = id;
        this.name = name;
        this.positionChar = positionChar;
    }

    public Character(int id, String name, Position positionChar, InformationCharacter informationCharacter, List<CharacterPumping> pumpingList) {
        this.id = id;
        this.name = name;
        this.positionChar = positionChar;
        this.informationCharacter = informationCharacter;
        this.pumpingList = pumpingList;
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(int id, String name, Position positionChar, InformationCharacter informationCharacter) {
        this.id = id;
        this.name = name;
        this.positionChar = positionChar;
        this.informationCharacter = informationCharacter;
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

    public InformationCharacter getInformationCharacter() {
        return informationCharacter;
    }

    public void setInformationCharacter(InformationCharacter informationCharacter) {
        this.informationCharacter = informationCharacter;
    }

    public List<CharacterPumping> getPumpingList() {
        return pumpingList;
    }

    public void setPumpingList(List<CharacterPumping> pumpingList) {
        this.pumpingList = pumpingList;
    }

    @Override
    public String toString() {
        return "Character{"
                + "id=" + id
                + ", name='" + name
                + '\''
                + ", positionChar=" + positionChar
                + ", informationCharacter=" + informationCharacter
                + ", pumpingList=" + pumpingList
                + '}';
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
