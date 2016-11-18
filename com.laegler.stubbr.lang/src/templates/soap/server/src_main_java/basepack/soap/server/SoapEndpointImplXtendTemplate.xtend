package templates.soap.server.src_main_java.basepack.soap.server

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Attribute
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate

/**
 * File template for SOAP endpoint implementation.
 */
class SoapEndpointImplXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»SoapImpl'''
		header = '''package «project?.basePackage».impl'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/impl/'''
		documentation = '''SOAP endpoint implementation for entity «entity?.name?.toFirstUpper»'''

		content = withImports(template)
	}

	private def String getTemplate() '''
		import «project?.basePackage».*
		import «stubbr?.stubb?.packageName».persistence.service.«entity?.name?.toFirstUpper»Service
		import «stubbr?.stubb?.packageName».model.entity.«entity?.name?.toFirstUpper»
		import «stubbr?.stubb?.packageName».business.controller.«entity?.name?.toFirstUpper»Controller
		import «stubbr?.stubb?.packageName».business.object.«entity?.name?.toFirstUpper»BusinessObject
		import javax.inject.Inject
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
		@WebService(endpointInterface = '«project?.basePackage».«entity?.name?.toFirstUpper»Soap', targetNamespace = '«project?.basePackage?.toNamespace»')
		@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
		class «fileName» implements «entity?.name?.toFirstUpper»Soap {
		
			@Inject
			private «entity?.name?.toFirstUpper»Controller «entity?.name?.toFirstLower»Controller 
		
			@Inject
			@Deprecated
			private «entity?.name?.toFirstUpper»Service «entity?.name?.toFirstLower»Service
		
			/**
			 * Get «entity?.name?.toFirstUpper» with given ID.
			 */
			override def «entity?.name?.toFirstLower»Get(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»SecurityContext securityContext) {
				val «entity?.name.toFirstUpper» «entity?.name.toFirstLower»BusinessObject = «entity?.name?.toFirstLower»Service.findById(«entity?.attributes?.get(0)?.name?.toFirstLower»)
				return «entity?.name.toFirstLower»BusinessObject
			}
		
			/**
			 * Create new «entity?.name?.toFirstUpper».
			 */
			override def «entity?.name?.toFirstLower»Post(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»SecurityContext securityContext) {
			
			}
		
			/**
			 * Update given «entity?.name?.toFirstUpper».
			 */
			override def «entity?.name?.toFirstLower»Put(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»SecurityContext securityContext) {
			
			}
		
			/**
			 * Delete given «entity?.name?.toFirstUpper».
			 */
			override def «entity?.name?.toFirstLower»Delete(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»SecurityContext securityContext) {
				«entity?.name?.toFirstLower»Service.remove(«entity?.attributes?.get(0)?.name?.toFirstLower»)
				return 'removed «entity?.name?.toFirstUpper»'
			}
		}
	'''
}
