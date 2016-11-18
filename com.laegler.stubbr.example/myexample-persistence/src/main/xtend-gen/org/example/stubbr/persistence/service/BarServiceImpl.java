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
import org.example.stubbr.model.entity.Bar;
import org.example.stubbr.persistence.service.BarService;
import org.slf4j.Logger;

/**
 * Simple persistence service implementation for managing entity Bar
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
public class BarServiceImpl implements BarService {
  @Inject
  private Logger log;
  
  @PersistenceContext(unitName = "unitName")
  private EntityManager em;
  
  /**
   * Persist entity bar.
   * 
   * @param bar the entity to persist.
   * @return the persisted entity
   */
  @Override
  public Bar persist(final Bar bar) {
    this.log.debug("Try to persist entity Bar : {}", bar);
    boolean _notEquals = (!Objects.equal(bar, null));
    if (_notEquals) {
      try {
        this.em.persist(bar);
        this.em.flush();
        this.log.info("persist(entity={}) Entity Bar persisted.", bar);
        long _id = bar.getId();
        return this.findById(_id);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          this.log.error("persist(entity={}) Failed to persist entity Bar.", bar, e);
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
   * Update entity bar.
   * 
   * @param bar the entity to update.
   * @return the updated entity
   */
  @Override
  public Bar update(final Bar bar) {
    this.log.debug("update(entity={}) Try to update entity Bar : {}", bar);
    boolean _notEquals = (!Objects.equal(bar, null));
    if (_notEquals) {
      try {
        this.em.persist(bar);
        this.em.flush();
        this.log.info("update(entity={}) Entity Bar updated.", bar);
        long _id = bar.getId();
        return this.findById(_id);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          this.log.error("update(entity={}) Failed to update entity Bar.", bar, e);
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
   * Get all of entity Bar.
   * 
   *  @return the list of all entities
   */
  @Override
  public List<Bar> findAll() {
    this.log.debug("findAll() Try to get all of entity Bar.");
    try {
      final Query query = this.em.createNamedQuery("Bar.findAll");
      final List<Bar> result = query.getResultList();
      this.log.info("findAll() Got all of entity Bar.");
      return result;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        this.log.error("findAll() Failed to get all of entity Bar.", e);
        return Collections.<Bar>emptyList();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  /**
   * Get entity bar by ID.
   * 
   *  @param id the ID of the entity
   *  @return the entity
   */
  @Override
  public Bar findById(final long id) {
    this.log.debug("findById(id={}) Try to get entity by ID {}.", Long.valueOf(id), Long.valueOf(id));
    final String queryString = "SELECT e FROM bar e WHERE e.id = :id";
    try {
      final Bar bar = this.em.<Bar>find(Bar.class, Long.valueOf(id));
      this.log.info("findById({}) Got entity by ID {}.", Long.valueOf(id), Long.valueOf(id));
      return bar;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        this.log.error("findById({}) Failed to get entity by ID {}.", Long.valueOf(id), Long.valueOf(id));
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  /**
   * Remove entity Bar by ID.
   * 
   *  @param id the ID of the entity to be removed
   */
  @Override
  public void remove(final long id) {
    this.log.debug("remove(id={}) Try to remove entity by ID {}.", Long.valueOf(id), Long.valueOf(id));
    try {
      final Bar bar = this.findById(id);
      this.em.remove(bar);
      this.log.info("remove({}) Removed entity by ID {}.", Long.valueOf(id), Long.valueOf(id));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        this.log.error("remove({}) Failed to remove entity by ID {}.", Long.valueOf(id), Long.valueOf(id));
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
