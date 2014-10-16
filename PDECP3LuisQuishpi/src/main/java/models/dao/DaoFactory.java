package models.dao;

public abstract class DaoFactory {

    private static DaoFactory daoFactory;

    protected DaoFactory() {

    }

    public DaoFactory getDaoFactory() {
        assert DaoFactory.daoFactory != null : "daoFactory nulo";
        return DaoFactory.daoFactory;
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        DaoFactory.daoFactory = daoFactory;
    }

    public abstract RoundGestorDao getRoundDao();

    public abstract UserGestorDao getUserGestorDao();
}
