package dao;

import model.RoleGame;

import java.util.List;

public interface RoleGameDao {

    List<RoleGame> findRolesGame();

    RoleGame findRolesGameById(int id);
}
