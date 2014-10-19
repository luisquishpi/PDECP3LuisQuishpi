package models.dao.mem;

import models.dao.UserDao;
import models.entities.UserEntidad;

public class MemUserDao extends MemGenericDao<UserEntidad, Integer> implements UserDao {

    @Override
    protected Integer getId(UserEntidad entity) {
        return entity.getId();
    }

    public void deleteByID(Integer id) {
        
    }

    public void findByUserId(Integer userId) {

        
    }
    
    

}
