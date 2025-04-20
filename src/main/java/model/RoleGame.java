package model;

public class RoleGame {

    private int id;
    private String name;

    public RoleGame(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public RoleGame(String name) {
        this.name = name;
    }

    public RoleGame() {
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

    @Override
    public String toString() {
        return "RoleGame{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
