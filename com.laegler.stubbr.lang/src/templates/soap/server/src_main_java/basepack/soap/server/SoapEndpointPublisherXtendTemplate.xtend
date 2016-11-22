package templates.soap.server.src_main_java.basepack.soap.server

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate

/**
 * File template for SOAP endpoint publisher.
 */
class SoapEndpointPublisherXtendTemplate extends AbstractXtendTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'SoapEndpointPublisher'
		header = '''package «project?.basePackage»'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/'''
		documentation = 'SOAP endpoint publisher'
	}

	override def String getTemplate() '''
		import «project?.basePackage».*
		import com.google.gson.annotations.Since
		import com.google.gson.annotations.Until
		import javax.annotation.Generated
		
		«javaDocType»
		public class «fileName» {
		
			/**
			 * Publish all Endpoints.
			 */
			public static def void main(String[] args) {
				«FOR Entity entity : stubbr.stubb?.persistence?.entities»
					«asImport('javax.xml.ws.Endpoint')».publish('http://localhost:9999/ws/«entity?.name?.toLowerCase»', new «asImport(project?.basePackage + '.impl.' + entity?.name?.toFirstUpper + 'SoapImpl')»())
				«ENDFOR»
			}
		
		}
	'''
}
