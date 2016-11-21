package templates._common.src_main_resource.meta_inf;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractTemplate;

/**
 * File Generator for OSGi Manifest descriptor (MANIFEST.MF)
 */
@SuppressWarnings("all")
public class ManifestMfTemplateBase extends AbstractTemplate {
  public ManifestMfTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.MANIFEST);
    this.setFileName("MANIFEST");
    this.setRelativPath("/src/main/resources/META-INF/");
    this.setDocumentation("OSGi Manifest descriptor");
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Manifest-Version: 1.0");
    _builder.newLine();
    _builder.append("Class-Path: ");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
