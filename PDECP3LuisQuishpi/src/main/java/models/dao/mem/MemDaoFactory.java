package models.dao.mem;

import models.dao.DaoFactory;
import models.dao.RoundDao;
import models.dao.UserDao;

public class MemDaoFactory extends DaoFactory {

    public MemDaoFactory(){
        super.setDaoFactory(this);
    }
    @Override
    public RoundDao getRoundDao() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserDao getUserGestorDao() {
        // TODO Auto-generated method stub
        return null;
    }

}
