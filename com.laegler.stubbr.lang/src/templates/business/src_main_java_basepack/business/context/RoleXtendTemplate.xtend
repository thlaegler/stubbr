package templates.business.src_main_java_basepack.business.context

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import templates.AbstractXtendTemplate

/**
 * File template for user roles.
 */
class RoleXtendTemplate extends AbstractXtendTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'Role'
		header = '''package «project.basePackage».context'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/context/'''
		documentation = 'User roles'
	}

	override def String getTemplate() '''
		«javaDocType»
		enum «fileName» {
		
			SUPERUSER, ADMIN, PROVIDER, CUSTOMER, GUEST
		
		}
	'''

}
