package templates.ear.settings;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXmlTemplate;

/**
 * File template for Eclipse WST project facet prefs xml (org.eclipse.wst.common.project.facet.core.xml).
 */
@SuppressWarnings("all")
public class EclipseWstProjectFacetCoreXmlTemplate extends AbstractXmlTemplate {
  public EclipseWstProjectFacetCoreXmlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("org.eclipse.wst.common.project.facet.core");
    this.setRelativPath("/.settings/");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<faceted-project>");
    _builder.newLine();
    this.setHeader(_builder.toString());
    this.setFooter("</faceted-project>");
    this.setDocumentation("Eclipse WST project facet prefs xml");
    this.setSkipStamping(true);
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<installed facet=\"jboss.m2\" version=\"1.0\"/>");
    _builder.newLine();
    _builder.append("<installed facet=\"java\" version=\"1.8\"/>");
    _builder.newLine();
    _builder.append("<installed facet=\"jst.cdi\" version=\"1.2\"/>");
    _builder.newLine();
    _builder.append("<installed facet=\"jst.web\" version=\"3.0\"/>");
    _builder.newLine();
    return _builder.toString();
  }
}
