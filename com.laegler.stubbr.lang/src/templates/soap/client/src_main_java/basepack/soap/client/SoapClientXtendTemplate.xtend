package templates.soap.client.src_main_java.basepack.soap.client

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate

/**
 * File template for SOAP client.
 */
class SoapClientXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr,
			project)
		this.entity = entity
		header = '''package «project?.basePackage»'''
		fileName = '''«entity?.name?.toFirstUpper»SoapClient'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/'''
		documentation = '''SOAP client for entity «entity?.name?.toFirstUpper»'''

		content = withImports(template)
	}

	private def String getTemplate() '''
		import «project?.basePackage».*
		import «stubbr?.stubb?.packageName».soap.server.*
		import java.net.URL
		import javax.xml.namespace.QName
		import javax.xml.ws.Service
		
		«javaDocType»
		class «fileName» {
		
			/**
			 * Call SOAP Endpoint for Entity «entity?.name?.toFirstUpper».
			 */
			public def static void main(String[] args) throws Exception {
				val «fileName» client = new «fileName»()
				val «entity?.name?.toFirstUpper»Soap port = client.getPort()
			}
		
			/**
			 * Get the SOAP Service.
			 */
			public def «entity?.name?.toFirstUpper»Soap getPort() {
				val URL url = new URL('http://localhost:9999/ws/«entity?.name?.toLowerCase»?wsdl')
				val QName qname = new QName('«(stubbr?.stubb?.packageName + '.' + entity?.name).toNamespace»', '«entity?.name?.toFirstUpper»Soap')
				val Service service = Service.create(url, qname)
				return service.getPort(«entity?.name?.toFirstUpper»Soap)
			}
		
		}
	'''
}
