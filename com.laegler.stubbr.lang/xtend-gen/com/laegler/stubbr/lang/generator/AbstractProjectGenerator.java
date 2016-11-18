package com.laegler.stubbr.lang.generator;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import java.util.Collection;
import java.util.logging.Logger;
import javax.inject.Inject;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Abstract project generator.
 */
@SuppressWarnings("all")
public abstract class AbstractProjectGenerator {
  @Inject
  protected Logger log;
  
  @Inject
  protected StubbrRegistry stubbr;
  
  @Accessors
  private Project project;
  
  public abstract Project prepare();
  
  protected boolean isNullOrEmpty2(final Object object) {
    if ((object instanceof Collection<?>)) {
      return ((!Objects.equal(object, null)) && (!((Collection<?>)object).isEmpty()));
    }
    if ((object instanceof String)) {
      return ((!Objects.equal(object, null)) && (!((String)object).isEmpty()));
    }
    return (!Objects.equal(object, null));
  }
  
  @Pure
  public Project getProject() {
    return this.project;
  }
  
  public void setProject(final Project project) {
    this.project = project;
  }
}
