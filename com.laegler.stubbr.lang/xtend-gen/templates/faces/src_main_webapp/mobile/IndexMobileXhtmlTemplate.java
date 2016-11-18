package templates.faces.src_main_webapp.mobile;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractMobileXhtmlTemplate;

/**
 * File template for JSF/XHTML mobile index page.
 */
@SuppressWarnings("all")
public class IndexMobileXhtmlTemplate extends AbstractMobileXhtmlTemplate {
  public IndexMobileXhtmlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("index");
    this.setRelativPath("/src/main/webapp/mobile/");
    this.setDocumentation("JSF/XHTML mobile index page.");
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<f:view renderKitId=\"PRIMEFACES_MOBILE\" />");
    _builder.newLine();
    _builder.append("<ui:include src=\"/mobile/index.xhtml\" />");
    _builder.newLine();
    return _builder.toString();
  }
}
