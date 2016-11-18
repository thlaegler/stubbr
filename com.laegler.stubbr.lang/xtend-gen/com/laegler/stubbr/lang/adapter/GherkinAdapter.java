package com.laegler.stubbr.lang.adapter;

import com.laegler.stubbr.lang.adapter.StubbrAdapter;
import com.laegler.stubbr.lang.genmodel.FileHelper;
import com.laegler.stubbr.lang.genmodel.Project;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.inject.Inject;

/**
 * Reads, parses and generates Cucumber/Gherkin files.
 */
@SuppressWarnings("all")
public class GherkinAdapter /* implements StubbrAdapter<GherkinDocument>  */{
  @Inject
  private Logger log;
  
  @Inject
  private FileHelper fileHelper;
  
  private List<String> methodSnippets = new ArrayList<String>();
  
  @Override
  public /* GherkinDocument */Object parse(final String fileLocation) {
    throw new Error("Unresolved compilation problems:"
      + "\nTokenMatcher cannot be resolved to a type."
      + "\nAstBuilder cannot be resolved to a type."
      + "\nParser cannot be resolved to a type."
      + "\nParserException cannot be resolved to a type."
      + "\nGherkinDocument cannot be resolved to a type."
      + "\nFeature cannot be resolved to a type."
      + "\nTokenMatcher cannot be resolved."
      + "\nAstBuilder cannot be resolved."
      + "\nParser cannot be resolved."
      + "\nThe method stopAtFirstError(boolean) is undefined"
      + "\nGherkinDocument cannot be resolved to a type."
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nparse cannot be resolved"
      + "\nfeature cannot be resolved"
      + "\nname cannot be resolved"
      + "\nfeature cannot be resolved"
      + "\ndescription cannot be resolved");
  }
  
  @Override
  public String generate(final Project project, final String fileLocation) {
    HashMap<String, Object> _hashMap = new HashMap<String, Object>();
    return this.generate(project, fileLocation, _hashMap);
  }
  
  @Override
  public String generate(final Project project, final String fileLocation, final Map<String, Object> params) {
    throw new Error("Unresolved compilation problems:"
      + "\nGherkinDocument cannot be resolved to a type."
      + "\nScenarioDefinition cannot be resolved to a type."
      + "\nStep cannot be resolved to a type."
      + "\nThe method getSnippet(Step, FunctionNameGenerator) is undefined for the type SnippetGenerator"
      + "\nThe method parse(String) from the type GherkinAdapter refers to the missing type GherkinDocument"
      + "\nfeature cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreplaceAll cannot be resolved"
      + "\nreplaceAll cannot be resolved"
      + "\ntoLowerCase cannot be resolved"
      + "\nfeature cannot be resolved"
      + "\nname cannot be resolved"
      + "\nfeature cannot be resolved"
      + "\nchildren cannot be resolved"
      + "\nsteps cannot be resolved");
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
