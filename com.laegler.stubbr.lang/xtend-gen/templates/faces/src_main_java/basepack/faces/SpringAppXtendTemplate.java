package templates.faces.src_main_java.basepack.faces;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import templates.AbstractXtendTemplate;

/**
 * File template for JSF Spring application.
 */
@SuppressWarnings("all")
public class SpringAppXtendTemplate extends AbstractXtendTemplate {
  private Entity entity;
  
  public SpringAppXtendTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.entity = this.entity;
    StringConcatenation _builder = new StringConcatenation();
    String _name = null;
    if (this.entity!=null) {
      _name=this.entity.getName();
    }
    String _firstUpper = null;
    if (_name!=null) {
      _firstUpper=StringExtensions.toFirstUpper(_name);
    }
    _builder.append(_firstUpper, "");
    _builder.append("SpringApp");
    this.setFileName(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _basePackage = null;
    if (project!=null) {
      _basePackage=project.getBasePackage();
    }
    _builder_1.append(_basePackage, "");
    this.setHeader(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("/src/main/java/");
    String _basePackage_1 = null;
    if (project!=null) {
      _basePackage_1=project.getBasePackage();
    }
    String _path = null;
    if (_basePackage_1!=null) {
      _path=this.toPath(_basePackage_1);
    }
    _builder_2.append(_path, "");
    _builder_2.append("/");
    this.setRelativPath(_builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("JSF Spring application for ");
    String _canonicalName = null;
    if (project!=null) {
      _canonicalName=project.getCanonicalName();
    }
    _builder_3.append(_canonicalName, "");
    this.setDocumentation(_builder_3.toString());
    String _template = this.getTemplate();
    this.setContent(_template);
  }
  
  private String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    Project _project = this.getProject();
    String _basePackage = null;
    if (_project!=null) {
      _basePackage=_project.getBasePackage();
    }
    _builder.append(_basePackage, "");
    _builder.append(".config.Constants");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    Project _project_1 = this.getProject();
    String _basePackage_1 = null;
    if (_project_1!=null) {
      _basePackage_1=_project_1.getBasePackage();
    }
    _builder.append(_basePackage_1, "");
    _builder.append(".config.DefaultProfileUtil");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    Project _project_2 = this.getProject();
    String _basePackage_2 = null;
    if (_project_2!=null) {
      _basePackage_2=_project_2.getBasePackage();
    }
    _builder.append(_basePackage_2, "");
    _builder.append(".config.Properties");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.slf4j.Logger");
    _builder.newLine();
    _builder.append("import org.slf4j.LoggerFactory");
    _builder.newLine();
    _builder.append("import org.springframework.boot.SpringApplication");
    _builder.newLine();
    _builder.append("import org.springframework.boot.actuate.autoconfigure.*");
    _builder.newLine();
    _builder.append("import org.springframework.boot.autoconfigure.EnableAutoConfiguration");
    _builder.newLine();
    _builder.append("import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties");
    _builder.newLine();
    _builder.append("import org.springframework.boot.context.properties.EnableConfigurationProperties");
    _builder.newLine();
    _builder.append("import org.springframework.context.annotation.ComponentScan");
    _builder.newLine();
    _builder.append("import org.springframework.core.env.Environment");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.annotation.PostConstruct");
    _builder.newLine();
    _builder.append("import javax.inject.Inject");
    _builder.newLine();
    _builder.append("import java.net.InetAddress");
    _builder.newLine();
    _builder.append("import java.net.UnknownHostException");
    _builder.newLine();
    _builder.append("import java.util.Arrays");
    _builder.newLine();
    _builder.append("import java.util.Collection");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@ComponentScan");
    _builder.newLine();
    _builder.append("@EnableAutoConfiguration(exclude = { MetricFilterAutoConfiguration.class, MetricRepositoryAutoConfiguration.class })");
    _builder.newLine();
    _builder.append("@EnableConfigurationProperties({ JHipsterProperties.class, LiquibaseProperties.class })");
    _builder.newLine();
    _builder.append("class ");
    String _fileName = this.getFileName();
    _builder.append(_fileName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("Logger log");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Environment env");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Initializes Spring Application.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <p>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Spring profiles can be configured with a program arguments --spring.profiles.active=your-active-profile");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <p>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* You can find more information on how profiles work with JHipster on <a href=\"http://jhipster.github.io/profiles/\">http://jhipster.github.io/profiles/</a>.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@PostConstruct");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public def void initApplication() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("log.info(\'Running with Spring profile(s) : {}\', Arrays.toString(env.activeProfiles))");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("val Collection<String> activeProfiles = Arrays.asList(env.activeProfiles)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (activeProfiles.contains(Constants.SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(Constants.SPRING_PROFILE_PRODUCTION)) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("log.error(\'You have misconfigured your application! It should not run with both the \'dev\' and \'prod\' profiles at the same time.\')");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (activeProfiles.contains(Constants.SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(Constants.SPRING_PROFILE_CLOUD)) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("log.error(\'You have misconfigured your application! It should not run with both the dev and cloud profiles at the same time.\')");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Main method, used to run the application.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param args the command line arguments");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @throws UnknownHostException if the local host name could not be resolved into an address");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static def void main(String[] args) throws UnknownHostException {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("val SpringApplication app = new SpringApplication(");
    String _fileName_1 = this.getFileName();
    _builder.append(_fileName_1, "        ");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("DefaultProfileUtil.addDefaultProfile(app)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("val Environment env = app.run(args).environment");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("log.info(\'Application \'{}\' is running! Access URLs:\\n\\t\' +");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("\'Local: \\t\\thttp://127.0.0.1:{}\\n\\t\' +");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("\'External: \\thttp://{}:{}\',");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("env.getProperty(\'spring.application.name\'),");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("env.getProperty(\'server.port\'),");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("InetAddress.getLocalHost().getHostAddress(),");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("env.getProperty(\'server.port\'))");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
