package dao;

import model.Character;
import model.Position;

import java.util.List;

public interface CharacterDao {

    List<Character> findAllCharacter();

    Character findCharacterByName(String name);

    Character findCharacterById(int characterId);

    List<Character> findCharactersByPositionId(int positionId);

    List<Character> findCharactersByPosition(String name);

    Character findCharacterByNameWd(String name);

    List<Character> findCharactersDeleteByPosition(String namePosition);

    List<Character> findCharacterByDraft();

    boolean saveCharacterDraft(int idChar);
}
/**1. Предоставить список свободных позиций. findPositionFreeTest();
2. Найти персонажей по айди позиции. findCharactersByPositionIdTest();
3. Cохранить персонажа в драфт. saveCharacterDraft();
4. Показать список персонажей в сформированном драфте. findCharacterByDraft();*/