package test;

import dao.CharacterDaoMap;
import model.Character;
import model.CharacterPumping;

import java.util.List;
import java.util.Map;

public class CharacterDaoMapTest {
    public static void main(String[] args) {

        //findCharacterByPositionIdTest();
    }

    public static void findCharacterByPositionIdTest() {
        CharacterDaoMap characterDaoMap = new CharacterMap();
        Map<Integer, Character> character = characterDaoMap.findCharacterByPositionId(1);
        System.out.println(character);
    }
}
