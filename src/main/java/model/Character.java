package model;

public class Character {

    private int id;
    private String name;
    private Position positionChar;
    private RoleGame roleGameChar;

    public Character(int id, String name, Position positionChar, RoleGame roleGameChar) {
        this.id = id;
        this.name = name;
        this.positionChar = positionChar;
        this.roleGameChar = roleGameChar;
    }

    public Character(String name, Position positionChar, RoleGame roleGameChar) {
        this.name = name;
        this.positionChar = positionChar;
        this.roleGameChar = roleGameChar;
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

    public RoleGame getRoleGameChar() {
        return roleGameChar;
    }

    public void setRoleGameChar(RoleGame roleGameChar) {
        this.roleGameChar = roleGameChar;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", positionChar=" + positionChar +
                ", roleGameChar=" + roleGameChar +
                '}';
    }
}
