package dao.map;

import dao.CharacterDaoMap;
import dao.impl.PositionDaoImpl;
import model.*;
import model.Character;

import java.util.*;

public class CharacterMap implements CharacterDaoMap {

    private Map<Integer, Character> characterMap = new HashMap<>();
    private Map<Integer, Character> characterDraftMap = new HashMap<>();

    private int id = 0;

    {

        Position core = new Position(1, "Core");
        Aspect aspectMetodical = new Aspect("Methodical", true);
        Aspect aspectSweetRelease = new Aspect("Sweet Release", false);
        List<Aspect> aspectsListPhantomAssassin = new ArrayList<>();
        aspectsListPhantomAssassin.add(aspectMetodical);
        aspectsListPhantomAssassin.add(aspectSweetRelease);
        Сharacteristic сharacteristicPhantomAssassin = new Сharacteristic(1, 2, 3, 4, 5);
        InformationCharacter infoPhantomAssassin = new InformationCharacter("Физический урон", aspectsListPhantomAssassin, сharacteristicPhantomAssassin);
        Character phantomAssasin = new Character(1, "Phantom Assassin", core, infoPhantomAssassin);

        Aspect aspectBladestorm = new Aspect("Bladestorm", true);
        Aspect aspectBladeform = new Aspect("Bladeform", false);
        List<Aspect> aspectListJuggernaut = new ArrayList<>();
        aspectListJuggernaut.add(aspectBladestorm);
        aspectListJuggernaut.add(aspectBladeform);
        Сharacteristic сharacteristicJuggernaut = new Сharacteristic(1, 2, 3, 4, 5);
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
    public Character findCharacterByPositionId(int positionId) {
        if (characterMap != null && !characterMap.isEmpty()) {
            for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()) {
                Character character = mapCharacter.getValue();
                Position positionCharacter = character.getPositionChar();
                int positionIdCharacter = positionCharacter.getId();
                if (positionIdCharacter == positionId) {
                    return character;
                }
            }
        }
        System.out.println("Позиции с ID: " + positionId + " не существует");
        return null;
    }

