package templates.faces.src_main_webapp;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractDesktopXhtmlTemplate;

/**
 * File template for XHTML desktop index page.
 */
@SuppressWarnings("all")
public class IndexXhtmlTemplate extends AbstractDesktopXhtmlTemplate {
  public IndexXhtmlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("index");
    this.setRelativPath("/src/main/webapp/");
    this.setDocumentation("XHTML desktop index page.");
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ui:include src=\"/mobile/index.xhtml\" />");
    _builder.newLine();
    return _builder.toString();
  }
}
