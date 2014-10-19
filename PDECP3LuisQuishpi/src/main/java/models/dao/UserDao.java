package models.dao;

import models.entities.UserEntidad;

public interface UserDao extends GenericDao<UserEntidad, Integer> {

    public void findByUserId(Integer userId);

}
