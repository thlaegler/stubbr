package org.example.stubbr.persistence.service;

import com.google.common.base.Objects;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.security.PermitAll;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.example.stubbr.model.entity.User;
import org.example.stubbr.persistence.service.UserService;
import org.slf4j.Logger;

/**
 * Simple persistence service implementation for managing entity User
 * 
 * @author Thomas Laegler {@literal <thomas.laeger[at]googlemail.com>}
 * @since 0.0.1-SNAPSHOT
 * @version 0.0.1-SNAPSHOT
 * @generated 16.11.2016 - 15:09:35
 */
@Since(value = 0.01)
@Until(value = 0.01)
@Generated(value = "templates.persistence.src_main_java.basepack.persistence.service.EntityServiceImplXtendTemplate")
@Stateless
@PermitAll
@Local
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {
  @Inject
  private Logger log;
  
  @PersistenceContext(unitName = "unitName")
  private EntityManager em;
  
  /**
   * Persist entity user.
   * 
   * @param user the entity to persist.
   * @return the persisted entity
   */
  @Override
  public User persist(final User user) {
    this.log.debug("Try to persist entity User : {}", user);
    boolean _notEquals = (!Objects.equal(user, null));
    if (_notEquals) {
      try {
        this.em.persist(user);
        this.em.flush();
        this.log.info("persist(entity={}) Entity User persisted.", user);
        long _id = user.getId();
        return this.findById(_id);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          this.log.error("persist(entity={}) Failed to persist entity User.", user, e);
          return null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    this.log.warn("persist(entity={}) Cannot persist null entity");
    return null;
  }
  
  /**
   * Update entity user.
   * 
   * @param user the entity to update.
   * @return the updated entity
   */
  @Override
  public User update(final User user) {
    this.log.debug("update(entity={}) Try to update entity User : {}", user);
    boolean _notEquals = (!Objects.equal(user, null));
    if (_notEquals) {
      try {
        this.em.persist(user);
        this.em.flush();
        this.log.info("update(entity={}) Entity User updated.", user);
        long _id = user.getId();
        return this.findById(_id);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          this.log.error("update(entity={}) Failed to update entity User.", user, e);
          return null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    this.log.warn("update(entity={}) Cannot update null entity");
    return null;
  }
  
  /**
   * Get all of entity User.
   * 
   *  @return the list of all entities
   */
  @Override
  public List<User> findAll() {
    this.log.debug("findAll() Try to get all of entity User.");
    try {
      final Query query = this.em.createNamedQuery("User.findAll");
      final List<User> result = query.getResultList();
      this.log.info("findAll() Got all of entity User.");
      return result;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        this.log.error("findAll() Failed to get all of entity User.", e);
        return Collections.<User>emptyList();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  /**
   * Get entity user by ID.
   * 
   *  @param id the ID of the entity
   *  @return the entity
   */
  @Override
  public User findById(final long id) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe operator \'!=\' is undefined for the argument types long and null");
  }
  
  /**
   * Remove entity User by ID.
   * 
   *  @param id the ID of the entity to be removed
   */
  @Override
  public void remove(final long id) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe operator \'!=\' is undefined for the argument types long and null");
  }
}
