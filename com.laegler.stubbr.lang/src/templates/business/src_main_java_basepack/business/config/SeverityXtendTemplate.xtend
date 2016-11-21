package templates.business.src_main_java_basepack.business.config

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import templates.AbstractXtendTemplate

/**
 * File template for general severity of status messages.
 */
class SeverityXtendTemplate extends AbstractXtendTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'CustomSeverity'
		header = '''package «project.basePackage».config'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/config/'''
		documentation = 'General severity of status messages.'

		content = withImports(template)
	}

	private def String getTemplate() '''
		«javaDocType»
		enum «fileName» {
			MESSAGE, INFO, WARNING, ERROR;
		}
	'''

}
