package dao;

import model.Character;
import model.Item;

import java.util.List;
import java.util.Map;

public interface ItemDao {

    List<Item> findItemCharacter (String name);

}
