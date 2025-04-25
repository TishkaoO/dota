package dao.impl;

import dao.PositionDao;
import model.Character;
import model.Position;

import java.util.ArrayList;
import java.util.List;

public class PositionDaoImpl implements PositionDao {

    public final List<Position> positionList = new ArrayList<>();

    {
        positionList.add (new Position(1, "Core"));
        positionList.add (new Position(2, "Mid"));
        positionList.add (new Position(3, "Hard Line"));
        positionList.add (new Position(4, "Hard Support"));
        positionList.add (new Position(5, "Save Support"));
    }

    @Override
    public List<Position> findAllPosition() {
        return positionList;
    }

    @Override
    public List<Position> findPositionsLeft() { // пока не знаю как реализовать!!!
            List<Position> remainingPositions = new ArrayList<>(positionList);
            List<Character> characterList = new ArrayList<>();
            // Удаляем позиции, которые уже были использованы персонажами
            for (Character character : characterList) {
                Position position = character.getPositionChar();
                remainingPositions.remove(position);
            }
            return remainingPositions; // Возвращаем список оставшихся позиций
        }
}

