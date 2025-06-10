package model;

public class Aspect {

    private String name;
    private boolean defaultAspect;

    public Aspect(String name, boolean defaultAspect) {
        this.name = name;
        this.defaultAspect = defaultAspect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDefaultAspect() {
        return defaultAspect;
    }

    public void setDefaultAspect(boolean defaultAspect) {
        this.defaultAspect = defaultAspect;
    }

    @Override
    public String toString() {
        return "Aspect{"
                + "name='" + name + '\''
                + ", defaultAspect=" + defaultAspect
                + '}';
    }
}
