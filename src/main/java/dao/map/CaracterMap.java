package dao.map;

import dao.CharacterDaoMap;
import dao.impl.PositionDaoImpl;
import model.*;
import model.Character;

import java.util.*;

public class CaracterMap implements CharacterDaoMap {

    private final Character character;
    private final Position position;
    private Map<Integer, Character> characterMap = new HashMap<>();
    private Map<Integer, Character> characterDraftMap = new HashMap<>();

    public CaracterMap(Character character, Position position) {
        this.character = character;
        this.position = position;
    }

    private int id = 0;

    {

        Position core = new Position(1, "Core");
        Aspect aspectMetodical = new Aspect("Methodical", true);
        Aspect aspectSweetRelease = new Aspect("Sweet Release", false);
        List<Aspect> aspectsListPhantomAssassin = new ArrayList<>();
        aspectsListPhantomAssassin.add(aspectMetodical);
        aspectsListPhantomAssassin.add(aspectSweetRelease);
        Сharacteristic сharacteristicPhantomAssassin = new Сharacteristic (1, 2, 3, 4, 5);
        InformationCharacter infoPhantomAssassin = new InformationCharacter("Физический урон", aspectsListPhantomAssassin, сharacteristicPhantomAssassin);
        Character phantomAssasin = new Character(1, "Phantom Assassin", core, infoPhantomAssassin);

        Aspect aspectBladestorm = new Aspect("Bladestorm", true);
        Aspect aspectBladeform = new Aspect("Bladeform", false);
        List<Aspect> aspectListJuggernaut = new ArrayList<>();
        aspectListJuggernaut.add(aspectBladestorm);
        aspectListJuggernaut.add(aspectBladeform);
        Сharacteristic сharacteristicJuggernaut = new Сharacteristic (1, 2, 3, 4, 5);
        InformationCharacter infoJuggernaut = new InformationCharacter("Физический урон", aspectListJuggernaut, сharacteristicJuggernaut);
        Character juggernaut = new Character(2, "Juggernaut", core, infoJuggernaut);

        characterMap.put(phantomAssasin.getId(), phantomAssasin);
        characterMap.put(juggernaut.getId(), juggernaut);
//        characterNameList.put(3, "Zeus");
//        characterNameList.put(4, "Invoker");
//        characterNameList.put(5, "Axe");
//        characterNameList.put(6, "Legion Commander");
//        characterNameList.put(7, "Jakiro");
//        characterNameList.put(8, "Ancient Apparition");
//        characterNameList.put(9, "Crystal Maiden");
//        characterNameList.put(10, "Witch Doctor");
    }

