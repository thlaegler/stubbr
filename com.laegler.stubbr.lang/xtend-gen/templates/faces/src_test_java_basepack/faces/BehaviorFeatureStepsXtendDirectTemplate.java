package templates.faces.src_test_java_basepack.faces;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Feature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for Cucumber feature steps (glue).
 */
@SuppressWarnings("all")
public class BehaviorFeatureStepsXtendDirectTemplate extends AbstractXtendTemplate {
  private String content;
  
  public BehaviorFeatureStepsXtendDirectTemplate(final StubbrRegistry stubbr, final Project project, final Feature feature, final String content) {
    super(stubbr, project);
    this.content = content;
    StringConcatenation _builder = new StringConcatenation();
    String _name = null;
    if (feature!=null) {
      _name=feature.getName();
    }
    String _replaceAll = null;
    if (_name!=null) {
      _replaceAll=_name.replaceAll(" ", "");
    }
    String _firstUpper = StringExtensions.toFirstUpper(_replaceAll);
    _builder.append(_firstUpper, "");
    _builder.append("StepDefinitions");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = null;
    if (project!=null) {
      _basePackage=project.getBasePackage();
    }
    _builder_1.append(_basePackage, "");
    _builder_1.append(".feature.");
    String _name_1 = null;
    if (feature!=null) {
      _name_1=feature.getName();
    }
    String _replaceAll_1 = null;
    if (_name_1!=null) {
      _replaceAll_1=_name_1.replaceAll(" ", "");
    }
    String _replaceAll_2 = _replaceAll_1.replaceAll("\"", "");
    String _lowerCase = _replaceAll_2.toLowerCase();
    _builder_1.append(_lowerCase, "");
    this.setHeader(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("/src/test/java/");
    String _basePackage_1 = null;
    if (project!=null) {
      _basePackage_1=project.getBasePackage();
    }
    String _path = null;
    if (_basePackage_1!=null) {
      _path=this.toPath(_basePackage_1);
    }
    _builder_2.append(_path, "");
    _builder_2.append("/feature/");
    String _name_2 = null;
    if (feature!=null) {
      _name_2=feature.getName();
    }
    String _replaceAll_3 = null;
    if (_name_2!=null) {
      _replaceAll_3=_name_2.replaceAll(" ", "");
    }
    String _replaceAll_4 = _replaceAll_3.replaceAll("\"", "");
    String _lowerCase_1 = _replaceAll_4.toLowerCase();
    _builder_2.append(_lowerCase_1, "");
    _builder_2.append("/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("Cucumber feature step definitions (glue) for ");
    String _name_3 = null;
    if (feature!=null) {
      _name_3=feature.getName();
    }
    String _firstUpper_1 = null;
    if (_name_3!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_3);
    }
    _builder_3.append(_firstUpper_1, "");
    _builder_3.append(" - ");
    String _label = null;
    if (feature!=null) {
      _label=feature.getLabel();
    }
    String _replaceAll_5 = null;
    if (_label!=null) {
      _replaceAll_5=_label.replaceAll("\"", "");
    }
    _builder_3.append(_replaceAll_5, "");
    this.setDocumentation(_builder_3.toString());
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.content, "");
    return _builder.toString();
  }
}
