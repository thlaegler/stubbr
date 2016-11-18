package templates;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXhtmlTemplate;

/**
 * Abstract super type for all JSF/XHTML desktop templates.
 */
@SuppressWarnings("all")
public abstract class AbstractDesktopXhtmlTemplate extends AbstractXhtmlTemplate {
  public AbstractDesktopXhtmlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setRelativPath("/src/main/webapp/desktop/");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
    _builder.newLine();
    _builder.append("<html xmlns=\"http://www.w3.org/1999/xhtml\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:ui=\"http://java.sun.com/jsf/facelets\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:f=\"http://java.sun.com/jsf/core\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:h=\"http://java.sun.com/jsf/html\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:c=\"http://java.sun.com/jsp/jstl/core\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:p=\"http://primefaces.org/ui\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h:head></h:head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h:body>");
    _builder.newLine();
    this.setHeader(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\t");
    _builder_1.append("</h:body>");
    _builder_1.newLine();
    _builder_1.append("</html>");
    _builder_1.newLine();
    this.setFooter(_builder_1.toString());
  }
}
