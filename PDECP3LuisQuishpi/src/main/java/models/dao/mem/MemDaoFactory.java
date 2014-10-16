package models.dao.mem;

import models.dao.DaoFactory;
import models.dao.RoundGestorDao;
import models.dao.UserGestorDao;

public class MemDaoFactory extends DaoFactory {

    public MemDaoFactory(){
        super.setDaoFactory(this);
    }
    @Override
    public RoundGestorDao getRoundDao() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserGestorDao getUserGestorDao() {
        // TODO Auto-generated method stub
        return null;
    }

}
