package templates.faces.src_main_java.basepack.faces.presenter

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.View
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for JSF/Faces presenter for view.
 */
class ViewPresenterXtendTemplate extends AbstractXtendTemplate {

	private View view

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, View view) {
		super(stubbr, project)
		this.view = view
		fileName = '''«view?.name?.toFirstUpper»Presenter'''
		header = '''package «project.basePackage».presenter'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/presenter/'''
		documentation = '''JSF/Faces presenter for view «view?.name?.toFirstUpper»'''

		content = withImports(template)
	}

	private def String getTemplate() '''
		import «project.basePackage».*
		«IF !view?.assocEntities.isNullOrEmpty»
			import «stubbr?.stubb?.packageName».persistence.service.«view?.assocEntities?.get(0)?.name?.toFirstUpper»Service
		«ENDIF»
		import com.google.gson.annotations.Until
		import javax.annotation.Generated
		import javax.annotation.PostConstruct
		import javax.annotation.security.PermitAll
		import javax.inject.Inject
		import org.slf4j.Logger
		
		«javaDocType»
		class «fileName» extends AbstractPresenter {
		
			@Inject Logger «loggerName»
		
			@PostConstruct
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
			@PermitAll
			def String submitSave() {
				val long id = getHttpPostParam(HttpPostParam.ID)
				«loggerName».info('submitSave(id={}) called.', id)
		
				//bean.principal = principalService.update(bean.principal)
				//if (bean.principal != null) {
				//	facesContext.addMessage(null,
				//		new FacesMessage(FacesMessage.SEVERITY_INFO, 'Änderungen am Mitarbeiter wurden gespeichert!',
				//			'Änderungen am Mitarbeiter wurden gespeichert!'))
				//} else {
				//	facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, 'Fehler!', 'Fehler!'))
				//}
				'/mobile/«view?.name?.toFirstLower».xhtml'
			}
		
			/**
			 * 
			 * @return
			 */
			def String goToDetails(long id) {
				«loggerName».info('managementGoToPrincipalDetails(id={}) called.', id)
				''
				//bean.principal = principalService.find(id)
				//initPrincipal
		
				//getOutcomePage('management-principal-details')
			}
		
		}
	'''

}
