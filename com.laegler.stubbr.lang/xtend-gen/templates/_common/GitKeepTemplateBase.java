package templates._common;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import templates.AbstractTemplate;

@SuppressWarnings("all")
public class GitKeepTemplateBase extends AbstractTemplate {
  public GitKeepTemplateBase(final StubbrRegistry stubbr, final Project project, final String directory) {
    super(stubbr, project);
    this.setFileType(FileType.GITKEEP);
    this.setFileName("");
    this.setRelativPath(directory);
    this.setDocumentation("Git keep source directories");
    this.setSkipStamping(true);
    this.setContent("");
  }
}
