package dao.impl;

import dao.CharacterDao;
import model.Character;
import model.Position;
//import model.RoleGame;

import java.util.ArrayList;
import java.util.List;

public class CharacterDaoImpl implements CharacterDao {

    final List<Character> characterList = new ArrayList<>();

    private int id = 0;

    {
        characterList.add(new Character(1, "Phantom Assassin", new Position(1, "Core")));
        characterList.add(new Character(2, "Juggernaut", new Position(1, "Core")));
        characterList.add(new Character(3, "Zeus", new Position(2, "Mid")));
        characterList.add(new Character(4, "Invoker", new Position(2, "Mid")));
        characterList.add(new Character(5, "Axe", new Position(3, "Hard Line")));
        characterList.add(new Character(6, "Legion Commander", new Position(3, "Hard Line")));
        characterList.add(new Character(7, "Jakiro", new Position(4, "Support")));
        characterList.add(new Character(8, "Ancient Apparition", new Position(4, "Support")));
        characterList.add(new Character(9, "Crystal Maiden", new Position(5, "Line Support")));
        characterList.add(new Character(10, "Witch Doctor", new Position(5, "Line Support")));

    }

    @Override
    public boolean saveCharacterDraft(String positionName) {//не знаю как прорверить, мне кажется, что я уже ничего не понимаю!!!
            List<Character> foundCharacters = findCharactersByPosition(positionName);
            List<Character> savedCharacters = new ArrayList<>();
            if (!foundCharacters.isEmpty()) { // Проверяем, есть ли найденные персонажи
                Character characterToSave = foundCharacters.get(1); // Берем первого найденного
                if (!savedCharacters.contains(characterToSave)) { // Проверяем, не сохранен ли он уже
                    savedCharacters.add(characterToSave);// Сохраняем персонажа
                    System.out.println("Персонаж успешно добавлен в драфт: " + savedCharacters);
                    return true; // Успешно сохранено
                }
            }
            return false; // Не удалось сохранить (персонаж уже сохранен или не найден)
        }

    @Override
    public List<Character> findAllCharacter() {
        return characterList;
    }

    @Override
    public Character findCharacterByName(String name) { //работает сомнительно
        for (Character character : characterList) {
            if (name.equals(character.getName())) {
                System.out.println("Имя найденного персонажа: ");
                System.out.println(character.getId() + "   " + name);
                break;
            } else {
                System.out.println("Персонажа с таким именем не существует. Выберите другое имя");
            }
        }
        return null;
    }

    @Override
    public Character findCharacterById(int characterId) { //не работает
        for (Character character : characterList) {
            if (id == character.getId()) {
                System.out.println(character.getId() + " " + character.getName());
                break;
            } else {
                System.out.println("Персонажа с таким идентификатором не существует. Выберите другой");
            }
        }
        return null;
    }

    @Override
    public List<Character> findCharactersByPositionId(int positionId) {// не работает + не понимаю метод Тишка писал
        List<Character> actualCharacters = new ArrayList<>();
        for (Character character : characterList) {
            Position position = character.getPositionChar();
//           RoleGame roleGame = character.getRoleGameChar();
//           int idRolegame = roleGame.getId();
            int idPosition = position.getId();
            if (idPosition == positionId) {
                actualCharacters.add(character);
            }
        }
        return actualCharacters;
    }

    @Override
    public List<Character> findCharactersByPosition(String name) {
        List<Character> actualCharacter = new ArrayList<>();
        for (Character character : characterList) {
            Position position = character.getPositionChar(); // Получаем позицию персонажа
            if (position != null && position.getName().equalsIgnoreCase(name)) { // Сравниваем имена
                actualCharacter.add(character); // Добавляем персонажа в результат
            }
        }
        return actualCharacter; // Возвращаем список найденных персонажей
    }
}


