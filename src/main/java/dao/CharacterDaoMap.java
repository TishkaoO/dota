package dao;

import model.Character;
import model.Position;

import java.util.HashMap;
import java.util.Map;

public interface CharacterDaoMap {

    Map<Integer, Character> findCharacterByPositionId(int positionId);

    Map<Integer, Character> findCharacterById(int id);

    Map<Integer, Character> deleteCharacterById(int id);

    Map<Integer, Character> findDistinctCharacter (Map<Integer, Character> characterDublue);

    Map<Integer, Character> addCharacter (String name, String namePosition);

    Map<Integer, Character> editCharacter (int id, String nameCharacter, String namePosition);

    Map<Integer, Character> findAllCharacterMap ();

    Map<Integer, Character> findCharacterByNameMap (String name);

    Character findCharacterByPositionNameMap (String name);

    Map<Integer, Character> findCharacterByDraft();

    boolean saveCharacterDraftMap(int idCharacter);
}
