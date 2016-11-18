package org.example.stubbr.persistence.service;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import java.util.List;
import javax.annotation.Generated;
import javax.ejb.Stateless;
import org.example.stubbr.model.entity.Bar;

/**
 * Simple persistence service for managing entity Bar
 * 
 * @author Thomas Laegler {@literal <thomas.laeger[at]googlemail.com>}
 * @since 0.0.1-SNAPSHOT
 * @version 0.0.1-SNAPSHOT
 * @generated 16.11.2016 - 15:09:35
 */
@Since(value = 0.01)
@Until(value = 0.01)
@Generated(value = "templates.persistence.src_main_java.basepack.persistence.service.EntityServiceInterfaceXtendTemplate")
@Stateless
@SuppressWarnings("all")
public interface BarService {
  /**
   * Persist a bar.
   * 
   * @param bar the entity to persist
   * @return the persisted entity
   */
  public abstract Bar persist(final Bar bar);
  
  /**
   * Update a bar.
   * 
   * @param bar the entity to update
   * @return the persisted entity
   */
  public abstract Bar update(final Bar bar);
  
  /**
   * Get all the bars.
   * 
   *  @return the list of entities
   */
  public abstract List<Bar> findAll();
  
  /**
   * Get one bar by id.
   * 
   *  @param id the id of the entity
   *  @return the entity
   */
  public abstract Bar findById(final long id);
  
  /**
   * Delete the  Bar by id.
   * 
   *  @param id the id of the entity
   */
  public abstract void remove(final long id);
}
