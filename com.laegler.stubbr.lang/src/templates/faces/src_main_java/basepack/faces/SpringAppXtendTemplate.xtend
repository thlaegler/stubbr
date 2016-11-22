package templates.faces.src_main_java.basepack.faces

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for JSF Spring application.
 */
class SpringAppXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»SpringApp'''
		header = '''package «project?.basePackage»'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/'''
		documentation = '''JSF Spring application for «project?.canonicalName»'''

		
	}

	override def String getTemplate() '''
		import «project?.basePackage».config.Constants
		import «project?.basePackage».config.DefaultProfileUtil
		import «project?.basePackage».config.Properties
		
		import org.slf4j.Logger
		import org.slf4j.LoggerFactory
		import org.springframework.boot.SpringApplication
		import org.springframework.boot.actuate.autoconfigure.*
		import org.springframework.boot.autoconfigure.EnableAutoConfiguration
		import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties
		import org.springframework.boot.context.properties.EnableConfigurationProperties
		import org.springframework.context.annotation.ComponentScan
		import org.springframework.core.env.Environment
		
		import javax.annotation.PostConstruct
		import javax.inject.Inject
		import java.net.InetAddress
		import java.net.UnknownHostException
		import java.util.Arrays
		import java.util.Collection
		
		@ComponentScan
		@EnableAutoConfiguration(exclude = { MetricFilterAutoConfiguration.class, MetricRepositoryAutoConfiguration.class })
		@EnableConfigurationProperties({ JHipsterProperties.class, LiquibaseProperties.class })
		class «fileName» {
		
			@Inject
			   Logger log
		
		    @Inject
		    Environment env
		
		    /**
		     * Initializes Spring Application.
		     * <p>
		     * Spring profiles can be configured with a program arguments --spring.profiles.active=your-active-profile
		     * <p>
		     * You can find more information on how profiles work with JHipster on <a href="http://jhipster.github.io/profiles/">http://jhipster.github.io/profiles/</a>.
		     */
		    @PostConstruct
		    public def void initApplication() {
		        log.info('Running with Spring profile(s) : {}', Arrays.toString(env.activeProfiles))
		        val Collection<String> activeProfiles = Arrays.asList(env.activeProfiles)
		        if (activeProfiles.contains(Constants.SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(Constants.SPRING_PROFILE_PRODUCTION)) {
		            log.error('You have misconfigured your application! It should not run with both the 'dev' and 'prod' profiles at the same time.')
		        }
		        if (activeProfiles.contains(Constants.SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(Constants.SPRING_PROFILE_CLOUD)) {
		            log.error('You have misconfigured your application! It should not run with both the dev and cloud profiles at the same time.')
		        }
		    }
		
		    /**
		     * Main method, used to run the application.
		     *
		     * @param args the command line arguments
		     * @throws UnknownHostException if the local host name could not be resolved into an address
		     */
		    public static def void main(String[] args) throws UnknownHostException {
		        val SpringApplication app = new SpringApplication(«fileName»)
		        DefaultProfileUtil.addDefaultProfile(app)
		        val Environment env = app.run(args).environment
		        log.info('Application '{}' is running! Access URLs:\n\t' +
		                'Local: \t\thttp://127.0.0.1:{}\n\t' +
		                'External: \thttp://{}:{}',
		            env.getProperty('spring.application.name'),
		            env.getProperty('server.port'),
		            InetAddress.getLocalHost().getHostAddress(),
		            env.getProperty('server.port'))
		    }
		}
	'''

}
