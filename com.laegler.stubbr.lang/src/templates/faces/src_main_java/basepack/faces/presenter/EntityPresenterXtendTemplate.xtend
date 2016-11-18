package templates.faces.src_main_java.basepack.faces.presenter

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

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
		fileName = '''«entity?.name?.toFirstUpper»Presenter'''
		header = '''package «project.basePackage».presenter'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/presenter/'''
		documentation = '''JSF/Faces presenter for managing entity «entity?.name?.toFirstUpper»'''

		content = withImports(template)
	}

	private def String getTemplate() '''
		import «project.basePackage».*
		import com.google.gson.annotations.Until
		import javax.annotation.Generated
		import org.slf4j.Logger
		
		«javaDocType»
		@«asImport('javax.enterprise.context.RequestScoped')»
		@«asImport('javax.inject.Named')»(value = 'presenter.«entity?.name?.toLowerCase»')
		class «fileName» extends AbstractPresenter {
		
			@«asImport('javax.inject.Inject')» «asImport(loggerType)» «loggerName»
		
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
		
				//bean.principal = principalService.update(bean.principal)
				//if (bean.principal != null) {
				//	facesContext.addMessage(null,
				//		new FacesMessage(FacesMessage.SEVERITY_INFO, 'Änderungen am Mitarbeiter wurden gespeichert!',
				//			'Änderungen am Mitarbeiter wurden gespeichert!'))
				//} else {
				//	facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, 'Fehler!', 'Fehler!'))
				//}
				'/mobile/«entity?.name?.toFirstLower».xhtml'
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
		
		}
	'''

}
