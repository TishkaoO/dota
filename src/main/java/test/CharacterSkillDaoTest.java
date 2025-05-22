package test;

import dao.CharacterDao;
import dao.CharacterSkillDao;
import dao.impl.CharacterDaoImpl;
import dao.impl.CharacterSkillDaoImpl;
import model.Character;
import model.CharacterSkill;

import java.util.List;

public class CharacterSkillDaoTest {

    public static void main(String[] args) {

        findInfoCharacterSkillsTest();

    }

        public static void findInfoCharacterSkillsTest() {
        CharacterSkillDao characterSkillDao = new CharacterSkillDaoImpl();
        CharacterSkill characterSkill = characterSkillDao.findInfoCharacterSkills("Phantom Assassin");
        System.out.println(characterSkill);
    }
}
