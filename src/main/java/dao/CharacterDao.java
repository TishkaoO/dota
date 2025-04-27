package dao;

import model.Character;
import model.Position;

import java.util.List;

public interface CharacterDao {

    boolean saveCharacterDraft(String positionName);
    List<Character> findAllCharacter();
    Character findCharacterByName(String name);
    Character findCharacterById(int characterId);
    List<Character> findCharactersByPositionId(int positionId);

    List<Character> findCharactersByPosition(String name);
    Character findCharacterByNameWd(String name);
    List<Character> findCharactersDeleteByPosition(String namePosition);

}


//Здесь мне нужно подумать над логикой связаной с приложением
//1) Пользователю предложено собрать драфт (Желаете собрать драфт персонажей? Да Нет)
//1.1) Нет - приложение заканчивает работу
//1.2) Да - Пользователю предложено выбрать позицию (1-5)+-
//2) После выбора позиции предложено выбрать персонажа (Выберите персонажа на позицию (список) взависимости от позиции)
//3) Выбранный персонаж и его позиция сохранены (персонаж добавлен в драфт)
//4) Пользователю предложено выбрать позицию (1-4) (ранее выбранная позиция для выбора не доступна)