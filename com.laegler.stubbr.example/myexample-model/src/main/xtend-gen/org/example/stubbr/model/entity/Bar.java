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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Entity Bar
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
@Table(name = "bar")
@XmlRootElement
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@NamedQueries({ @NamedQuery(name = "Bar.findAll", query = "SELECT e FROM bar e"), @NamedQuery(name = "Bar.findById", query = "SELECT e FROM bar e WHERE e.id = :id") })
@SuppressWarnings("all")
public class Bar implements Serializable {
  /**
   * ID / primary key of entity Bar
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "account")
  @Until(0.01)
  @JsonProperty("account")
  @XmlElement
  @Expose(serialize = true, deserialize = true)
  private long account;
  
  @Pure
  public long getId() {
    return this.id;
  }
  
  public void setId(final long id) {
    this.id = id;
  }
  
  @Pure
  public long getAccount() {
    return this.account;
  }
  
  public void setAccount(final long account) {
    this.account = account;
  }
}
