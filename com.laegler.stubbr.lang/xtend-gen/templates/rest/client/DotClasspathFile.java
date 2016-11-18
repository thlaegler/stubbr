package templates.rest.client;

import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * File Generator for .classpath
 */
@SuppressWarnings("all")
public class DotClasspathFile /* implements templates._common.DotClasspathFile  */{
  @Inject
  @Extension
  private StubbrRegistry _stubbrRegistry;
  
  @Override
  public CharSequence getTemplateName() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class is undefined for the type DotClasspathFile"
      + "\nname cannot be resolved");
  }
  
  @Override
  public /* ProjectType */Object getProject() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ProjectType is undefined"
      + "\nREST_CLIENT cannot be resolved");
  }
  
  @Override
  public CharSequence getTemplate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field header is undefined"
      + "\nThe method or field footer is undefined");
  }
}
