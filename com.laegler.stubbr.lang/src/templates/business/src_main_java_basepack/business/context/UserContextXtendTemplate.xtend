package templates.business.src_main_java_basepack.business.context

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import templates.AbstractXtendTemplate

/**
 * File template for user context holding session and security information of current user.
 */
class UserContextXtendTemplate extends AbstractXtendTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'UserContext'
		header = '''package «project.basePackage».context'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/context/'''
		documentation = 'User context holding session and security information of current user'

		content = withImports(template)
	}

	private def String getTemplate() '''
		import «project.basePackage».*
		import java.util.Locale
		import org.eclipse.xtend.lib.annotations.Accessors
		import javax.enterprise.context.SessionScoped
		import javax.inject.Named
		
		«javaDocType»
		@Accessors
		@SessionScoped
		@Named('context.user')
		class «fileName» {
		
			boolean isMobile
		
			Role role
		
			Locale locale
		
		}
	'''

}
