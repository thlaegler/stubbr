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
		fileName = '''«entityUpper»SoapImpl'''
		header = '''package «project?.basePackage».impl'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/impl/'''
		documentation = '''SOAP endpoint implementation for entity «entityUpper»'''
	}

	override def String getTemplate() '''
		import «project?.basePackage».*
		import «stubbr?.stubb?.packageName».persistence.service.«entityUpper»Service
		import «stubbr?.stubb?.packageName».model.entity.*
		import «stubbr?.stubb?.packageName».model.entity.«entityUpper»
		import «stubbr?.stubb?.packageName».business.controller.«entityUpper»Controller
		import «stubbr?.stubb?.packageName».business.object.«entityUpper»BusinessObject
		import «stubbr?.stubb?.packageName».soap.server.«entityUpper»Soap
		import javax.inject.Inject
		import javax.jws.WebMethod
		import javax.ws.rs.core.SecurityContext
		
		«javaDocType»
		@«asImport('javax.jws.WebService')»(endpointInterface = '«project?.basePackage».«entityUpper»Soap', targetNamespace = '«project?.basePackage?.toNamespace»')
		class «fileName» implements «entityUpper»Soap {
		
			@Inject
			private «entityUpper»Controller «entityLower»Controller 
		
			/**
			 * Get «entityUpper» with given ID.
			 */
			override def get(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»String dummy) {
				val «entity?.name.toFirstUpper»BusinessObject «entity?.name.toFirstLower»BusinessObject = «entityLower»Controller.findById(1)
				return «entity?.name.toFirstLower»BusinessObject
			}
		
			/**
			 * Create new «entityUpper».
			 */
			override def create(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»String dummy) {
			
			}
		
			/**
			 * Update given «entityUpper».
			 */
			override def update(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»String dummy) {
			
			}
		
			/**
			 * Delete given «entityUpper».
			 */
			override def delete(«FOR Attribute attribute : entity?.attributes»«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower», «ENDFOR»String dummy) {
				«entityLower»Controller.remove(1)
				return 'removed «entityUpper»'
			}

		}
	'''
	
	private def String getEntityLower() '''«entity?.name?.toFirstLower»'''
	private def String getEntityUpper() '''«entity?.name?.toFirstUpper»'''

}
