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

    List<Character> findCharacterByDraft();

    boolean saveCharacterDraft(int idCharacter);

    Character findCaracterAspectDefault (String name);

    Character findCharacterInfo (int idCharacter);
}
/**1. Предоставить список свободных позиций. findPositionFreeTest();
2. Найти персонажей по айди позиции. findCharactersByPositionIdTest();
3. Cохранить персонажа в драфт. saveCharacterDraft();
4. Показать список персонажей в сформированном драфте. findCharacterByDraft();




--Задачи
-Доработать метод добавления в драфт, добавить аспекты героям. При добавлении в драфт персонажа назначаем дефолтный аспект +

-Новый метод получения персонажа из драфта и выод информации о его статах
 (имя, тип атаки, назначенный аспект, сила, ловкость, интелект, запас здоровья, запас маны) + (не понимаю как проверить)

-Новый метод поменять аспект (всего 2 у каждого персонажа). У аспектов есть названия и описания + (не понимаю как проверить)

-При вводе имя героя должен отобразить:
 на каком левле что качать (скилы) и базовые предметы
 при передачи имени персонажа с ошибкой или маленькой буквы руководство должно найтись +




 задача на хеш-сет
 сколько бы героев я не добавлял (дубль)
 у меня всеравно должен выводится один уникальный герой
 (передаю список персонажей) искуственноо созданный и должен вернуть только уникальных



 отдельно создать класс characterDaoMap наполнить дефолтными персонажеми
 ключ - ид персонажа

 создать персонажа
 редактировать персонажа по ид (все поля кроме ид)
 удаление персонажа по ид
 найти персонажа по ид

 получение списка (возвращать лист) но доставать из хешмепа
 передаем позицию и получаем соответсветсвующих персов

 переделать реализацию из наших методов на хеш меп
 */