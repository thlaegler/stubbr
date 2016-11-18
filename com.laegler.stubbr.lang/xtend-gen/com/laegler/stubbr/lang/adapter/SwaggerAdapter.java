package com.laegler.stubbr.lang.adapter;

import com.google.common.base.Objects;
import com.laegler.stubbr.lang.adapter.StubbrAdapter;
import com.laegler.stubbr.lang.genmodel.FileHelper;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.RestLanguage;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import io.swagger.codegen.ClientOptInput;
import io.swagger.codegen.DefaultGenerator;
import io.swagger.codegen.Generator;
import io.swagger.codegen.config.CodegenConfigurator;
import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.logging.Logger;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Helper for parsing Swagger YAML file.
 */
@SuppressWarnings("all")
public class SwaggerAdapter implements StubbrAdapter<Swagger> {
  @Inject
  private Logger log;
  
  @Inject
  private StubbrRegistry stubbr;
  
  @Inject
  private FileHelper fileHelper;
  
  @Inject
  private SwaggerParser parser;
  
  @Inject
  private CodegenConfigurator configurator;
  
  @Inject
  private DefaultGenerator generator;
  
  /**
   * Parse a Swagger YAML file to Swagger model
   */
  @Override
  public Swagger parse(final String fileLocation) {
    this.log.info("Parsing Swagger YAML file.");
    final File file = this.fileHelper.findFile(fileLocation);
    String _path = file.getPath();
    return this.parser.read(_path);
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
    if (((Objects.equal(params, null) || (!params.containsKey("language"))) || (!params.containsKey("outputLocation")))) {
      this.log.warning("Cannot generate Swagger filesbecause of missing parameters.");
      return null;
    }
    Object _get = params.get("language");
    final RestLanguage language = ((RestLanguage) _get);
    Object _get_1 = params.get("outputLocation");
    final String outputLocation = ((String) _get_1);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Generate Swagger files for ");
    _builder.append(language, "");
    _builder.append(".");
    this.log.info(_builder.toString());
    final File file = this.fileHelper.findFile(fileLocation);
    this.configurator.setVerbose(false);
    String _absolutePath = file.getAbsolutePath();
    this.configurator.setInputSpec(_absolutePath);
    StringConcatenation _builder_1 = new StringConcatenation();
    String _parent = file.getParent();
    _builder_1.append(_parent, "");
    _builder_1.append("/../");
    _builder_1.append(outputLocation, "");
    _builder_1.append("/");
    this.configurator.setOutputDir(_builder_1.toString());
    this.configurator.setSkipOverwrite(false);
    this.configurator.setAuth("oauth2");
    String _classname = this.toClassname(language);
    this.configurator.setLang(_classname);
    StringConcatenation _builder_2 = new StringConcatenation();
    Stubb _stubb = null;
    if (this.stubbr!=null) {
      _stubb=this.stubbr.getStubb();
    }
    String _packageName = _stubb.getPackageName();
    _builder_2.append(_packageName, "");
    _builder_2.append(".rest.");
    _builder_2.append(language, "");
    _builder_2.append(".api");
    this.configurator.setApiPackage(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    Stubb _stubb_1 = null;
    if (this.stubbr!=null) {
      _stubb_1=this.stubbr.getStubb();
    }
    String _packageName_1 = _stubb_1.getPackageName();
    _builder_3.append(_packageName_1, "");
    _builder_3.append(".rest.");
    _builder_3.append(language, "");
    _builder_3.append(".model");
    this.configurator.setModelPackage(_builder_3.toString());
    StringConcatenation _builder_4 = new StringConcatenation();
    Stubb _stubb_2 = null;
    if (this.stubbr!=null) {
      _stubb_2=this.stubbr.getStubb();
    }
    String _packageName_2 = _stubb_2.getPackageName();
    _builder_4.append(_packageName_2, "");
    _builder_4.append(".rest.");
    _builder_4.append(language, "");
    _builder_4.append(".invoker");
    this.configurator.setInvokerPackage(_builder_4.toString());
    Stubb _stubb_3 = null;
    if (this.stubbr!=null) {
      _stubb_3=this.stubbr.getStubb();
    }
    String _packageName_3 = _stubb_3.getPackageName();
    this.configurator.setGroupId(_packageName_3);
    String _name = project.getName();
    this.configurator.setArtifactId(_name);
    String _version = project.getVersion();
    this.configurator.setArtifactVersion(_version);
    Thread _currentThread = Thread.currentThread();
    ClassLoader _systemClassLoader = ClassLoader.getSystemClassLoader();
    _currentThread.setContextClassLoader(_systemClassLoader);
    final StringBuilder generatedFiles = new StringBuilder();
    ClientOptInput _clientOptInput = this.configurator.toClientOptInput();
    Generator _opts = this.generator.opts(_clientOptInput);
    List<File> _generate = _opts.generate();
    final Consumer<File> _function = (File generatedFile) -> {
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("Swagger Codegen generated file: ");
      String _absolutePath_1 = generatedFile.getAbsolutePath();
      _builder_5.append(_absolutePath_1, "");
      this.log.info(_builder_5.toString());
      String _absolutePath_2 = generatedFile.getAbsolutePath();
      generatedFiles.append(_absolutePath_2);
    };
    _generate.forEach(_function);
    return generatedFiles.toString();
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
