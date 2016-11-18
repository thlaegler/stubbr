package templates.faces.src_main_java.basepack.faces

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for JSF Spring programmatical web.xml.
 */
class SpringWebXmlXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		this.entity = entity
		fileName = 'ApplicationWebXml'
		header = '''package «project.basePackage»'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/'''
		documentation = '''JSF Spring programmatical web.xml for «project?.canonicalName»'''

		content = template
	}

	private def String getTemplate() '''
		import «project.basePackage».config.DefaultProfileUtil
		import org.springframework.boot.builder.SpringApplicationBuilder
		import org.springframework.boot.web.support.SpringBootServletInitializer
		
		/**
		 * This is a helper Java class that provides an alternative to creating a web.xml.
		 * This will be invoked only when the application is deployed to a servlet container like Tomcat, Jboss etc.
		 */
		class ApplicationWebXml extends SpringBootServletInitializer {
		
			override def SpringApplicationBuilder configure(SpringApplicationBuilder application) {
				DefaultProfileUtil.addDefaultProfile(application.application())
				application.sources(JhipexApp)
			}
		}
	'''

}
