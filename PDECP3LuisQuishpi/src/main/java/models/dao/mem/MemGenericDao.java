package models.dao.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.dao.GenericDao;

public abstract class MemGenericDao<T, ID> implements GenericDao<T, ID> {

    Map<ID, T> entities = new HashMap<ID, T>();

    protected abstract ID getId(T entity);

    public void create(T entity) {
        assert !entities.containsKey(getId(entity)) : "Entidad ya existe";
        this.entities.put(getId(entity), entity);
    }

    public T read(ID id) {
        return entities.get(id);
    }

    public void update(T entity) {
        assert entities.containsKey(getId(entity)) : "Entidad no encontrada para actualizar";
        entities.put(getId(entity), entity);
    }

    public void delete(T entity) {
        assert entities.containsKey(getId(entity)) : "Entidad no encontrada para eliminar";
        entities.remove(getId(entity));
    }

    public void deleteById(ID id) {
        assert this.entities.containsKey(id) : "Entidad no encontradad para eliminar";
        entities.remove(id);
    }

    public List<T> findAll() {
        return new ArrayList<T>(entities.values());
    }

    public List<T> findAll(int index, int size) {
        List<T> list = new ArrayList<T>(entities.values());
        return list.subList(index, size);
    }

}
