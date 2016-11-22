package templates.faces.src_main_java.basepack.faces.presenter

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.stubbrLang.Attribute

/**
 * File template for JSF/Faces presenter for managing entity.
 */
class EntityPresenterXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entityUpper»Presenter'''
		header = '''package «project.basePackage».presenter'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/presenter/'''
		documentation = '''JSF/Faces presenter for managing entity «entityUpper»'''

		
	}
	
	override def String getTemplate() '''
		import «project.basePackage».*
		import com.google.gson.annotations.Until
		import javax.annotation.Generated
		import org.slf4j.Logger
		
		«javaDocType»
		@«asImport('javax.enterprise.context.RequestScoped')»
		@«asImport('javax.inject.Named')»(value = 'presenter.«entity?.name?.toLowerCase»')
		class «fileName» extends AbstractPresenter {
		
			@«asImport('javax.inject.Inject')» «asImport(loggerType)» «loggerName»
			
			@«asImport('javax.inject.Inject')» «asImport(stubb?.packageName + '.business.controller.' + entityUpper + 'Controller')» «entityLower»Controller
		
			@«asImport('javax.annotation.PostConstruct')»
			public override void init() {
		
			}
			
			override initView() {
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
			}
		
			override getBean() {
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
			}
		
			/**
			 * 
			 * @return
			 */
			@«asImport('javax.annotation.security.PermitAll')»
			def String submitSave() {
				val long id = getHttpPostParam('id')
				«loggerName».info('submitSave(id={}) called.', id)
		
				val «entityUpper»BusinessObject «entityLower»BusinessObject = new «entityUpper»BusinessObject()
				«entityLower»Controller.save(«entityLower»BusinessObject)
				
				//«entityLower»Controller.update()
				//bean.principal = principalService.update(bean.principal)
				//if (bean.principal != null) {
				//	facesContext.addMessage(null,
				//		new FacesMessage(FacesMessage.SEVERITY_INFO, 'Änderungen am Mitarbeiter wurden gespeichert!',
				//			'Änderungen am Mitarbeiter wurden gespeichert!'))
				//} else {
				//	facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, 'Fehler!', 'Fehler!'))
				//}
				'/mobile/«entityLower».xhtml'
			}
		
			/**
			 * 
			 * @return
			 */
			def String goToDetails(long id) {
				«loggerName».info('goToDetails(id={}) called.', id)
				''
				//bean.principal = principalService.find(id)
				//initPrincipal
		
				//getOutcomePage('management-principal-details')
			}
		
			/**
			 *
			 */
			private def «entityUpper»BusinessObject viewBean2BusinessObject(«asImport(stubb?.packageName + '.faces.bean.' + entityUpper + 'ViewBean')» «entityLower»ViewBean) {
				val «entityUpper»BusinessObject «entityLower»BusinessObject = new «entityUpper»BusinessObject()
				«FOR Attribute attribute : entity?.attributes»
					«entityLower»BusinessObject.«attribute?.name?.toFirstLower» = «entityLower»ViewBean.«attribute?.name?.toFirstLower»
				«ENDFOR»
				return «entityLower»BusinessObject
			}

			/**
			 *
			 */
			private def «asImport(stubb?.packageName + '.faces.bean.' + entityUpper + 'ViewBean')» businessObject2ViewBean(«asImport(stubb?.packageName + '.business.object.' + entityUpper + 'BusinessObject')» «entityLower»BusinessObject) {
				val «entityUpper»ViewBean «entityLower»ViewBean = new «entityUpper»ViewBean()
				«FOR Attribute attribute : entity?.attributes»
					«entityLower»ViewBean.«attribute?.name?.toFirstLower» = «entityLower»BusinessObject.«attribute?.name?.toFirstLower»
				«ENDFOR»
				return «entityLower»ViewBean
			}
		
		}
	'''
	
	private def String getEntityLower() '''«entity?.name?.toFirstLower»'''
	private def String getEntityUpper() '''«entity?.name?.toFirstUpper»'''
	
}
