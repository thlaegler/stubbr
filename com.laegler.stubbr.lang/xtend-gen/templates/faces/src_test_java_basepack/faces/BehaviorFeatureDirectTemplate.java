package templates.faces.src_test_java_basepack.faces;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Feature;
import com.laegler.stubbr.lang.stubbrLang.Scenario;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractTemplate;

/**
 * File template for Cucumber feature definition.
 */
@SuppressWarnings("all")
public class BehaviorFeatureDirectTemplate extends AbstractTemplate {
  private String content;
  
  public BehaviorFeatureDirectTemplate(final StubbrRegistry stubbr, final Project project, final Feature feature, final String content) {
    super(stubbr, project);
    this.content = content;
    this.setFileType(FileType.FEATURE);
    StringConcatenation _builder = new StringConcatenation();
    String _name = null;
    if (feature!=null) {
      _name=feature.getName();
    }
    String _lowerCase = null;
    if (_name!=null) {
      _lowerCase=_name.toLowerCase();
    }
    String _replaceAll = _lowerCase.replaceAll(" ", "");
    _builder.append(_replaceAll, "");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("/src/test/java/");
    String _basePackage = null;
    if (project!=null) {
      _basePackage=project.getBasePackage();
    }
    String _path = null;
    if (_basePackage!=null) {
      _path=this.toPath(_basePackage);
    }
    _builder_1.append(_path, "");
    _builder_1.append("/feature/");
    String _name_1 = null;
    if (feature!=null) {
      _name_1=feature.getName();
    }
    String _replaceAll_1 = null;
    if (_name_1!=null) {
      _replaceAll_1=_name_1.replaceAll(" ", "");
    }
    String _replaceAll_2 = _replaceAll_1.replaceAll("\"", "");
    String _lowerCase_1 = _replaceAll_2.toLowerCase();
    _builder_1.append(_lowerCase_1, "");
    _builder_1.append("/");
    this.setRelativPath(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("The Cucumber feature definition for ");
    String _name_2 = null;
    if (feature!=null) {
      _name_2=feature.getName();
    }
    String _firstUpper = null;
    if (_name_2!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name_2);
    }
    _builder_2.append(_firstUpper, "");
    _builder_2.append(" ");
    String _label = null;
    if (feature!=null) {
      _label=feature.getLabel();
    }
    String _replaceAll_3 = null;
    if (_label!=null) {
      _replaceAll_3=_label.replaceAll("\"", "");
    }
    _builder_2.append(_replaceAll_3, "");
    _builder_2.newLineIfNotEmpty();
    _builder_2.newLine();
    _builder_2.append("Scenarios:");
    _builder_2.newLine();
    _builder_2.append("<ul>");
    _builder_2.newLine();
    {
      EList<Scenario> _scenarios = null;
      if (feature!=null) {
        _scenarios=feature.getScenarios();
      }
      for(final Scenario scenario : _scenarios) {
        _builder_2.append("<li>");
        String _name_3 = null;
        if (scenario!=null) {
          _name_3=scenario.getName();
        }
        String _firstUpper_1 = null;
        if (_name_3!=null) {
          _firstUpper_1=StringExtensions.toFirstUpper(_name_3);
        }
        _builder_2.append(_firstUpper_1, "");
        _builder_2.append(" - ");
        String _label_1 = null;
        if (scenario!=null) {
          _label_1=scenario.getLabel();
        }
        String _replaceAll_4 = null;
        if (_label_1!=null) {
          _replaceAll_4=_label_1.replaceAll("\"", "");
        }
        _builder_2.append(_replaceAll_4, "");
        _builder_2.append("</li>");
        _builder_2.newLineIfNotEmpty();
      }
    }
    _builder_2.append("</ul>");
    _builder_2.newLine();
    this.setDocumentation(_builder_2.toString());
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.content, "");
    return _builder.toString();
  }
}
