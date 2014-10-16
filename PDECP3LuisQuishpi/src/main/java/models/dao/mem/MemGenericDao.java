package models.dao.mem;

import models.dao.GenericDao;

public abstract class MemGenericDao<T, ID> implements GenericDao<T, ID> {

    
    protected abstract ID getId(T entity);
    
    public void create(T entity) {
        // TODO Auto-generated method stub
        
    }

    public void delete(T entity) {
        // TODO Auto-generated method stub
        
    }

    public void getStatics(ID id) {
        // TODO Auto-generated method stub
        
    }

    public void login() {
        // TODO Auto-generated method stub
        
    }

    public void logout() {
        // TODO Auto-generated method stub
        
    }

    public void moveCard() {
        // TODO Auto-generated method stub
        
    }

}
