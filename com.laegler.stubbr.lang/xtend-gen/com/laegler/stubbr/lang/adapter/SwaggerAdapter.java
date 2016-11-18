package com.laegler.stubbr.lang.adapter;

import com.laegler.stubbr.lang.adapter.StubbrAdapter;
import com.laegler.stubbr.lang.genmodel.FileHelper;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.RestLanguage;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Helper for parsing Swagger YAML file.
 */
@SuppressWarnings("all")
public class SwaggerAdapter /* implements StubbrAdapter<Swagger>  */{
  @Inject
  private Logger log;
  
  @Inject
  private StubbrRegistry stubbr;
  
  @Inject
  private FileHelper fileHelper;
  
  @Inject
  private /* SwaggerParser */Object parser;
  
  @Inject
  private /* CodegenConfigurator */Object configurator;
  
  @Inject
  private /* DefaultGenerator */Object generator;
  
  /**
   * Parse a Swagger YAML file to Swagger model
   */
  @Override
  public /* Swagger */Object parse(final String fileLocation) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SwaggerAdapter.parser refers to the missing type SwaggerParser"
      + "\nread cannot be resolved");
  }
  
  @Override
  public String generate(final Project project, final String fileLocation) {
    HashMap<String, Object> _hashMap = new HashMap<String, Object>();
    return this.generate(project, fileLocation, _hashMap);
  }
  
  /**
   * Map of required Parameter:
   * <ul>
   * <li>'language': the Swagger language (type RestLanguage) that should be used.</li>
   * <li>'outputLocation': the directory where swagger should generate artifacts.</li>
   * </ul>
   */
  @Override
  public String generate(final Project project, final String fileLocation, final Map<String, Object> params) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field absolutePath is undefined for the type Object"
      + "\nThe method or field absolutePath is undefined for the type Object"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThe field SwaggerAdapter.generator refers to the missing type DefaultGenerator"
      + "\nThe field SwaggerAdapter.configurator refers to the missing type CodegenConfigurator"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nverbose cannot be resolved"
      + "\ninputSpec cannot be resolved"
      + "\noutputDir cannot be resolved"
      + "\nskipOverwrite cannot be resolved"
      + "\nauth cannot be resolved"
      + "\nlang cannot be resolved"
      + "\napiPackage cannot be resolved"
      + "\nmodelPackage cannot be resolved"
      + "\ninvokerPackage cannot be resolved"
      + "\ngroupId cannot be resolved"
      + "\nartifactId cannot be resolved"
      + "\nartifactVersion cannot be resolved"
      + "\nopts cannot be resolved"
      + "\ntoClientOptInput cannot be resolved"
      + "\ngenerate cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  private String toClassname(final RestLanguage language) {
    final String langPackage = "io.swagger.codegen.languages";
    if (language != null) {
      switch (language) {
        case ANDROID_CLIENT:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(langPackage, "");
          _builder.append(".AndroidClientCodegen");
          return _builder.toString();
        case HTML2_CLIENT:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(langPackage, "");
          _builder_1.append(".StaticHtml2Generator");
          return _builder_1.toString();
        case IOS_CLIENT:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(langPackage, "");
          _builder_2.append(".JavaResteasyServerCodegen");
          return _builder_2.toString();
        case JAVA_CLIENT:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append(langPackage, "");
          _builder_3.append(".JavaClientCodegen");
          return _builder_3.toString();
        case JAXRS_SERVER:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append(langPackage, "");
          _builder_4.append(".JavaJAXRSSpecServerCodegen");
          return _builder_4.toString();
        case PHP_CLIENT:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append(langPackage, "");
          _builder_5.append(".PhpClientCodegen");
          return _builder_5.toString();
        case PHP_SERVER:
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append(langPackage, "");
          _builder_6.append(".LumenServerCodegen");
          return _builder_6.toString();
        case RESTEASY_SERVER:
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append(langPackage, "");
          _builder_7.append(".JavaResteasyServerCodegen");
          return _builder_7.toString();
        default:
          {
            StringConcatenation _builder_8 = new StringConcatenation();
            _builder_8.append("Unknown language: ");
            String _literal = language.getLiteral();
            _builder_8.append(_literal, "");
            this.log.warning(_builder_8.toString());
            StringConcatenation _builder_9 = new StringConcatenation();
            _builder_9.append(langPackage, "");
            _builder_9.append(".UndefinedSwaggerCodegen");
            return _builder_9.toString();
          }
      }
    } else {
      {
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("Unknown language: ");
        String _literal = language.getLiteral();
        _builder_8.append(_literal, "");
        this.log.warning(_builder_8.toString());
        StringConcatenation _builder_9 = new StringConcatenation();
        _builder_9.append(langPackage, "");
        _builder_9.append(".UndefinedSwaggerCodegen");
        return _builder_9.toString();
      }
    }
  }
}
