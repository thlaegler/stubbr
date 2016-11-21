package templates.common;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates._common.EclipseDotProjectTemplateBase;

/**
 * File template for Eclipse project file for common project.
 */
@SuppressWarnings("all")
public class EclipseDotProjectTemplate extends EclipseDotProjectTemplateBase {
  public EclipseDotProjectTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setDocumentation("Eclipse project file for common project");
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<name>");
    Project _project = this.getProject();
    String _name = _project.getName();
    _builder.append(_name, "");
    _builder.append("-common</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("<comment>");
    String _documentation = this.getDocumentation();
    _builder.append(_documentation, "");
    _builder.append("</comment>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<projects>");
    _builder.newLine();
    _builder.append("</projects>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<buildSpec>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<buildCommand>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<name>org.eclipse.xtext.ui.shared.xtextBuilder</name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<arguments>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</arguments>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</buildCommand>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<buildCommand>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<name>org.eclipse.wst.common.project.facet.core.builder</name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<arguments>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</arguments>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</buildCommand>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<buildCommand>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<name>org.eclipse.jdt.core.javabuilder</name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<arguments>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</arguments>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</buildCommand>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<buildCommand>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<name>org.eclipse.m2e.core.maven2Builder</name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<arguments>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</arguments>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</buildCommand>");
    _builder.newLine();
    _builder.append("</buildSpec>");
    _builder.newLine();
    _builder.append("<natures>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<nature>org.eclipse.wst.common.modulecore.ModuleCoreNature</nature>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<nature>org.eclipse.jdt.core.javanature</nature>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<nature>org.eclipse.m2e.core.maven2Nature</nature>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<nature>org.eclipse.wst.common.project.facet.core.nature</nature>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<nature>org.eclipse.xtext.ui.shared.xtextNature</nature>");
    _builder.newLine();
    _builder.append("</natures>");
    _builder.newLine();
    return _builder.toString();
  }
}
