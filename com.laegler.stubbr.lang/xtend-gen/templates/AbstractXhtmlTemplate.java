package templates;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import templates.AbstractTemplate;

/**
 * Abstract super type for all XHTML files.
 */
@SuppressWarnings("all")
public abstract class AbstractXhtmlTemplate extends AbstractTemplate {
  public AbstractXhtmlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.XHTML);
  }
}
