package templates.business.src_main_java_basepack.business.controller

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import templates.AbstractXtendTemplate

/**
 * File template for abstract controller for all controllers.
 */
class AbstractControllerXtendTemplate extends AbstractXtendTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'AbstractController'
		header = '''package «project.basePackage».controller'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/controller/'''
		documentation = 'Abstract controller'

		
	}

	override def String getTemplate() '''
		import «project.basePackage».*
		import org.eclipse.xtend.lib.annotations.Accessors
		import com.google.gson.annotations.Expose
		
		«javaDocType»
		class «fileName» {
		
		}
	'''

}
