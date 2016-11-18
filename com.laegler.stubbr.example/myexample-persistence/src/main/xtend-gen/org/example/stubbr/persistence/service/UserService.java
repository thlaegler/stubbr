package org.example.stubbr.persistence.service;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import java.util.List;
import javax.annotation.Generated;
import javax.ejb.Stateless;
import org.example.stubbr.model.entity.User;

/**
 * Simple persistence service for managing entity User
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
public interface UserService {
  /**
   * Persist a user.
   * 
   * @param user the entity to persist
   * @return the persisted entity
   */
  public abstract User persist(final User user);
  
  /**
   * Update a user.
   * 
   * @param user the entity to update
   * @return the persisted entity
   */
  public abstract User update(final User user);
  
  /**
   * Get all the users.
   * 
   *  @return the list of entities
   */
  public abstract List<User> findAll();
  
  /**
   * Get one user by id.
   * 
   *  @param id the id of the entity
   *  @return the entity
   */
  public abstract User findOne(final Long id);
  
  /**
   * Delete the  User by id.
   * 
   *  @param id the id of the entity
   */
  public abstract void delete(final Long id);
}
