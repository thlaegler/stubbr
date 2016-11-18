package templates;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import templates.AbstractTemplate;

/**
 * Abstract super type for all XML files.
 */
@SuppressWarnings("all")
public abstract class AbstractXmlTemplate extends AbstractTemplate {
  public AbstractXmlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.XML);
  }
}
