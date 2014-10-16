package models.dao;

public interface GenericDao<T, ID> {
    public void create(T entity);

    public void delete(T entity);

    public void getStatics(ID id);

    public void login();

    public void logout();

    public void moveCard();
}
