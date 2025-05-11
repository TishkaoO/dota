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
        //saveCharDraftTest();
        //findCharacterByNameWdTest();
        //findCharactersDeleteByPositionTest();
        //saveCharacterDraftTest();
        //saveCharacterDraftWhenIdIsNotExists();
        saveCharacterDraftWhenPositionIsClose();
        //findCharacterByDraftTest();

    }

    public static void findAllCharacterTest() {
        CharacterDao characterDao = new CharacterDaoImpl();
        List<Character> character = characterDao.findAllCharacter();
        System.out.println(character);
    }

    public static void findCharacterByNameTest() {
        CharacterDao characterDao = new CharacterDaoImpl();
        characterDao.findCharacterByName("Phantom Assassin");
    }

    public static void findCharacterByIdTest() {
        CharacterDao characterDao = new CharacterDaoImpl();
        characterDao.findCharacterById(6);
    }

    public static void findCharactersByPositionIdTest() {
        CharacterDao characterDao = new CharacterDaoImpl();
        List<Character> character = characterDao.findCharactersByPositionId(6);
        System.out.println(character);
    }

    public static void findCharactersByPositionTest() {
        CharacterDao characterDao = new CharacterDaoImpl();
        List<Character> character = characterDao.findCharactersByPosition("Core");
        System.out.println(character);
    }

    public static void findCharacterByNameWdTest() {
        CharacterDao characterDao = new CharacterDaoImpl();
        Character character = characterDao.findCharacterByNameWd("Doctor");
        System.out.println(character);
    }

    public static void findCharactersDeleteByPositionTest() {
        CharacterDao characterDao = new CharacterDaoImpl();
        List<Character> character = characterDao.findCharactersDeleteByPosition("mid");
        System.out.println(character);
    }

    public static void saveCharacterDraftTest() {
        CharacterDao characterDao = new CharacterDaoImpl();
        boolean character = characterDao.saveCharacterDraft(1);
        System.out.println(character);
    }

    public static void saveCharacterDraftWhenIdIsNotExists() {
        CharacterDao characterDao = new CharacterDaoImpl();
        boolean character = characterDao.saveCharacterDraft(0);
        System.out.println(character);
    }

    public static void saveCharacterDraftWhenPositionIsClose() {
        CharacterDao characterDao = new CharacterDaoImpl();
        boolean character = characterDao.saveCharacterDraft(1);
        boolean character1 = characterDao.saveCharacterDraft(2);
        System.out.println(character1);
    }

    public static void findCharacterByDraftTest() {
        CharacterDao characterDao = new CharacterDaoImpl();
        List<Character> character = characterDao.findCharacterByDraft();
        System.out.println(character);
    }
}
