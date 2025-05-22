package dao.impl;

import dao.CharacterSkillDao;
import model.Character;
import model.CharacterSkill;

import java.util.ArrayList;
import java.util.List;

public class CharacterSkillDaoImpl implements CharacterSkillDao {

    private List<CharacterSkill> skillList = new ArrayList<>();


    {
       Character phantomAssassin = new Character("Phantom Assassin");
       Character juggernaut = new Character("Juggernaut");
       Character zeus = new Character("Zeus");
       Character invoker = new Character("Invoker");
       Character axe = new Character("Axe");
       Character legionCommander = new Character("Legion Commander");
       Character jakiro = new Character("Jakiro");
       Character ancientApparition = new Character("Ancient Apparition");
       Character crystalMaiden = new Character("Crystal Maiden");
       Character witchDoctor = new Character("Witch Doctor");
       skillList.add(new CharacterSkill(1, phantomAssassin, "1-10", "1, 2, 1, 2, 1, 4, 1, 2, 2, 3", "PT, battle fury"));

    }

    @Override
    public CharacterSkill findInfoCharacterSkills(String name) {
        if (skillList == null || skillList.isEmpty()){
            System.out.println("Руководства нет");
            return null;
        }
        for (CharacterSkill characterSkill : skillList){
            Character character = characterSkill.getCharacterName();
            String characterName = character.getName();
            if (characterName.equalsIgnoreCase(name)){
                return characterSkill;
            }
        }
        System.out.println("Имя персонажа не верно!");
        return null;
    }
}
