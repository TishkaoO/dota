package dao.impl;

import dao.RoleGameDao;
import model.RoleGame;

import java.util.ArrayList;
import java.util.List;

public class RoleGameDaoImpl implements RoleGameDao {

    private final List<RoleGame> roleGameList = new ArrayList<>();

    {
        roleGameList.add (new RoleGame(1, "DD"));
        roleGameList.add (new RoleGame(2, "Sup"));
    }

    @Override
    public List<RoleGame> findRolesGame() {
        return roleGameList;
    }

    @Override
    public RoleGame findRolesGameById(int id) {
        for (RoleGame roleGame : roleGameList) {
            if (roleGame.getId() == id) {
                return roleGame;
            }
        }
        return null;
    }
}
