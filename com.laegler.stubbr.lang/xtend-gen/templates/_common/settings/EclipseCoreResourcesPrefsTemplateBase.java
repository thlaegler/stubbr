package templates._common.settings;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractTemplate;

/**
 * File template for Eclipse Core resources prefs.
 */
@SuppressWarnings("all")
public class EclipseCoreResourcesPrefsTemplateBase extends AbstractTemplate {
  public EclipseCoreResourcesPrefsTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.ECLIPSE_PREFS);
    this.setFileName("org.eclipse.core.resources");
    this.setRelativPath("/.settings/");
    this.setDocumentation("Eclipse Core resources prefs");
    this.setSkipStamping(true);
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eclipse.preferences.version=1");
    _builder.newLine();
    _builder.append("encoding//src/main/java=UTF-8");
    _builder.newLine();
    _builder.append("encoding//src-gen/main/java=UTF-8");
    _builder.newLine();
    _builder.append("encoding//src/main/xtend-gen=UTF-8");
    _builder.newLine();
    _builder.append("encoding//src/main/resources=UTF-8");
    _builder.newLine();
    _builder.append("encoding//src/test/java=UTF-8");
    _builder.newLine();
    _builder.append("encoding//src-gen/test/java=UTF-8");
    _builder.newLine();
    _builder.append("encoding//src/test/xtend-gen=UTF-8");
    _builder.newLine();
    _builder.append("encoding//src/test/resources=UTF-8");
    _builder.newLine();
    _builder.append("encoding/<project>=UTF-8");
    _builder.newLine();
    return _builder.toString();
  }
}
