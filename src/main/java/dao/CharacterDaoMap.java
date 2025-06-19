package dao;

import model.Character;
import model.CharacterPumping;
import model.Position;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CharacterDaoMap {

   Character findCharacterByPositionId(int positionId);

    Character findCharacterById(int id);

    boolean deleteCharacterById(int keyId);

    List <Character> findDistinctAllCharacter (Map<Integer, Character> characterDublue);

    Character addCharacter (String name, String namePosition);

    Character editCharacter (int id, String nameCharacter, String namePosition);

    List<Character> findAllCharacterMap ();

    Character findCharacterByNameMap (String name);

    Character findCharacterByPositionNameMap (String name);

    List<Character> findCharacterByDraft();

    boolean saveCharacterDraftMap(int idCharacter);

    Character findCharacterInfoMap(int idCharacter);

    List<CharacterPumping> findInfoCharacterSkills(String name);
}
