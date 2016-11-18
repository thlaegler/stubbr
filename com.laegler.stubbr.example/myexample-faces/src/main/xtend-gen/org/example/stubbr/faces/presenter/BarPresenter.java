package org.example.stubbr.faces.presenter;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import javax.annotation.Generated;
import javax.annotation.PostConstruct;
import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.slf4j.Logger;

/**
 * JSF/Faces presenter for managing entity Bar
 * 
 * @author Thomas Laegler {@literal <thomas.laeger[at]googlemail.com>}
 * @since 0.0.1-SNAPSHOT
 * @version 0.0.1-SNAPSHOT
 * @generated 16.11.2016 - 15:09:35
 */
@Since(value = 0.01)
@Until(value = 0.01)
@Generated(value = "templates.faces.src_main_java.basepack.faces.presenter.EntityPresenterXtendTemplate")
@RequestScoped
@SuppressWarnings("all")
public class BarPresenter /* implements AbstractPresenter  */{
  @Inject
  private Logger log;
  
  @PostConstruct
  public void init() {
  }
  
  /**
   * @return
   */
  @PermitAll
  public String submitSave() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field id is undefined");
  }
  
  /**
   * @return
   */
  public String goToDetails(final long id) {
    String _xblockexpression = null;
    {
      this.log.info("managementGoToPrincipalDetails(id={}) called.", Long.valueOf(id));
      _xblockexpression = "";
    }
    return _xblockexpression;
  }
}
