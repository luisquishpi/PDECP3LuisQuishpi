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
        return new MemRoundDao();
    }
    
    @Override
    public UserDao getUserDao() {
        return new MemUserDao();
    }

}
