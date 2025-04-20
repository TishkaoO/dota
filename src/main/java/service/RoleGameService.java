package service;

import model.RoleGame;

import java.util.List;

public interface RoleGameService {

    List<RoleGame> getRolesGame();
    RoleGame getRoleGameById(int id);

}
