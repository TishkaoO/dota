package test;

import dao.RoleGameDao;
import dao.impl.RoleGameDaoImpl;
import model.RoleGame;

import java.util.List;

public class RoleGameDaoTest {

    public static void main(String[] args) {
        findRolesGameTest();
        findRolesGameByIdTest();
    }


    public static void findRolesGameTest() {
        RoleGameDao roleGameDao = new RoleGameDaoImpl();
        List<RoleGame> roleGames = roleGameDao.findRolesGame();
        System.out.println(roleGames);
    }

    public static void findRolesGameByIdTest() {
        RoleGameDao roleGameDao = new RoleGameDaoImpl();
        RoleGame roleGames = roleGameDao.findRolesGameById(1);
        System.out.println(roleGames);
    }
}
