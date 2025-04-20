package dao.impl;

import dao.PositionDao;
import model.Position;

import java.util.ArrayList;
import java.util.List;

public class PositionDaoImpl implements PositionDao {

    private final List<Position> positionList = new ArrayList<>();

    {
        positionList.add (new Position(1, "Core"));
        positionList.add (new Position(2, "Mid"));
        positionList.add (new Position(3, "Hard Line"));
        positionList.add (new Position(4, "Support"));
        positionList.add (new Position(5, "Line Support"));
    }

    @Override
    public List<Position> getPosition() {
        return List.of();
    }
}
