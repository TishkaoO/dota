package dao.impl;

import dao.CharacterDao;
import model.Character;
import model.InformationCharacter;
import model.Position;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterDaoImpl implements CharacterDao {

    private List<Character> characterList = new ArrayList<>();
    private List<Character> seveCharcterList = new ArrayList<>();
    private List<Character> aspectCharacterList = new ArrayList<>();
    private List<Character> defaultAspectCharacterList = new ArrayList<>();
    private List<Character> infoCharacterList = new ArrayList<>();

    private int id = 0;

    {
        Position core = new Position(1, "Core");
        Position mid = new Position(2, "Mid");
        Position hardLine = new Position(3, "Hard Line");
        Position support = new Position(4, "Support");
        Position lineSupport = new Position(5, "Line Support");
        characterList.add(new Character(1, "Phantom Assassin", core));
        characterList.add(new Character(2, "Juggernaut", core));
        characterList.add(new Character(3, "Zeus", mid));
        characterList.add(new Character(4, "Invoker", mid));
        characterList.add(new Character(5, "Axe", hardLine));
        characterList.add(new Character(6, "Legion Commander", hardLine));
        characterList.add(new Character(7, "Jakiro", support));
        characterList.add(new Character(8, "Ancient Apparition", support));
        characterList.add(new Character(9, "Crystal Maiden", lineSupport));
        characterList.add(new Character(10, "Witch Doctor", lineSupport));
    }

    {
        defaultAspectCharacterList.add(new Character(1, "Phantom Assassin", "Methodical"));
        defaultAspectCharacterList.add(new Character(2, "Juggernaut", "Bladestorm"));
        defaultAspectCharacterList.add(new Character(3, "Zeus", "Livewire"));
        defaultAspectCharacterList.add(new Character(4, "Invoker", "Scholar of Koryx"));
        defaultAspectCharacterList.add(new Character(5, "Axe", "One Man Army"));
        defaultAspectCharacterList.add(new Character(6, "Legion Commander", "Stonehall Plate"));
        defaultAspectCharacterList.add(new Character(7, "Jakiro", "Twin Terror"));
        defaultAspectCharacterList.add(new Character(8, "Ancient Apparition", "Bone Chill"));
        defaultAspectCharacterList.add(new Character(9, "Crystal Maiden", "Glacial Guard"));
        defaultAspectCharacterList.add(new Character(10, "Witch Doctor", "Headhunter"));
    }

    {
        infoCharacterList.add(new InformationCharacter(1, "Phantom Assassin", "Физический урон", "Methodical", 19, 21, 15, 538, 255));
        infoCharacterList.add(new InformationCharacter(2, "Juggernaut", "Физический урон", "Bladestorm", 20, 34, 14, 560, 243));
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
            if (character != null && !characterList.isEmpty() && idPosition == positionId) {
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

    //4. Показать список персонажей в сформированном драфте.
    @Override
    public List<Character> findCharacterByDraft() {
        return seveCharcterList;
    }

    //3. Cохранить персонажа в драфт.
    @Override
    public boolean saveCharacterDraft(int idCharacter) {
          if (seveCharcterList.size() >= 5) {
             System.out.println("Персонажа добавить нельзя, драфт переполнен");
             return false;
      }
          if (characterList != null && !characterList.isEmpty()) {
              for (Character character : characterList) {
                  int characterId = character.getId();
                  if (characterId == idCharacter) {
                      String nemeCharacter = character.getName();
                      Position position = character.getPositionChar();
                      boolean isClosePosition = position.isClose();
                      if (!isClosePosition && !seveCharcterList.contains(character)) {
                          seveCharcterList.add(character);
                          position.setClose(true);
                          System.out.println("Добавлен персонаж: " + character + findCaracterAspectDefault(nemeCharacter));
                          System.out.println("Сохраненные персонажи: " + seveCharcterList + findCaracterAspectDefault(nemeCharacter));
                          return true;
                      } else {
                          System.out.println("Позиция уже занята для персонажа: " + character.getName());
                          return false;
                      }
                  }
              }
          }
        System.out.println("Персонаж с ID" + idCharacter + " не найден.");
        return false;
    }

    @Override
    public Character findCaracterAspectDefault(String name) {
        List<Character> defoultListAspect = new ArrayList<>(defaultAspectCharacterList);
        for (Character character : defoultListAspect){
            String nameCharacter = character.getName();
            if (character != null && nameCharacter.equals(name)){
                character.getAspect();
                return character;
            }
        }
        return null;
    }

    @Override
    public Character findCharacterInfo(int idCharacter) {
        if (seveCharcterList == null || seveCharcterList.isEmpty()) {
            System.out.println("Драфт персонажей пуст");
            return null;
        }
        for (Character character : seveCharcterList) {
            if (character != null && character.getId() == idCharacter) {
                if (infoCharacterList != null && !infoCharacterList.isEmpty()) {
                    for (Character character1 : infoCharacterList) {
                        if (character1 != null && character1.getId() == idCharacter) {
                            return character1;
                        }
                    }
                    System.out.println("Данного персонажа нет в драфте, получении информации не возможно!");
                    return null;
                }
            }
        }
        System.out.println("Персонаж с таким ID не найден");
        return null;
    }
}
