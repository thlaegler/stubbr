package templates.soap.server.src_main_java.basepack.soap.server

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Attribute
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate

/**
 * File template for SOAP endpoint interface.
 */
class SoapEndpointInterfaceXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr,
			project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»Soap'''
		header = '''package «project?.basePackage»'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/'''
		documentation = '''SOAP endpoint interface for entity «entity?.name?.toFirstUpper»'''

		content = withImports(template)
	}

	private def String getTemplate() '''
		import «project?.basePackage».*
		import «stubbr?.stubb?.packageName».model.entity.*
		import «stubbr?.stubb?.packageName».business.object.«entity?.name.toFirstUpper»BusinessObject
		import javax.jws.WebMethod
		import javax.jws.WebService
		import javax.jws.soap.SOAPBinding
		import javax.jws.soap.SOAPBinding.Style
		import javax.ws.rs.core.SecurityContext
		import javax.jws.soap.SOAPBinding.Use
		import com.google.gson.annotations.Since
		import com.google.gson.annotations.Until
		import javax.annotation.Generated
		
		
		«javaDocType»
		@WebService
		@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
		public interface «fileName» {
		
			/**
			 * Get «entity?.name?.toFirstUpper» with given ID.
			 */
			@WebMethod
			def public «entity?.name.toFirstUpper»BusinessObject get(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»SecurityContext securityContext)
		
			/**
			 * Create new «entity?.name?.toFirstUpper».
			 */
			@WebMethod
			def public String create(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»SecurityContext securityContext)
		
			/**
			 * Update given «entity?.name?.toFirstUpper».
			 */
			@WebMethod
			def public String update(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»SecurityContext securityContext)
		
			/**
			 * Delete given «entity?.name?.toFirstUpper».
			 */
			@WebMethod
			def public String delete(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»SecurityContext securityContext)
		
		}
	'''
}
