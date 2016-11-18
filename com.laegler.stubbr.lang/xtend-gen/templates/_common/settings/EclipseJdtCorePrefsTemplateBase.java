package templates._common.settings;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.ChapterEnvironment;
import com.laegler.stubbr.lang.stubbrLang.JvmEnum;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractTemplate;

/**
 * File template for Eclipse JDT prefs.
 */
@SuppressWarnings("all")
public class EclipseJdtCorePrefsTemplateBase extends AbstractTemplate {
  public EclipseJdtCorePrefsTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileType(FileType.ECLIPSE_PREFS);
    this.setFileName("org.eclipse.jdt.core");
    this.setRelativPath("/.settings/");
    this.setDocumentation("Eclipse JDT prefs");
    this.setSkipStamping(true);
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eclipse.preferences.version=1");
    _builder.newLine();
    _builder.append("org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled");
    _builder.newLine();
    _builder.append("org.eclipse.jdt.core.compiler.codegen.targetPlatform=");
    StubbrRegistry _stubbr = this.getStubbr();
    Stubb _stubb = null;
    if (_stubbr!=null) {
      _stubb=_stubbr.getStubb();
    }
    ChapterEnvironment _environment = null;
    if (_stubb!=null) {
      _environment=_stubb.getEnvironment();
    }
    com.laegler.stubbr.lang.stubbrLang.Runtime _runtime = null;
    if (_environment!=null) {
      _runtime=_environment.getRuntime();
    }
    JvmEnum _jvm = null;
    if (_runtime!=null) {
      _jvm=_runtime.getJvm();
    }
    String _literal = _jvm.getLiteral();
    _builder.append(_literal, "");
    _builder.newLineIfNotEmpty();
    _builder.append("org.eclipse.jdt.core.compiler.compliance=");
    StubbrRegistry _stubbr_1 = this.getStubbr();
    Stubb _stubb_1 = null;
    if (_stubbr_1!=null) {
      _stubb_1=_stubbr_1.getStubb();
    }
    ChapterEnvironment _environment_1 = null;
    if (_stubb_1!=null) {
      _environment_1=_stubb_1.getEnvironment();
    }
    com.laegler.stubbr.lang.stubbrLang.Runtime _runtime_1 = null;
    if (_environment_1!=null) {
      _runtime_1=_environment_1.getRuntime();
    }
    JvmEnum _jvm_1 = null;
    if (_runtime_1!=null) {
      _jvm_1=_runtime_1.getJvm();
    }
    String _literal_1 = _jvm_1.getLiteral();
    _builder.append(_literal_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("org.eclipse.jdt.core.compiler.problem.assertIdentifier=error");
    _builder.newLine();
    _builder.append("org.eclipse.jdt.core.compiler.problem.enumIdentifier=error");
    _builder.newLine();
    _builder.append("org.eclipse.jdt.core.compiler.problem.forbiddenReference=warning");
    _builder.newLine();
    _builder.append("org.eclipse.jdt.core.compiler.source=");
    StubbrRegistry _stubbr_2 = this.getStubbr();
    Stubb _stubb_2 = null;
    if (_stubbr_2!=null) {
      _stubb_2=_stubbr_2.getStubb();
    }
    ChapterEnvironment _environment_2 = null;
    if (_stubb_2!=null) {
      _environment_2=_stubb_2.getEnvironment();
    }
    com.laegler.stubbr.lang.stubbrLang.Runtime _runtime_2 = null;
    if (_environment_2!=null) {
      _runtime_2=_environment_2.getRuntime();
    }
    JvmEnum _jvm_2 = null;
    if (_runtime_2!=null) {
      _jvm_2=_runtime_2.getJvm();
    }
    String _literal_2 = _jvm_2.getLiteral();
    _builder.append(_literal_2, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
