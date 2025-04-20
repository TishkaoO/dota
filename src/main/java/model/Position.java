package model;

public class Position {

    private int id;
    private String name;
//    private RoleGame roleGameChar;

    public Position(int id, String name) {
        this.id = id;
        this.name = name;
//        this.roleGameChar = roleGameChar;

    }

//    public Position(String name, RoleGame roleGameChar) {
//        this.name = name;
//        this.roleGameChar = roleGameChar;
//    }

    public Position(String name) {
        this.name = name;
    }

    public Position() {
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

//    public RoleGame getRoleGameChar() {
//        return roleGameChar;
//    }
//
//    public void setRoleGameChar(RoleGame roleGameChar) {
//        this.roleGameChar = roleGameChar;
//    }
//
//    @Override
//    public String toString() {
//        return "Position{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", roleGameChar=" + roleGameChar +
//                '}';
//    }


    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
