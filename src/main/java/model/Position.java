package model;

public class Position {

    private int id;
    private String name;
    private boolean close;

    public Position(int id, String name, boolean close) {
        this.id = id;
        this.name = name;
        this.close = close;
    }

    public Position(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Position(String name) {
        this.name = name;
    }

    public Position(boolean close) {
        this.close = close;
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

    @Override
    public String toString() {
        return "Position{"
                + "id="
                + id
                + ", name='"
                + name
                + '\''
                + '}';

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", close=" + close +
                '}';
    }
}
