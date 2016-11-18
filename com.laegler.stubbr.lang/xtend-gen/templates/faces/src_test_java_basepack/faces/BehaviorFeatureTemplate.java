package templates.faces.src_test_java_basepack.faces;

import com.laegler.stubbr.lang.genmodel.FileType;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.BehaviorAction;
import com.laegler.stubbr.lang.stubbrLang.Feature;
import com.laegler.stubbr.lang.stubbrLang.GivenStep;
import com.laegler.stubbr.lang.stubbrLang.Scenario;
import com.laegler.stubbr.lang.stubbrLang.Stakeholder;
import com.laegler.stubbr.lang.stubbrLang.ThenStep;
import com.laegler.stubbr.lang.stubbrLang.UiElement;
import com.laegler.stubbr.lang.stubbrLang.WhenStep;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractTemplate;

/**
 * File template for Cucumber feature definition.
 */
@SuppressWarnings("all")
public class BehaviorFeatureTemplate extends AbstractTemplate {
  private Feature feature;
  
  public BehaviorFeatureTemplate(final StubbrRegistry stubbr, final Project project, final Feature feature) {
    super(stubbr, project);
    this.feature = feature;
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
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# language: en");
    _builder.newLine();
    _builder.append("Feature: ");
    String _name = null;
    if (this.feature!=null) {
      _name=this.feature.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "");
    _builder.append(" - ");
    String _label = null;
    if (this.feature!=null) {
      _label=this.feature.getLabel();
    }
    String _replaceAll = null;
    if (_label!=null) {
      _replaceAll=_label.replaceAll("\"", "");
    }
    _builder.append(_replaceAll, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Scenario> _scenarios = null;
      if (this.feature!=null) {
        _scenarios=this.feature.getScenarios();
      }
      for(final Scenario scenario : _scenarios) {
        _builder.append("Scenario: ");
        String _name_1 = null;
        if (scenario!=null) {
          _name_1=scenario.getName();
        }
        String _firstUpper_1 = null;
        if (_name_1!=null) {
          _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
        }
        _builder.append(_firstUpper_1, "");
        _builder.append(" - ");
        String _label_1 = null;
        if (scenario!=null) {
          _label_1=scenario.getLabel();
        }
        String _replaceAll_1 = null;
        if (_label_1!=null) {
          _replaceAll_1=_label_1.replaceAll("\"", "");
        }
        _builder.append(_replaceAll_1, "");
        _builder.newLineIfNotEmpty();
        {
          EList<GivenStep> _givenSteps = scenario.getGivenSteps();
          for(final GivenStep step : _givenSteps) {
            _builder.append("\t");
            _builder.append("Given ");
            Stakeholder _actor = null;
            if (step!=null) {
              _actor=step.getActor();
            }
            String _name_2 = null;
            if (_actor!=null) {
              _name_2=_actor.getName();
            }
            _builder.append(_name_2, "\t");
            UiElement _actorElement = null;
            if (step!=null) {
              _actorElement=step.getActorElement();
            }
            String _name_3 = null;
            if (_actorElement!=null) {
              _name_3=_actorElement.getName();
            }
            _builder.append(_name_3, "\t");
            String _objectWildcard = null;
            if (step!=null) {
              _objectWildcard=step.getObjectWildcard();
            }
            String _replaceAll_2 = null;
            if (_objectWildcard!=null) {
              _replaceAll_2=_objectWildcard.replaceAll("\"", "");
            }
            _builder.append(_replaceAll_2, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<WhenStep> _whenSteps = scenario.getWhenSteps();
          for(final WhenStep step_1 : _whenSteps) {
            _builder.append("\t");
            _builder.append("When ");
            Stakeholder _actor_1 = null;
            if (step_1!=null) {
              _actor_1=step_1.getActor();
            }
            String _name_4 = null;
            if (_actor_1!=null) {
              _name_4=_actor_1.getName();
            }
            _builder.append(_name_4, "\t");
            UiElement _actorElement_1 = null;
            if (step_1!=null) {
              _actorElement_1=step_1.getActorElement();
            }
            String _name_5 = null;
            if (_actorElement_1!=null) {
              _name_5=_actorElement_1.getName();
            }
            _builder.append(_name_5, "\t");
            String _objectWildcard_1 = null;
            if (step_1!=null) {
              _objectWildcard_1=step_1.getObjectWildcard();
            }
            String _replaceAll_3 = null;
            if (_objectWildcard_1!=null) {
              _replaceAll_3=_objectWildcard_1.replaceAll("\"", "");
            }
            _builder.append(_replaceAll_3, "\t");
            _builder.append(" ");
            BehaviorAction _action = null;
            if (step_1!=null) {
              _action=step_1.getAction();
            }
            _builder.append(_action, "\t");
            _builder.append(" ");
            String _value = null;
            if (step_1!=null) {
              _value=step_1.getValue();
            }
            _builder.append(_value, "\t");
            _builder.append(" ");
            UiElement _subjectElement = null;
            if (step_1!=null) {
              _subjectElement=step_1.getSubjectElement();
            }
            String _name_6 = null;
            if (_subjectElement!=null) {
              _name_6=_subjectElement.getName();
            }
            _builder.append(_name_6, "\t");
            String _subjectWildcard = null;
            if (step_1!=null) {
              _subjectWildcard=step_1.getSubjectWildcard();
            }
            String _replaceAll_4 = null;
            if (_subjectWildcard!=null) {
              _replaceAll_4=_subjectWildcard.replaceAll("\"", "");
            }
            _builder.append(_replaceAll_4, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<ThenStep> _thenSteps = scenario.getThenSteps();
          for(final ThenStep step_2 : _thenSteps) {
            _builder.append("\t");
            _builder.append("Then ");
            Stakeholder _actor_2 = null;
            if (step_2!=null) {
              _actor_2=step_2.getActor();
            }
            String _name_7 = null;
            if (_actor_2!=null) {
              _name_7=_actor_2.getName();
            }
            _builder.append(_name_7, "\t");
            UiElement _actorElement_2 = null;
            if (step_2!=null) {
              _actorElement_2=step_2.getActorElement();
            }
            String _name_8 = null;
            if (_actorElement_2!=null) {
              _name_8=_actorElement_2.getName();
            }
            _builder.append(_name_8, "\t");
            String _objectWildcard_2 = null;
            if (step_2!=null) {
              _objectWildcard_2=step_2.getObjectWildcard();
            }
            String _replaceAll_5 = null;
            if (_objectWildcard_2!=null) {
              _replaceAll_5=_objectWildcard_2.replaceAll("\"", "");
            }
            _builder.append(_replaceAll_5, "\t");
            _builder.append(" should ");
            BehaviorAction _action_1 = null;
            if (step_2!=null) {
              _action_1=step_2.getAction();
            }
            _builder.append(_action_1, "\t");
            _builder.append(" ");
            String _value_1 = null;
            if (step_2!=null) {
              _value_1=step_2.getValue();
            }
            _builder.append(_value_1, "\t");
            _builder.append(" ");
            UiElement _subjectElement_1 = null;
            if (step_2!=null) {
              _subjectElement_1=step_2.getSubjectElement();
            }
            String _name_9 = null;
            if (_subjectElement_1!=null) {
              _name_9=_subjectElement_1.getName();
            }
            _builder.append(_name_9, "\t");
            String _subjectWildcard_1 = null;
            if (step_2!=null) {
              _subjectWildcard_1=step_2.getSubjectWildcard();
            }
            String _replaceAll_6 = null;
            if (_subjectWildcard_1!=null) {
              _replaceAll_6=_subjectWildcard_1.replaceAll("\"", "");
            }
            _builder.append(_replaceAll_6, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
}
