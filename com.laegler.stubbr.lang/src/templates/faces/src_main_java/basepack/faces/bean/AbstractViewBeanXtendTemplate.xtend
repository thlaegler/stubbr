package templates.faces.src_main_java.basepack.faces.bean

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import templates.AbstractXtendTemplate

/**
 * File template for abstract JSF/Faces view bean for all view beans.
 */
class AbstractViewBeanXtendTemplate extends AbstractXtendTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'AbstractViewBean'
		header = '''package «project?.basePackage».bean'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/bean/'''
		documentation = 'Abstract JSF/Faces view bean for all view beans'

		
	}

	override def String getTemplate() '''
		«javaDocType»
		abstract class «fileName» {
		
			@«asImport('javax.inject.Inject')»
			protected «asImport(loggerType)» «loggerName»
		
		}
	'''

}
