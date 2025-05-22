package model;

import java.util.List;
import java.util.Objects;

public class CharacterSkill {

    int id;
    Character characterName;
    String lvel;
    String skills;
    String items;

    public CharacterSkill(int id, Character characterName, String lvel, String skills, String items) {
        this.id = id;
        this.characterName = characterName;
        this.lvel = lvel;
        this.skills = skills;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Character getCharacterName() {
        return characterName;
    }

    public void setCharacterName(Character characterName) {
        this.characterName = characterName;
    }

    public String getLvel() {
        return lvel;
    }

    public void setLvel(String lvel) {
        this.lvel = lvel;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "CharacterSkill{" +
                "id=" + id +
                ", characterName=" + characterName +
                ", lvel=" + lvel +
                ", skills='" + skills + '\'' +
                ", items='" + items + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterSkill that = (CharacterSkill) o;
        return id == that.id && Objects.equals(characterName, that.characterName) && Objects.equals(lvel, that.lvel) && Objects.equals(skills, that.skills) && Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, characterName, lvel, skills, items);
    }
}
