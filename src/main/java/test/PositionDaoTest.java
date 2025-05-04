package test;

import dao.PositionDao;
import dao.impl.PositionDaoImpl;
import model.Position;

import java.util.List;

public class PositionDaoTest {

    public static void main(String[] args) {
        //findAllPositionTest();
        findPositionFreeTest();
    }

    public static void findAllPositionTest() {
        PositionDao positionDao = new PositionDaoImpl();
        List<Position> position = positionDao.findAllPosition();
        System.out.println(position);
    }

    public static void findPositionFreeTest() {
        PositionDao positionDao = new PositionDaoImpl();
        List<Position> position = positionDao.findPositionFree();
        System.out.println(position);
    }
}
