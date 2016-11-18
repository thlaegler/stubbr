package templates;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXhtmlTemplate;

/**
 * Abstract super type for all JSF/XHTML mobile templates.
 */
@SuppressWarnings("all")
public abstract class AbstractMobileXhtmlTemplate extends AbstractXhtmlTemplate {
  public AbstractMobileXhtmlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setRelativPath("/src/main/webapp/mobile/");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ui:composition");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns=\"http://www.w3.org/1999/xhtml\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:h=\"http://xmlns.jcp.org/jsf/html\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:p=\"http://primefaces.org/ui\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:c=\"http://java.sun.com/jsp/jstl/core\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:ui=\"http://java.sun.com/jsf/facelets\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:f=\"http://xmlns.jcp.org/jsf/core\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:pm=\"http://primefaces.org/mobile\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<f:view renderKitId=\"PRIMEFACES_MOBILE\" />");
    _builder.newLine();
    this.setHeader(_builder.toString());
    this.setFooter("</ui:composition>");
  }
}