    @Override
    public Map<Integer, Character> findCharacterByPositionId(int positionId) {
        Map<Integer, Character> actualCharacter = new HashMap<>();
        if (characterMap != null && !characterMap.isEmpty()){
            for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()) {
                Character characterMapValue = mapCharacter.getValue();
                Position positionCharacter = characterMapValue.getPositionChar();
                int positionIdCharacter = positionCharacter.getId();
                if (positionIdCharacter == positionId) {
                    actualCharacter.put(mapCharacter.getKey(), character);
                }
            }
        }
        return actualCharacter;
    }

    @Override
    public Map<Integer, Character> findCharacterById(int id) {
        Map<Integer, Character> characterById = new HashMap<>();
        if (characterMap != null && !characterMap.isEmpty()){
            for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()) {
                int characterMapId = mapCharacter.getKey();
                if (characterMapId == id){
                    characterById.put(mapCharacter.getKey(), character);
                }
            }
        }
        return characterById;
    }

    @Override
    public Map<Integer, Character> deleteCharacterById(int id) {
        Map<Integer, Character> characterById = new HashMap<>(characterMap);
        if (characterMap != null && !characterMap.isEmpty()){
            for (Map.Entry<Integer, Character> mapCharacter : characterById.entrySet()){
                int characterMapId = mapCharacter.getKey();
                if (characterMapId == id){
                    characterById.remove(characterMapId);
                    System.out.println("Персонаж с ID: " + characterMapId + " удален");
                }
            }
        }
        return characterById;
    }

    Map<Integer, Character> characterDublue = new HashMap<>();
    {
        characterDublue.put(1, new Character(1, "Phantom Assassin", new Position(1, "Core")));
        characterDublue.put(2, new Character(2, "Juggernaut", new Position(1, "Core")));
        characterDublue.put(3, new Character(3, "Axe", new Position(3, "Hard Line")));
        characterDublue.put(4, new Character(1, "Phantom Assassin", new Position(1, "Core")));
        characterDublue.put(5, new Character(5, "Jakiro", new Position(1, "Support")));
    }

    @Override
    public Map<Integer, Character> findDistinctCharacter(Map<Integer, Character> characterDublue) {
        if (characterDublue == null || characterDublue.isEmpty()){ // проверка на null
            System.out.println("Список персонажей пуст!");
        }

        Map<Integer, Character> distinctCharacter = new HashMap<>(); // создаем новый map и set для добавления найденных значений
        Set<Character> seenChatacter = new HashSet<>();
        for (Map.Entry<Integer, Character> entry : characterDublue.entrySet()){ // итерация по списку
            Character character = entry.getValue(); // получаем значения
            if (!seenChatacter.contains(character)){ // проверяем, если в нашем set не содержится найденное значение, то добавить
                seenChatacter.add(character);
                distinctCharacter.put(entry.getKey(), character); // получить ключ и добавить значения по условию
            }
        }
        return distinctCharacter; // вернуть уникальный список
    }

    private int currentId = 10;

    @Override
    public Map<Integer, Character> addCharacter(String name, String namePosition) {
        PositionDaoImpl positionAll = new PositionDaoImpl();
        List<Position> positionList = positionAll.findAllPosition();
        for (Position actualPosition : positionList){
            String positionName = actualPosition.getName();
            if (!namePosition.equalsIgnoreCase(positionName)){
                System.out.println("Позиция не верна!");
            }
            return null;
        }
        int newId = ++currentId;
        Character newCharacter = new Character(newId, name, position);
        String nameCharacter = newCharacter.getName();
        for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()){
            Character character = mapCharacter.getValue();
            String nameMapCharacter = character.getName();
            if (!nameCharacter.equalsIgnoreCase(nameMapCharacter)){
                characterMap.put(newId, newCharacter);
                System.out.println("Добавлен новый персонаж: " + nameCharacter);
            }
        }
        return characterMap;
    }

    @Override
    public Map<Integer, Character> editCharacter(int id, String nameCharacter, String namePosition) {
        if (characterMap == null || characterMap.isEmpty()){
            System.out.println("Список персонажей пуст!");
            return null;
        }
        PositionDaoImpl positionAll = new PositionDaoImpl();
        List<Position> positionList = positionAll.findAllPosition();
        for (Position actualPosition : positionList){
            String positionName = actualPosition.getName();
            if (!namePosition.equalsIgnoreCase(positionName)){
                System.out.println("Позиция не верна!");
            }
        }
        for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()){
            int chracterMapId = mapCharacter.getKey();
            Character character = mapCharacter.getValue();
            Position position = character.getPositionChar();
            if (chracterMapId == id && nameCharacter != null && !nameCharacter.isEmpty()){
                character.setName(nameCharacter);
                if (namePosition != null && !namePosition.isEmpty()){
                    position.setName(namePosition);
                    System.out.println("Персонаж с " + id + " обновлен");
                }
            }
        }
        return characterMap;
    }

    @Override
    public Map<Integer, Character> findAllCharacterMap() {
        if (characterMap == null || characterMap.isEmpty()){
            System.out.println("Список персонажей пуст!");
            return null;
        }
        return characterMap;
    }

    @Override
    public Map<Integer, Character> findCharacterByNameMap(String name) {
        if (characterMap == null || characterMap.isEmpty()){
            System.out.println("Список персонажей пуст!");
            return null;
        }
        for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()){
            Character character = mapCharacter.getValue();
            String characterName = character.getName();
            if (characterName.equalsIgnoreCase(name)){
                System.out.println(character);
            }
        }
        return null;
    }

    @Override
    public Character findCharacterByPositionNameMap(String name) {
        if (characterMap == null || characterMap.isEmpty()){
            System.out.println("Список персонажей пуст!");
            return null;
        }
        for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()){
            Character character = mapCharacter.getValue();
            Position position = character.getPositionChar();
            String positionName = position.getName();
            if (positionName.equalsIgnoreCase(name)){
                return character;
            }
        }
        return null;
    }

    @Override
    public Map<Integer, Character> findCharacterByDraft() {
        if (characterMap == null || characterMap.isEmpty()){
            System.out.println("Драфт пуст!");
            return null;
        }
        return characterDraftMap;
    }

    @Override
    public boolean saveCharacterDraftMap(int idCharacter) {
        
    }
}
