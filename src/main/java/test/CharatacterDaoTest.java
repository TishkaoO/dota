package test;

import dao.CharacterDao;
import dao.impl.CharacterDaoImpl;
import model.Character;
import java.util.List;

public class CharatacterDaoTest {

    public static void main(String[] args) {

        //findAllCharacterTest();
        //findCharacterByNameTest();
        //findCharacterByIdTest();
        //findCharactersByPositionIdTest();
        //findCharactersByPositionTest();
        //saveCharacterDraftTest();
    }

    public static void findAllCharacterTest(){
        CharacterDao characterDao = new CharacterDaoImpl();
        List <Character> character = characterDao.findAllCharacter();
        System.out.println(character);
}

    public static void findCharacterByNameTest(){
        CharacterDao characterDao = new CharacterDaoImpl();
        characterDao.findCharacterByName("Phantom Assassin");
    }

    public static void findCharacterByIdTest(){
        CharacterDao characterDao = new CharacterDaoImpl();
        characterDao.findCharacterById(6);
    }

    public static void findCharactersByPositionIdTest(){
        CharacterDao characterDao = new CharacterDaoImpl();
        characterDao.findCharactersByPositionId(0);
    }

    public static void findCharactersByPositionTest(){
        CharacterDao characterDao = new CharacterDaoImpl();
        List<Character> character = characterDao.findCharactersByPosition("Core");
        System.out.println(character);
    }

    public static void saveCharacterDraftTest(){
        CharacterDao characterDao = new CharacterDaoImpl();
        characterDao.saveCharacterDraft("Mid");
    }


}
