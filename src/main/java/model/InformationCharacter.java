package model;

import java.util.List;

public class InformationCharacter {

    private String typeAttack;
    private List<Aspect> aspects;
    private Сharacteristic Сharacteristics;

    public InformationCharacter(String typeAttack, List<Aspect> aspects, Сharacteristic сharacteristics) {
        this.typeAttack = typeAttack;
        this.aspects = aspects;
        this.Сharacteristics = сharacteristics;
    }

    public String getTypeAttack() {
        return typeAttack;
    }

    public void setTypeAttack(String typeAttack) {
        this.typeAttack = typeAttack;
    }

    public List<Aspect> getAspects() {
        return aspects;
    }

    public void setAspects(List<Aspect> aspects) {
        this.aspects = aspects;
    }

    public Сharacteristic getСharacteristics() {
        return Сharacteristics;
    }

    public void setСharacteristics(Сharacteristic сharacteristics) {
        Сharacteristics = сharacteristics;
    }

    @Override
    public String toString() {
        return "InformationCharacter{"
                + "typeAttack='" + typeAttack
                + '\''
                + ", aspects=" + aspects
                + ", Сharacteristics=" + Сharacteristics
                + '}';
    }
}
