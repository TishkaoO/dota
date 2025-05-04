package dao;

import model.Position;

import java.util.List;

public interface PositionDao {

    List<Position> findAllPosition();

    List<Position> findPositionFree();
}
