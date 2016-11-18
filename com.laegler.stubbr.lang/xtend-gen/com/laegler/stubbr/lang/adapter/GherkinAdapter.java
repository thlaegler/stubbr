package com.laegler.stubbr.lang.adapter;

import com.laegler.stubbr.lang.adapter.StubbrAdapter;
import com.laegler.stubbr.lang.adapter.cucumber.CamelCaseConcatenator;
import com.laegler.stubbr.lang.adapter.cucumber.Concatenator;
import com.laegler.stubbr.lang.adapter.cucumber.FunctionNameGenerator;
import com.laegler.stubbr.lang.adapter.cucumber.Snippet;
import com.laegler.stubbr.lang.adapter.cucumber.SnippetGenerator;
import com.laegler.stubbr.lang.adapter.cucumber.XtendSnippet;
import com.laegler.stubbr.lang.genmodel.FileHelper;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.stubbrLang.Feature;
import com.laegler.stubbr.lang.stubbrLang.impl.StubbrLangFactoryImpl;
import gherkin.AstBuilder;
import gherkin.Parser;
import gherkin.ParserException;
import gherkin.TokenMatcher;
import gherkin.ast.GherkinDocument;
import gherkin.ast.ScenarioDefinition;
import gherkin.ast.Step;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Reads, parses and generates Cucumber/Gherkin files.
 */
@SuppressWarnings("all")
public class GherkinAdapter implements StubbrAdapter<GherkinDocument> {
  @Inject
  private Logger log;
  
  @Inject
  private FileHelper fileHelper;
  
  private List<String> methodSnippets = new ArrayList<String>();
  
