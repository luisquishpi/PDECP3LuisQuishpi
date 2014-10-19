package models.dao.mem;

import models.dao.RoundDao;
import models.entities.RoundEntidad;


public class MemRoundDao extends MemGenericDao<RoundEntidad, Integer> implements RoundDao{

    
    @Override
    protected Integer getId(RoundEntidad entity) {

        return entity.getId();
    }

    public void deleteByID(Integer id) {
  
    }

   

  

}
