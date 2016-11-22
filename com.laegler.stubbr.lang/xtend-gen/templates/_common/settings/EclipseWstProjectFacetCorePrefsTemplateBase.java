package templates._common.settings;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractTemplate;

/**
 * File template for Eclipse WST project facet prefs (org.eclipse.wst.common.project.facet.core.prefs)
 */
@SuppressWarnings("all")
public class EclipseWstProjectFacetCorePrefsTemplateBase extends AbstractTemplate {
  public EclipseWstProjectFacetCorePrefsTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.ECLIPSE_PREFS);
    this.setFileName("org.eclipse.wst.common.project.facet.core");
    this.setRelativPath("/.settings/");
    this.setHeader("<root>");
    this.setFooter("</root>");
    this.setDocumentation("Eclipse WST project facet prefs");
    this.setSkipStamping(true);
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<facet id=\"jst.jaxrs\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<node name=\"libprov\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<attribute name=\"provider-id\" value=\"runtime-library-provider\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</node>");
    _builder.newLine();
    _builder.append("</facet>");
    _builder.newLine();
    return _builder.toString();
  }
}
