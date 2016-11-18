package templates.faces.src_test_java_basepack.faces;

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
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for Cucumber feature steps (glue).
 */
@SuppressWarnings("all")
public class BehaviorFeatureStepsXtendTemplate extends AbstractXtendTemplate {
  private Feature feature;
  
  private List<String> stepMethods = new ArrayList<String>();
  
  public BehaviorFeatureStepsXtendTemplate(final StubbrRegistry stubbr, final Project project, final Feature feature) {
    super(stubbr, project);
    this.feature = feature;
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
    String _lowerCase = _replaceAll_2.toLowerCase();
    _builder_1.append(_lowerCase, "");
    _builder_1.append("/");
    this.setRelativPath(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("Cucumber feature step definitions (glue) for ");
    String _name_2 = null;
    if (feature!=null) {
      _name_2=feature.getName();
    }
    String _firstUpper_1 = null;
    if (_name_2!=null) {
      _firstUpper_1=StringExtensions.toFirstUpper(_name_2);
    }
    _builder_2.append(_firstUpper_1, "");
    _builder_2.append(" - ");
    String _label = null;
    if (feature!=null) {
      _label=feature.getLabel();
    }
    String _replaceAll_3 = null;
    if (_label!=null) {
      _replaceAll_3=_label.replaceAll("\"", "");
    }
    _builder_2.append(_replaceAll_3, "");
    this.setDocumentation(_builder_2.toString());
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    Project _project = this.getProject();
    String _basePackage = null;
    if (_project!=null) {
      _basePackage=_project.getBasePackage();
    }
    _builder.append(_basePackage, "");
    _builder.append(".feature.");
    String _name = null;
    if (this.feature!=null) {
      _name=this.feature.getName();
    }
    String _replaceAll = null;
    if (_name!=null) {
      _replaceAll=_name.replaceAll(" ", "");
    }
    String _replaceAll_1 = _replaceAll.replaceAll("\"", "");
    String _lowerCase = _replaceAll_1.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    Project _project_1 = this.getProject();
    String _basePackage_1 = null;
    if (_project_1!=null) {
      _basePackage_1=_project_1.getBasePackage();
    }
    _builder.append(_basePackage_1, "");
    _builder.append(".*");
    _builder.newLineIfNotEmpty();
    _builder.append("import com.google.gson.annotations.Until");
    _builder.newLine();
    _builder.append("import javax.annotation.Generated");
    _builder.newLine();
    _builder.append("import javax.annotation.PostConstruct");
    _builder.newLine();
    _builder.append("import javax.annotation.security.PermitAll");
    _builder.newLine();
    _builder.append("import javax.inject.Inject");
    _builder.newLine();
    _builder.append("import org.slf4j.Logger");
    _builder.newLine();
    _builder.append("import cucumber.api.java.en.Given");
    _builder.newLine();
    _builder.append("import cucumber.api.java.en.Then");
    _builder.newLine();
    _builder.append("import cucumber.api.java.en.When");
    _builder.newLine();
    _builder.append("import cucumber.api.PendingException");
    _builder.newLine();
    _builder.newLine();
    String _javaDocType = this.getJavaDocType();
    _builder.append(_javaDocType, "");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject Logger log");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Scenario> _scenarios = null;
      if (this.feature!=null) {
        _scenarios=this.feature.getScenarios();
      }
      for(final Scenario scenario : _scenarios) {
        {
          EList<GivenStep> _givenSteps = null;
          if (scenario!=null) {
            _givenSteps=scenario.getGivenSteps();
          }
          for(final GivenStep given : _givenSteps) {
            _builder.append("\t");
            String _methodName = null;
            if (given!=null) {
              _methodName=this.toMethodName(given);
            }
            String _replaceAll_2 = _methodName.replaceAll(" ", "");
            final String stepMethodName = _replaceAll_2.replaceAll("\"", "");
            _builder.newLineIfNotEmpty();
            {
              boolean _contains = this.stepMethods.contains(stepMethodName);
              boolean _not = (!_contains);
              if (_not) {
                _builder.append("\t");
                String _annotation = null;
                if (given!=null) {
                  _annotation=this.toAnnotation(given);
                }
                _builder.append(_annotation, "\t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                Stakeholder _actor = null;
                if (given!=null) {
                  _actor=given.getActor();
                }
                String _name_1 = null;
                if (_actor!=null) {
                  _name_1=_actor.getName();
                }
                String _method = this.toMethod(stepMethodName, _name_1);
                _builder.append(_method, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.newLine();
          }
        }
        {
          EList<WhenStep> _whenSteps = null;
          if (scenario!=null) {
            _whenSteps=scenario.getWhenSteps();
          }
          for(final WhenStep when : _whenSteps) {
            _builder.append("\t");
            String _methodName_1 = null;
            if (when!=null) {
              _methodName_1=this.toMethodName(when);
            }
            String _replaceAll_3 = _methodName_1.replaceAll(" ", "");
            final String stepMethodName_1 = _replaceAll_3.replaceAll("\"", "");
            _builder.newLineIfNotEmpty();
            {
              boolean _contains_1 = this.stepMethods.contains(stepMethodName_1);
              boolean _not_1 = (!_contains_1);
              if (_not_1) {
                _builder.append("\t");
                String _annotation_1 = null;
                if (when!=null) {
                  _annotation_1=this.toAnnotation(when);
                }
                _builder.append(_annotation_1, "\t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                Stakeholder _actor_1 = null;
                if (when!=null) {
                  _actor_1=when.getActor();
                }
                String _name_2 = null;
                if (_actor_1!=null) {
                  _name_2=_actor_1.getName();
                }
                String _method_1 = this.toMethod(stepMethodName_1, _name_2);
                _builder.append(_method_1, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.newLine();
          }
        }
        {
          EList<ThenStep> _thenSteps = null;
          if (scenario!=null) {
            _thenSteps=scenario.getThenSteps();
          }
          for(final ThenStep then : _thenSteps) {
            _builder.append("\t");
            String _methodName_2 = null;
            if (then!=null) {
              _methodName_2=this.toMethodName(then);
            }
            String _replaceAll_4 = _methodName_2.replaceAll(" ", "");
            final String stepMethodName_2 = _replaceAll_4.replaceAll("\"", "");
            _builder.newLineIfNotEmpty();
            {
              boolean _contains_2 = this.stepMethods.contains(stepMethodName_2);
              boolean _not_2 = (!_contains_2);
              if (_not_2) {
                _builder.append("\t");
                String _annotation_2 = null;
                if (then!=null) {
                  _annotation_2=this.toAnnotation(then);
                }
                _builder.append(_annotation_2, "\t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                Stakeholder _actor_2 = null;
                if (then!=null) {
                  _actor_2=then.getActor();
                }
                String _name_3 = null;
                if (_actor_2!=null) {
                  _name_3=_actor_2.getName();
                }
                String _method_2 = this.toMethod(stepMethodName_2, _name_3);
                _builder.append(_method_2, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String toMethod(final String stepMethodName, final String actor) {
    this.stepMethods.add(stepMethodName);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public def void ");
    _builder.append(stepMethodName, "");
    _builder.append("() throws Throwable {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// TODO ");
    _builder.append(actor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("throw new PendingException");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String toMethodName(final GivenStep step) {
    StringConcatenation _builder = new StringConcatenation();
    Stakeholder _actor = null;
    if (step!=null) {
      _actor=step.getActor();
    }
    String _name = null;
    if (_actor!=null) {
      _name=_actor.getName();
    }
    _builder.append(_name, "");
    UiElement _actorElement = null;
    if (step!=null) {
      _actorElement=step.getActorElement();
    }
    String _name_1 = null;
    if (_actorElement!=null) {
      _name_1=_actorElement.getName();
    }
    _builder.append(_name_1, "");
    String _objectWildcard = null;
    if (step!=null) {
      _objectWildcard=step.getObjectWildcard();
    }
    _builder.append(_objectWildcard, "");
    String name = _builder.toString();
    return this.toMethodName(name);
  }
  
  private String toMethodName(final WhenStep step) {
    StringConcatenation _builder = new StringConcatenation();
    Stakeholder _actor = null;
    if (step!=null) {
      _actor=step.getActor();
    }
    String _name = null;
    if (_actor!=null) {
      _name=_actor.getName();
    }
    _builder.append(_name, "");
    UiElement _actorElement = null;
    if (step!=null) {
      _actorElement=step.getActorElement();
    }
    String _name_1 = null;
    if (_actorElement!=null) {
      _name_1=_actorElement.getName();
    }
    _builder.append(_name_1, "");
    String _objectWildcard = null;
    if (step!=null) {
      _objectWildcard=step.getObjectWildcard();
    }
    _builder.append(_objectWildcard, "");
    _builder.append("_");
    BehaviorAction _action = null;
    if (step!=null) {
      _action=step.getAction();
    }
    _builder.append(_action, "");
    _builder.append(" ");
    String _value = null;
    if (step!=null) {
      _value=step.getValue();
    }
    _builder.append(_value, "");
    _builder.append("_");
    UiElement _subjectElement = null;
    if (step!=null) {
      _subjectElement=step.getSubjectElement();
    }
    String _name_2 = null;
    if (_subjectElement!=null) {
      _name_2=_subjectElement.getName();
    }
    _builder.append(_name_2, "");
    String _subjectWildcard = null;
    if (step!=null) {
      _subjectWildcard=step.getSubjectWildcard();
    }
    _builder.append(_subjectWildcard, "");
    String name = _builder.toString();
    return this.toMethodName(name);
  }
  
  private String toMethodName(final ThenStep step) {
    StringConcatenation _builder = new StringConcatenation();
    Stakeholder _actor = null;
    if (step!=null) {
      _actor=step.getActor();
    }
    String _name = null;
    if (_actor!=null) {
      _name=_actor.getName();
    }
    _builder.append(_name, "");
    UiElement _actorElement = null;
    if (step!=null) {
      _actorElement=step.getActorElement();
    }
    String _name_1 = null;
    if (_actorElement!=null) {
      _name_1=_actorElement.getName();
    }
    _builder.append(_name_1, "");
    String _objectWildcard = null;
    if (step!=null) {
      _objectWildcard=step.getObjectWildcard();
    }
    _builder.append(_objectWildcard, "");
    _builder.append("_should_");
    BehaviorAction _action = null;
    if (step!=null) {
      _action=step.getAction();
    }
    _builder.append(_action, "");
    _builder.append(" ");
    String _value = null;
    if (step!=null) {
      _value=step.getValue();
    }
    _builder.append(_value, "");
    _builder.append("_");
    UiElement _subjectElement = null;
    if (step!=null) {
      _subjectElement=step.getSubjectElement();
    }
    String _name_2 = null;
    if (_subjectElement!=null) {
      _name_2=_subjectElement.getName();
    }
    _builder.append(_name_2, "");
    String _subjectWildcard = null;
    if (step!=null) {
      _subjectWildcard=step.getSubjectWildcard();
    }
    _builder.append(_subjectWildcard, "");
    String name = _builder.toString();
    return this.toMethodName(name);
  }
  
  private String toMethodName(final String methodName) {
    String _replaceAll = methodName.replaceAll(" ", "");
    String _replaceAll_1 = _replaceAll.replaceAll("\"", "");
    return StringExtensions.toFirstLower(_replaceAll_1);
  }
  
  private String toAnnotation(final GivenStep step) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Given(\"^");
    Stakeholder _actor = null;
    if (step!=null) {
      _actor=step.getActor();
    }
    String _name = null;
    if (_actor!=null) {
      _name=_actor.getName();
    }
    _builder.append(_name, "");
    UiElement _actorElement = null;
    if (step!=null) {
      _actorElement=step.getActorElement();
    }
    String _name_1 = null;
    if (_actorElement!=null) {
      _name_1=_actorElement.getName();
    }
    _builder.append(_name_1, "");
    String _objectWildcard = null;
    if (step!=null) {
      _objectWildcard=step.getObjectWildcard();
    }
    String _replaceAll = null;
    if (_objectWildcard!=null) {
      _replaceAll=_objectWildcard.replaceAll("\"", "");
    }
    _builder.append(_replaceAll, "");
    _builder.append("$\")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  private String toAnnotation(final WhenStep step) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@When(\"^");
    Stakeholder _actor = null;
    if (step!=null) {
      _actor=step.getActor();
    }
    String _name = null;
    if (_actor!=null) {
      _name=_actor.getName();
    }
    _builder.append(_name, "");
    UiElement _actorElement = null;
    if (step!=null) {
      _actorElement=step.getActorElement();
    }
    String _name_1 = null;
    if (_actorElement!=null) {
      _name_1=_actorElement.getName();
    }
    _builder.append(_name_1, "");
    String _objectWildcard = null;
    if (step!=null) {
      _objectWildcard=step.getObjectWildcard();
    }
    String _replaceAll = null;
    if (_objectWildcard!=null) {
      _replaceAll=_objectWildcard.replaceAll("\"", "");
    }
    _builder.append(_replaceAll, "");
    _builder.append(" ");
    BehaviorAction _action = null;
    if (step!=null) {
      _action=step.getAction();
    }
    _builder.append(_action, "");
    _builder.append(" ");
    String _value = null;
    if (step!=null) {
      _value=step.getValue();
    }
    String _replaceAll_1 = null;
    if (_value!=null) {
      _replaceAll_1=_value.replaceAll("\"", "");
    }
    _builder.append(_replaceAll_1, "");
    _builder.append(" ");
    UiElement _subjectElement = null;
    if (step!=null) {
      _subjectElement=step.getSubjectElement();
    }
    String _name_2 = null;
    if (_subjectElement!=null) {
      _name_2=_subjectElement.getName();
    }
    _builder.append(_name_2, "");
    String _subjectWildcard = null;
    if (step!=null) {
      _subjectWildcard=step.getSubjectWildcard();
    }
    String _replaceAll_2 = null;
    if (_subjectWildcard!=null) {
      _replaceAll_2=_subjectWildcard.replaceAll("\"", "");
    }
    _builder.append(_replaceAll_2, "");
    _builder.append("$\")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  private String toAnnotation(final ThenStep step) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Then(\"^");
    Stakeholder _actor = null;
    if (step!=null) {
      _actor=step.getActor();
    }
    String _name = null;
    if (_actor!=null) {
      _name=_actor.getName();
    }
    _builder.append(_name, "");
    UiElement _actorElement = null;
    if (step!=null) {
      _actorElement=step.getActorElement();
    }
    String _name_1 = null;
    if (_actorElement!=null) {
      _name_1=_actorElement.getName();
    }
    _builder.append(_name_1, "");
    String _objectWildcard = null;
    if (step!=null) {
      _objectWildcard=step.getObjectWildcard();
    }
    String _replaceAll = null;
    if (_objectWildcard!=null) {
      _replaceAll=_objectWildcard.replaceAll("\"", "");
    }
    _builder.append(_replaceAll, "");
    _builder.append(" should ");
    BehaviorAction _action = null;
    if (step!=null) {
      _action=step.getAction();
    }
    _builder.append(_action, "");
    _builder.append(" ");
    String _value = null;
    if (step!=null) {
      _value=step.getValue();
    }
    String _replaceAll_1 = null;
    if (_value!=null) {
      _replaceAll_1=_value.replaceAll("\"", "");
    }
    _builder.append(_replaceAll_1, "");
    _builder.append(" ");
    UiElement _subjectElement = null;
    if (step!=null) {
      _subjectElement=step.getSubjectElement();
    }
    String _name_2 = null;
    if (_subjectElement!=null) {
      _name_2=_subjectElement.getName();
    }
    _builder.append(_name_2, "");
    String _subjectWildcard = null;
    if (step!=null) {
      _subjectWildcard=step.getSubjectWildcard();
    }
    String _replaceAll_2 = null;
    if (_subjectWildcard!=null) {
      _replaceAll_2=_subjectWildcard.replaceAll("\"", "");
    }
    _builder.append(_replaceAll_2, "");
    _builder.append("$\")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
