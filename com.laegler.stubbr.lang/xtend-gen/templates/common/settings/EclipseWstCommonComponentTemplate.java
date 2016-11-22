package templates.common.settings;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractTemplate;

/**
 * File template for Eclipse settings WST common component (org.eclipse.wst.common.component).
 */
@SuppressWarnings("all")
public class EclipseWstCommonComponentTemplate extends AbstractTemplate {
  public EclipseWstCommonComponentTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("org.eclipse.wst.common");
    this.setFileType(FileType.ECLIPSE_COMPONENT);
    this.setRelativPath("/.settings/");
    this.setDocumentation("Eclipse settings for WST common component.");
    this.setSkipStamping(true);
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><project-modules id=\"moduleCoreId\"/>");
    return _builder.toString();
  }
}
