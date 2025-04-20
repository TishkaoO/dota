package service;

import model.RoleGame;
import dao.RoleGameDao;

import java.util.List;

public class RoleGameServiceImpl implements RoleGameService {
    private final RoleGameDao gameDao;

    public RoleGameServiceImpl(RoleGameDao gameDao) {
        this.gameDao = gameDao;
    }

    @Override
    public List<RoleGame> getRolesGame() {
       return gameDao.findRolesGame();
    }

    @Override
    public RoleGame getRoleGameById(int id) {
        return gameDao.findRolesGameById(id);
    }
}
