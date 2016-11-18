package templates;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import templates.AbstractTemplate;

/**
 * Abstract super type for all SQL files.
 */
@SuppressWarnings("all")
public abstract class AbstractSqlTemplate extends AbstractTemplate {
  public AbstractSqlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.SQL);
  }
  
  protected String toSqlType(final String type) {
    return "varchar(255)";
  }
}