  @Override
  public GherkinDocument parse(final String fileLocation) {
    Object _xblockexpression = null;
    {
      this.log.info("Parsing Swagger YAML file.");
      final File file = this.fileHelper.findFile(fileLocation);
      final String gherkinFileContent = this.fileHelper.getFileContent(file);
      TokenMatcher _tokenMatcher = new TokenMatcher();
      final Procedure1<TokenMatcher> _function = (TokenMatcher it) -> {
      };
      final TokenMatcher matcher = ObjectExtensions.<TokenMatcher>operator_doubleArrow(_tokenMatcher, _function);
      AstBuilder _astBuilder = new AstBuilder();
      final Procedure1<AstBuilder> _function_1 = (AstBuilder it) -> {
      };
      final AstBuilder builder = ObjectExtensions.<AstBuilder>operator_doubleArrow(_astBuilder, _function_1);
      Parser<GherkinDocument> _parser = new Parser<GherkinDocument>(builder);
      final Procedure1<Parser<GherkinDocument>> _function_2 = (Parser<GherkinDocument> it) -> {
        it.stopAtFirstError = false;
      };
      final Parser<GherkinDocument> parser = ObjectExtensions.<Parser<GherkinDocument>>operator_doubleArrow(_parser, _function_2);
      try {
        final GherkinDocument gherkinModel = parser.parse(gherkinFileContent, matcher);
        this.log.info("Gherkin feature file successfully parsed");
        return gherkinModel;
      } catch (final Throwable _t) {
        if (_t instanceof ParserException) {
          final ParserException e = (ParserException)_t;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Failed to parse gherkin feature ");
          _builder.append(file, "");
          this.log.warning(_builder.toString());
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = null;
    }
    return ((GherkinDocument)_xblockexpression);
  }
  
  public Feature parseToFeature(final String fileLocation) {
    final GherkinDocument gherkinModel = this.parse(fileLocation);
    this.log.info("Gherkin feature file successfully parsed");
    Feature _createFeature = StubbrLangFactoryImpl.eINSTANCE.createFeature();
    final Procedure1<Feature> _function = (Feature it) -> {
      gherkin.ast.Feature _feature = null;
      if (gherkinModel!=null) {
        _feature=gherkinModel.getFeature();
      }
      String _name = null;
      if (_feature!=null) {
        _name=_feature.getName();
      }
      it.setName(_name);
      gherkin.ast.Feature _feature_1 = null;
      if (gherkinModel!=null) {
        _feature_1=gherkinModel.getFeature();
      }
      String _description = null;
      if (_feature_1!=null) {
        _description=_feature_1.getDescription();
      }
      it.setLabel(_description);
    };
    final Feature feature = ObjectExtensions.<Feature>operator_doubleArrow(_createFeature, _function);
    return feature;
  }
  
  @Override
  public String generate(final Project project, final String fileLocation) {
    HashMap<String, Object> _hashMap = new HashMap<String, Object>();
    return this.generate(project, fileLocation, _hashMap);
  }
  
  @Override
  public String generate(final Project project, final String fileLocation, final Map<String, Object> params) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Generate Cucumber snippets/stubs for feature ");
    _builder.append(fileLocation, "");
    _builder.append(".");
    this.log.info(_builder.toString());
    final GherkinDocument featureModel = this.parse(fileLocation);
    final Snippet snippet = new XtendSnippet();
    final SnippetGenerator generator = new SnippetGenerator(snippet);
    final Concatenator concatenator = new CamelCaseConcatenator();
    final FunctionNameGenerator fuctionNameGen = new FunctionNameGenerator(concatenator);
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.methodSnippets = _arrayList;
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = null;
    if (project!=null) {
      _basePackage=project.getBasePackage();
    }
    _builder_1.append(_basePackage, "");
    _builder_1.append(".feature.");
    gherkin.ast.Feature _feature = null;
    if (featureModel!=null) {
      _feature=featureModel.getFeature();
    }
    String _name = null;
    if (_feature!=null) {
      _name=_feature.getName();
    }
    String _replaceAll = null;
    if (_name!=null) {
      _replaceAll=_name.replaceAll(" ", "");
    }
    String _replaceAll_1 = _replaceAll.replaceAll("\"", "");
    String _lowerCase = _replaceAll_1.toLowerCase();
    _builder_1.append(_lowerCase, "");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("import ");
    String _basePackage_1 = null;
    if (project!=null) {
      _basePackage_1=project.getBasePackage();
    }
    _builder_1.append(_basePackage_1, "");
    _builder_1.append(".*");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("import org.slf4j.Logger");
    _builder_1.newLine();
    _builder_1.append("import cucumber.api.java.en.Given");
    _builder_1.newLine();
    _builder_1.append("import cucumber.api.java.en.Then");
    _builder_1.newLine();
    _builder_1.append("import cucumber.api.java.en.When");
    _builder_1.newLine();
    _builder_1.append("import cucumber.api.PendingException");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("class ");
    gherkin.ast.Feature _feature_1 = null;
    if (featureModel!=null) {
      _feature_1=featureModel.getFeature();
    }
    String _name_1 = null;
    if (_feature_1!=null) {
      _name_1=_feature_1.getName();
    }
    _builder_1.append(_name_1, "");
    _builder_1.append("StepDefinitions {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("@Inject Logger log");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    {
      gherkin.ast.Feature _feature_2 = null;
      if (featureModel!=null) {
        _feature_2=featureModel.getFeature();
      }
      List<ScenarioDefinition> _children = null;
      if (_feature_2!=null) {
        _children=_feature_2.getChildren();
      }
      for(final ScenarioDefinition scenario : _children) {
        {
          List<Step> _steps = null;
          if (scenario!=null) {
            _steps=scenario.getSteps();
          }
          for(final Step step : _steps) {
            _builder_1.append("\t");
            String _snippet = generator.getSnippet(step, fuctionNameGen);
            String _addSnippet = this.addSnippet(_snippet);
            _builder_1.append(_addSnippet, "\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder_1.append("}");
    _builder_1.newLine();
    return _builder_1.toString();
  }
  
  private String addSnippet(final String methodSnippet) {
    boolean _contains = this.methodSnippets.contains(methodSnippet);
    boolean _not = (!_contains);
    if (_not) {
      this.methodSnippets.add(methodSnippet);
      return methodSnippet;
    } else {
      return "";
    }
  }
}
