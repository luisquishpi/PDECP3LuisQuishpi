package models.dao;

import java.util.List;

public interface GenericDao<T, ID> {

    public void create(T entity);

    public void delete(T entity);

    public T read(ID id);

    public void update(T entity);

    public void deleteByID(ID id);

    public List<T> findAll();

    public List<T> findAll(int index, int size);

}
