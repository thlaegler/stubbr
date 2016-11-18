package org.example.stubbr.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.example.stubbr.model.entity.Bar;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Entity User
 * 
 * @author Thomas Laegler {@literal <thomas.laeger[at]googlemail.com>}
 * @since 0.0.1-SNAPSHOT
 * @version 0.0.1-SNAPSHOT
 * @generated 16.11.2016 - 15:09:35
 */
@Since(value = 0.01)
@Until(value = 0.01)
@Generated(value = "templates.model.src_main_java.basepack.model.entity.EntityTemplate")
@Accessors
@Entity
@Table(name = "user")
@XmlRootElement
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)/* 
@NamedQuery(name = "User.findAll", query = "SELECT e FROM user e")
@NamedQuery(name = "User.findById", query = "SELECT e FROM user e WHERE e.id = :id") */
@SuppressWarnings("all")
public class User implements Serializable {
  /**
   * ID / primary key of entity User
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  @Column(name = "gaga")
  @Until(0.01)
  @JsonProperty("gaga")
  @XmlElement
  @Expose(serialize = true, deserialize = true)
  private boolean gaga;
  
  @Column(name = "ref")
  @Until(0.01)
  @JsonProperty("ref")
  @XmlElement
  @Expose(serialize = true, deserialize = true)
  private Bar ref;
  
  @Pure
  public long getId() {
    return this.id;
  }
  
  public void setId(final long id) {
    this.id = id;
  }
  
  @Pure
  public boolean isGaga() {
    return this.gaga;
  }
  
  public void setGaga(final boolean gaga) {
    this.gaga = gaga;
  }
  
  @Pure
  public Bar getRef() {
    return this.ref;
  }
  
  public void setRef(final Bar ref) {
    this.ref = ref;
  }
}