    @Override
    public Character findCharacterById(int id) {
        if (characterMap != null && !characterMap.isEmpty()) {
            for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()) {
                Character character = mapCharacter.getValue();
                int characterMapId = character.getId();
                if (characterMapId == id) {
                    return character;
                }
            }
        }
        System.out.println("Персонажа с ID: " + id + " не существует");
        return null;
    }

    @Override
    public boolean deleteCharacterById(int keyId) { //boolean true
        Map<Integer, Character> characterById = new HashMap<>(characterMap);
        if (characterMap != null && !characterMap.isEmpty()) {
            for (Map.Entry<Integer, Character> mapCharacter : characterById.entrySet()) {
                int characterMapId = mapCharacter.getKey();
                if (characterMapId == keyId) {
                    characterById.remove(characterMapId);
                    System.out.println("Персонаж с ID: " + characterMapId + " удален");
                }
            }
        }
        return true;
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
    public List <Character> findDistinctAllCharacter(Map<Integer, Character> characterDublue) { //character
        if (characterDublue == null || characterDublue.isEmpty()) { // проверка на null
            System.out.println("Список персонажей пуст!");
        }
        Map<Integer, Character> distinctCharacter = new HashMap<>(); // создаем новый map и set для добавления найденных значений
        Set<Character> seenChatacter = new HashSet<>();
        for (Map.Entry<Integer, Character> entry : characterDublue.entrySet()) { // итерация по списку
            Character character = entry.getValue(); // получаем значения
            if (!seenChatacter.contains(character)) { // проверяем, если в нашем set не содержится найденное значение, то добавить
                seenChatacter.add(character);
                distinctCharacter.put(entry.getKey(), character); // получить ключ и добавить значения по условию
            }
            List<Character> distinctCharacterList = new ArrayList<>();
            for (Map.Entry<Integer, Character> distinctCharacterMap : distinctCharacter.entrySet()){
                Character characterDistinct = distinctCharacterMap.getValue();
                distinctCharacterList.add(characterDistinct);
            }
            return distinctCharacterList;
        }
        return null;
    }

    private int currentId = 10;

    @Override
    public Character addCharacter(String name, String namePosition) { //character and boolean
        PositionDaoImpl positionAll = new PositionDaoImpl();
        List<Position> positionList = positionAll.findAllPosition();
        for (Position actualPosition : positionList) {
            String positionName = actualPosition.getName();
            if (!namePosition.equalsIgnoreCase(positionName)) {
                System.out.println("Позиция не верна!");
            }
            return null;
        }
        int newId = ++currentId;
        Position position = new Position(namePosition);
        Character newCharacter = new Character(newId, name, position);
        String nameCharacter = newCharacter.getName();
        for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()) {
            Character character = mapCharacter.getValue();
            String nameMapCharacter = character.getName();
            if (!nameCharacter.equalsIgnoreCase(nameMapCharacter)) {
                characterMap.put(newId, newCharacter);
                System.out.println("Добавлен новый персонаж: " + nameCharacter);
            }
        }
        return newCharacter;
    }

    @Override
    public Character editCharacter(int id, String nameCharacter, String namePosition) { //character
        if (characterMap == null || characterMap.isEmpty()) {
            System.out.println("Список персонажей пуст!");
            return null;
        }
        PositionDaoImpl positionAll = new PositionDaoImpl();
        List<Position> positionList = positionAll.findAllPosition();
        for (Position actualPosition : positionList) {
            String positionName = actualPosition.getName();
            if (!namePosition.equalsIgnoreCase(positionName)) {
                System.out.println("Позиция не верна!");
            }
        }
        for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()) {
            int chracterMapId = mapCharacter.getKey();
            Character character = mapCharacter.getValue();
            Position position = character.getPositionChar();
            if (chracterMapId == id && nameCharacter != null && !nameCharacter.isEmpty()) {
                character.setName(nameCharacter);
                if (namePosition != null && !namePosition.isEmpty()) {
                    position.setName(namePosition);
                    System.out.println("Персонаж с " + id + " обновлен");
                }
            }
            return character;
        }
        System.out.println("Не удалось обновить персонажа");
        return null;
    }

    @Override
    public List<Character> findAllCharacterMap() { //list
        if (characterMap == null || characterMap.isEmpty()) {
            System.out.println("Список персонажей пуст!");
            return null;
        }
        List<Character> allCharacterList = new ArrayList<>();
        for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()){
            Character character = mapCharacter.getValue();
            allCharacterList.add(character);
        }
        return allCharacterList;
    }

    @Override
    public Character findCharacterByNameMap(String name) { //character
        if (characterMap == null || characterMap.isEmpty()) {
            System.out.println("Список персонажей пуст!");
            return null;
        }
        for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()) {
            Character character = mapCharacter.getValue();
            String characterName = character.getName();
            if (characterName.equalsIgnoreCase(name)) {
                return character;
            }
        }
        System.out.println("Имя персонажа передано не верно!");
        return null;
    }

    @Override
    public Character findCharacterByPositionNameMap(String name) {
        if (characterMap == null || characterMap.isEmpty()) {
            System.out.println("Список персонажей пуст!");
            return null;
        }
        for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()) {
            Character character = mapCharacter.getValue();
            Position position = character.getPositionChar();
            String positionName = position.getName();
            if (positionName.equalsIgnoreCase(name)) {
                return character;
            }
        }
        System.out.println("Название позиции передано не верно!");
        return null;
    }

    @Override
    public List<Character> findCharacterByDraft() { //list
        if (characterDraftMap == null || characterDraftMap.isEmpty()) {
            System.out.println("Драфт пуст!");
            return null;
        }
        List<Character> characterDraftList = new ArrayList<>();
        for (Map.Entry<Integer, Character> mapCharacter : characterDraftMap.entrySet()){
            Character character = mapCharacter.getValue();
            characterDraftList.add(character);
        }
        return characterDraftList;
    }

    @Override
    public boolean saveCharacterDraftMap(int idCharacter) {
        if (characterDraftMap.size() >= 5) {
            System.out.println("Персонажа добавить нельзя, драфт переполнен");
            return false;
        }
        if (characterMap == null || characterMap.isEmpty()) {
            System.out.println("Список персонажей пуст!");
            return false;
        }
        for (Map.Entry<Integer, Character> mapCharacter : characterMap.entrySet()) {
            Character character = mapCharacter.getValue();
            int characterId = character.getId();
            if (characterId == idCharacter) {
                Position position = character.getPositionChar();
                boolean isClosePosition = position.isClose();
                InformationCharacter aspect = character.getInformationCharacter();
                List<Aspect> aspects = aspect.getAspects();
                List<Aspect> defaultAspect = new ArrayList<>();
                for (Aspect aspectDefault : aspects) {
                    boolean isDefaultAspect = aspectDefault.isDefaultAspect();
                    if (isDefaultAspect) {
                        defaultAspect.add(aspectDefault);
                    }
                    if (!isClosePosition) {
                        defaultAspect.remove(aspectDefault);
                    }
                }
                if (!isClosePosition && !characterDraftMap.containsKey(idCharacter)) {
                    characterDraftMap.put(idCharacter, character);
                    position.setClose(true);
                    System.out.println("Добавлен персонаж: " + character);
                    System.out.println("Сохраненные персонажи: " + characterDraftMap);
                    return true;
                } else {
                    System.out.println("Позиция уже занята для персонажа: " + character.getName());
                    return false;
                }
            }
        }
        System.out.println("Персонаж с ID " + idCharacter + " не найден.");
        return false;
    }

    @Override
    public Character findCharacterInfoMap(int idCharacter) {
        if (characterDraftMap == null || characterDraftMap.isEmpty()) {
            System.out.println("Драфт пуст!");
            return null;
        }
     for (Map.Entry<Integer, Character> mapCharacterDraft : characterDraftMap.entrySet()){
         Character character = mapCharacterDraft.getValue();
         int characterId = character.getId();
         if (characterId == idCharacter){
             InformationCharacter infoCharacter = character.getInformationCharacter();
             Сharacteristic сharacteristic = infoCharacter.getСharacteristics();
             System.out.println(сharacteristic);
             return character;
             }
             System.out.println("Данного персонажа нет в драфте, получении информации не возможно!");
             return null;
        }
        System.out.println("Персонаж с таким ID не найден");
        return null;
    }

    @Override
    public List<CharacterPumping> findInfoCharacterSkills(String name) {

    }
}
