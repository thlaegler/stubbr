package templates._common.settings;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractTemplate;

/**
 * File template for Eclipse Maven m2e prefs.
 */
@SuppressWarnings("all")
public class EclipseM2eCorePrefsTemplateBase extends AbstractTemplate {
  public EclipseM2eCorePrefsTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.ECLIPSE_PREFS);
    this.setFileName("org.eclipse.m2e.core");
    this.setRelativPath("/.settings/");
    this.setDocumentation("Eclipse Maven m2e prefs");
    this.setSkipStamping(true);
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("activeProfiles=");
    _builder.newLine();
    _builder.append("eclipse.preferences.version=1");
    _builder.newLine();
    _builder.append("resolveWorkspaceProjects=true");
    _builder.newLine();
    _builder.append("version=1");
    _builder.newLine();
    return _builder.toString();
  }
}
