package dao.impl;

import dao.CharacterDao;
import model.Character;
import model.Position;


import java.util.ArrayList;
import java.util.List;

public class CharacterDaoImpl implements CharacterDao {

    private static final List<Character> characterList = new ArrayList<>();
    private static final List<Character> seveCharcterList = new ArrayList<>();

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
        characterList.add(new Character(11, "Witch Doctor", new Position(6, "123")));

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
                return character;
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

    //2. Найти персонажей по айди позиции.
    @Override
    public List<Character> findCharactersByPositionId(int positionId) {
        List<Character> actualCharacters = new ArrayList<>();
        for (Character character : characterList) {
            Position position = character.getPositionChar();
            int idPosition = position.getId();
            if (character != null && !characterList.isEmpty() && idPosition == positionId){
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

    //написать метод, который будет из списака персонажей доставать вд с позицией 123
    @Override
    public Character findCharacterByNameWd(String name) {
        for (Character character : characterList) {
            String characterName = character.getName();
            Position position = character.getPositionChar();
            String characterPositionName = position.getName();
            if (characterName.equals(name) && characterPositionName.equals("123")) {
                return character;
            }
        }
        System.out.println("Мы не нашли вашего персонажа :(");
        return null;
    }

    // переименовать имя позиции на 123, но если позиция 123 уже есть то удаляем этого персонажа
    // из списка и возвращаем остальное
    @Override
    public List<Character> findCharactersDeleteByPosition(String namePosition) {
        List<Character> actualListCharacter = new ArrayList<>();
        for (Character character : characterList) {
            Position position = character.getPositionChar();
            String charPosition = position.getName();
            if (charPosition.equalsIgnoreCase(namePosition)) {
                continue;
            } else {
                position.setName("123");
                actualListCharacter.add(character);
            }
        }
        return actualListCharacter;
    }

    //4. Показать список персонажей в сформированном драфте.
    @Override
    public List<Character> findCharacterByDraft() {
        return seveCharcterList;
    }

    //3. Cохранить персонажа в драфт.
    @Override
    public boolean saveCharacterDraft(int idChar) {
        for (Character character : characterList) {
            int characters = character.getId();
            int countChar = character.setCountCharacter(5);
            // Проверяем, совпадает ли ID персонажа с переданным
            if (character !=null && characters == idChar && countChar < 6) {
                seveCharcterList.add(character);// Добавляем персонажа в список
                System.out.println("Добавлен персонаж: " + character);
            }
        }
        // Проверяем, были ли добавлены персонажи
        if (!seveCharcterList.isEmpty()) {
            System.out.println("Сохраненные персонажи: " + seveCharcterList);
            return true; // Если хотя бы один персонаж был добавлен
        }
        return false; // Если ни один персонаж не был найден
    }
}

//выбираем героя в драфт:
//Ищем по айди персонажа
//Бежим по списку персонажей
//И у каждого героя смотрим айди соответствует ли тому айди что передаем, если соответствует то смотрим его позицию занята ли она,
//Если не занята и размер списка драфта <5 то меняем значение у close в позиции героя на нужное и добавляем героя в список драфта
// если размер уже равен 5 то сообщение, что добавить нельзя
