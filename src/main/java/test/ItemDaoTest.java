package test;

import dao.CharacterDao;
import dao.ItemDao;
import dao.impl.CharacterDaoImpl;
import dao.impl.ItemDaoImpl;
import model.Character;
import model.Item;

import java.util.List;
import java.util.Map;

public class ItemDaoTest {

    public static void main(String[] args) {

        findItemCharacterTest();
    }

    public static void findItemCharacterTest() {
        ItemDao itemDao = new ItemDaoImpl(new Character());
        List<Item> item = itemDao.findItemCharacter("Axe");
        System.out.println(item);
    }
}
