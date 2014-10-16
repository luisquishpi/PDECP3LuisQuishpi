package models.dao;

public final class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory(){
        
    }
    public DaoFactory getDaoFactory() {
        if (DaoFactory.daoFactory == null) {
            DaoFactory.daoFactory = new DaoFactory();
        }
        return DaoFactory.daoFactory;

    }

    public RoundGestorDao getRoundDao() {
        return null;
    }

    public UserGestorDao getUserGestorDao() {
        return null;

    }
}
