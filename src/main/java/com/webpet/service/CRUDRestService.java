package com.webpet.service;

import com.webpet.dao.DAO;
import com.webpet.domain.AbstractEntity;
import java.util.List;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;

/**
 *
 * @author fernando
 * @param <T>
 */
public interface CRUDRestService<T extends AbstractEntity> {
    
    Response getById(Long id);
    
    Response getAll();
    
    Response save(T entity);
    
    Response update(T entity, Long id);
    
    Response delete(Long id);
    
    GenericEntity listToGenericEntity(List<T> list);
    
    DAO getDao();
    
    Logger getLogger();
}
