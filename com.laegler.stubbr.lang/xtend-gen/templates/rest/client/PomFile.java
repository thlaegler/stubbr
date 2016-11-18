package templates.rest.client;

import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * File Generator for Maven pom.xml
 */
@SuppressWarnings("all")
public class PomFile /* implements templates._common.PomFile  */{
  @Inject
  @Extension
  private StubbrRegistry _stubbrRegistry;
  
  @Override
  public CharSequence getTemplateName() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class is undefined for the type PomFile"
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
      + "\nThe method or field parentSection is undefined"
      + "\nThe method or field projectName is undefined"
      + "\nThe method or field footer is undefined"
      + "\nThe method getProject() from the type PomFile refers to the missing type ProjectType"
      + "\ngetPackaging cannot be resolved");
  }
}
