package templates.business.src_main_java_basepack.business.config

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import templates.AbstractXtendTemplate

/**
 * File template for general configuration.
 */
class EnvironmentXtendTemplate extends AbstractXtendTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'Environment'
		header = '''package «project.basePackage».config'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/config/'''
		documentation = 'Environment configuration'

		content = withImports(template)
	}

	private def String getTemplate() '''
		«javaDocType»
		enum «fileName» {
			DEFAULT, LOCAL, TEST, STAGE, PROD
		}
	'''

}
