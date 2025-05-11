package dao.impl;

import dao.PositionDao;
import model.Character;
import model.Position;

import java.util.ArrayList;
import java.util.List;

public class PositionDaoImpl implements PositionDao {

    private List<Position> positionList = new ArrayList<>();

    {
        positionList.add(new Position(1, "Core", false));
        positionList.add(new Position(2, "Mid", false));
        positionList.add(new Position(3, "Hard Line", false));
        positionList.add(new Position(4, "Hard Support", false));
        positionList.add(new Position(5, "Save Support", false));
    }

    @Override
    public List<Position> findAllPosition() {
        return positionList;
    }

    /**
     * 1. Предоставить список свободных позиций.
     */
    @Override
    public List<Position> findPositionFree() {
        List<Position> actualPositionList = new ArrayList<>();
        for (Position position : positionList) {
            boolean isClosePosition = position.isClose();
            if (!isClosePosition) {
                actualPositionList.add(position);
            }
        }
        return actualPositionList;
    }
}
