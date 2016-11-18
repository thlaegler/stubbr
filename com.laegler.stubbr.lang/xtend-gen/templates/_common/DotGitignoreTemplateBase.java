package templates._common;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractTemplate;

/**
 * File template for git ignore file
 */
@SuppressWarnings("all")
public class DotGitignoreTemplateBase extends AbstractTemplate {
  public DotGitignoreTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.GITIGNORE);
    this.setFileName("");
    this.setRelativPath("/");
    this.setDocumentation("Git ignore file");
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Compiled source #");
    _builder.newLine();
    _builder.append("###################");
    _builder.newLine();
    _builder.append("*.com");
    _builder.newLine();
    _builder.append("*.class");
    _builder.newLine();
    _builder.append("*.dll");
    _builder.newLine();
    _builder.append("*.exe");
    _builder.newLine();
    _builder.append("*.o");
    _builder.newLine();
    _builder.append("*.so");
    _builder.newLine();
    _builder.append("*.xtendbin");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Packages #");
    _builder.newLine();
    _builder.append("############");
    _builder.newLine();
    _builder.append("# it\'s better to unpack these files and commit the raw source");
    _builder.newLine();
    _builder.append("# git has its own built in compression methods");
    _builder.newLine();
    _builder.append("*.7z");
    _builder.newLine();
    _builder.append("*.dmg");
    _builder.newLine();
    _builder.append("*.gz");
    _builder.newLine();
    _builder.append("*.iso");
    _builder.newLine();
    _builder.append("*.jar");
    _builder.newLine();
    _builder.append("*.war");
    _builder.newLine();
    _builder.append("*.ear");
    _builder.newLine();
    _builder.append("*.rar");
    _builder.newLine();
    _builder.append("*.tar");
    _builder.newLine();
    _builder.append("*.zip");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Logs and databases #");
    _builder.newLine();
    _builder.append("######################");
    _builder.newLine();
    _builder.append("*.log");
    _builder.newLine();
    _builder.append("# *.sql");
    _builder.newLine();
    _builder.append("*.sqlite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# OS generated files #");
    _builder.newLine();
    _builder.append("######################");
    _builder.newLine();
    _builder.append(".DS_Store");
    _builder.newLine();
    _builder.append(".DS_Store?");
    _builder.newLine();
    _builder.append("._*");
    _builder.newLine();
    _builder.append(".Spotlight-V100");
    _builder.newLine();
    _builder.append(".Trashes");
    _builder.newLine();
    _builder.append("ehthumbs.db");
    _builder.newLine();
    _builder.append("Thumbs.db");
    _builder.newLine();
    _builder.append(".*~");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Folder");
    _builder.newLine();
    _builder.append("bin/");
    _builder.newLine();
    _builder.append("target/");
    _builder.newLine();
    return _builder.toString();
  }
}
