package dao;

import model.Character;

import java.util.List;

public interface CharacterDao {

    void save (Character character);
    List<Character> findAllCharacter();
    Character findCharacterByName(String name);
    Character findCharacterById(int characterId);
    List<Character> findCharactersByPositionIdAndRoleId(int positionId, int roleId);
}
