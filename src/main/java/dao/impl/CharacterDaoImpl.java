package dao.impl;

import dao.CharacterDao;
import model.Character;
import model.Position;
import model.RoleGame;

import java.util.ArrayList;
import java.util.List;

public class CharacterDaoImpl implements CharacterDao {

    private final List<Character> characterList = new ArrayList<>();

    private int id = 0;

    {
        characterList.add(new Character(1, "Phantom Assassin", new Position(1, "Core"), new RoleGame(1, "DD")));
        characterList.add(new Character(2, "Juggernaut", new Position(1, "Core"), new RoleGame(1, "DD")));
        characterList.add(new Character(3, "Zeus", new Position(2, "Mid"), new RoleGame(1, "DD")));
        characterList.add(new Character(4, "Invoker", new Position(2, "Mid"), new RoleGame(1, "DD")));
        characterList.add(new Character(5, "Axe", new Position(3, "Hard Line"), new RoleGame(1, "DD")));
        characterList.add(new Character(6, "Legion Commander", new Position(3, "Hard Line"), new RoleGame(1, "DD")));
        characterList.add(new Character(7, "Jakiro", new Position(4, "Support"), new RoleGame(2, "Sup")));
        characterList.add(new Character(8, "Ancient Apparition", new Position(4, "Support"), new RoleGame(2, "Sup")));
        characterList.add(new Character(9, "Crystal Maiden", new Position(5, "Line Support"), new RoleGame(2, "Sup")));
        characterList.add(new Character(10, "Witch Doctor", new Position(5, "Line Support"), new RoleGame(2, "Sup")));

    }

    @Override
    public void save(Character character) {

    }

    @Override
    public List<Character> findAllCharacter() {
        return List.of();
    }

    @Override
    public Character findCharacterByName(String name) {
        return null;
    }

    @Override
    public Character findCharacterById(int characterId) {
        return null;
    }

    @Override
    public List<Character> findCharactersByPositionIdAndRoleId(int positionId, int roleId) {
        List<Character> actualCharacters = new ArrayList<>();
        for(Character character : characterList){
           Position position = character.getPositionChar();
           RoleGame roleGame = character.getRoleGameChar();
           int idRolegame = roleGame.getId();
           int idPosition = position.getId();

           if (idRolegame == roleId && idPosition == positionId){
               actualCharacters.add(character);
           }
        }
        return actualCharacters;
    }
}
