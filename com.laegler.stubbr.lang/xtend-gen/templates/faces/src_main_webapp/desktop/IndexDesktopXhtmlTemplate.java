package templates.faces.src_main_webapp.desktop;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractDesktopXhtmlTemplate;

/**
 * File template for JSF/XHTML desktop index page.
 */
@SuppressWarnings("all")
public class IndexDesktopXhtmlTemplate extends AbstractDesktopXhtmlTemplate {
  public IndexDesktopXhtmlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("index");
    this.setRelativPath("/src/main/webapp/desktop/");
    this.setDocumentation("JSF/XHTML desktop index page.");
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ui:include src=\"/desktop/index.xhtml\" />");
    _builder.newLine();
    return _builder.toString();
  }
}
