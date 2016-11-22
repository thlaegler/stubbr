package templates._common.settings;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.ChapterEnvironment;
import com.laegler.stubbr.lang.stubbrLang.JvmEnum;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXmlTemplate;

/**
 * File template for Eclipse WST project facet prefs xml (org.eclipse.wst.common.project.facet.core.xml).
 */
@SuppressWarnings("all")
public class EclipseWstProjectFacetCoreXmlTemplateBase extends AbstractXmlTemplate {
  public EclipseWstProjectFacetCoreXmlTemplateBase(final StubbrRegistry stubbr, final Project project) {
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
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<fixed facet=\"wst.jsdt.web\"/>");
    _builder.newLine();
    _builder.append("<!-- <runtime name=\"WildFly 10.x Runtime\"/> -->");
    _builder.newLine();
    _builder.append("<installed facet=\"jboss.m2\" version=\"1.0\"/>");
    _builder.newLine();
    _builder.append("<installed facet=\"wst.jsdt.web\" version=\"1.0\"/>");
    _builder.newLine();
    _builder.append("<installed facet=\"java\" version=\"");
    StubbrRegistry _stubbr = this.getStubbr();
    Stubb _stubb = null;
    if (_stubbr!=null) {
      _stubb=_stubbr.getStubb();
    }
    ChapterEnvironment _environment = null;
    if (_stubb!=null) {
      _environment=_stubb.getEnvironment();
    }
    com.laegler.stubbr.lang.stubbrLang.Runtime _runtime = null;
    if (_environment!=null) {
      _runtime=_environment.getRuntime();
    }
    JvmEnum _jvm = null;
    if (_runtime!=null) {
      _jvm=_runtime.getJvm();
    }
    String _literal = _jvm.getLiteral();
    _builder.append(_literal, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<installed facet=\"jst.cdi\" version=\"1.2\"/>");
    _builder.newLine();
    _builder.append("<installed facet=\"jst.web\" version=\"3.0\"/>");
    _builder.newLine();
    _builder.append("<installed facet=\"jbossws.core\" version=\"3.0\"/>");
    _builder.newLine();
    _builder.append("<installed facet=\"jst.jaxrs\" version=\"1.1\"/>");
    _builder.newLine();
    _builder.append("<!-- <installed facet=\"jpt.jpa\" version=\"2.1\"/> -->");
    _builder.newLine();
    _builder.append("<!-- <installed facet=\"jst.ejb\" version=\"3.1\"/> -->");
    _builder.newLine();
    return _builder.toString();
  }
}
