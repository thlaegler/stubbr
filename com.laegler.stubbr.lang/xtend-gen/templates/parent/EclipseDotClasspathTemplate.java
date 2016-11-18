package templates.parent;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates._common.EclipseDotClasspathTemplateBase;

/**
 * File template for Eclipse classpath for parent project.
 */
@SuppressWarnings("all")
public class EclipseDotClasspathTemplate extends EclipseDotClasspathTemplateBase {
  public EclipseDotClasspathTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setRelativPath("/");
    this.setDocumentation("Eclipse classpath for parent project");
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<classpathentry kind=\"src\" path=\"src\"/>");
    _builder.newLine();
    _builder.append("<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8\"/>");
    _builder.newLine();
    _builder.append("<classpathentry kind=\"output\" path=\"target/classes\"/>");
    _builder.newLine();
    return _builder.toString();
  }
}
