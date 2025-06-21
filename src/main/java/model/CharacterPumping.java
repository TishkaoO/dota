package model;

import java.util.List;
import java.util.Objects;

public class CharacterPumping {

    int lvel;
    Skill skills;

    public CharacterPumping(int lvel, Skill skills) {
        this.lvel = lvel;
        this.skills = skills;
    }

    public int getLvel() {
        return lvel;
    }

    public void setLvel(int lvel) {
        this.lvel = lvel;
    }

    public Skill getSkills() {
        return skills;
    }

    public void setSkills(Skill skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "CharacterPumping{"
                + ", lvel=" + lvel
                + ", skills=" + skills
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterPumping that = (CharacterPumping) o;
        return lvel == that.lvel && Objects.equals(skills, that.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lvel, skills);
    }
}
