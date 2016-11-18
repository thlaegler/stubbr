package templates.faces.src_main_java.basepack.faces.presenter

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import templates.AbstractXtendTemplate

/**
 * File template for abstract JSF/Faces presenter for all presenters.
 */
class AbstractPresenterXtendTemplate extends AbstractXtendTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'AbstractPresenter'
		header = '''package «project?.basePackage».presenter'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/presenter/'''
		documentation = 'Abstract JSF/Faces presenter for all presenters'

		content = withImports(template)
	}

	private def String getTemplate() '''
		import «project?.basePackage».*
		import «stubbr?.stubb?.packageName».business.config.Severity
		import java.text.MessageFormat
		import java.util.Map
		import java.util.ResourceBundle
		import javax.annotation.PostConstruct
		import javax.annotation.security.PermitAll
		import javax.faces.application.FacesMessage
		import javax.faces.application.FacesMessage.Severity
		import javax.faces.context.FacesContext
		import javax.faces.event.ComponentSystemEvent
		import javax.inject.Inject
		import javax.servlet.http.HttpServletRequest
		import org.joda.time.DateTime
		import org.apache.commons.lang.exception.ExceptionUtils
		
		«javaDocType»
		abstract class AbstractPresenter {
		
			@«asImport('javax.inject.Inject')»
			protected «asImport(loggerType)» «loggerName»
		
			@«asImport('javax.inject.Inject')»
			protected «asImport(stubbr?.stubb?.packageName + '.business.config.Config')» config
		
			@«asImport('javax.inject.Inject')»
			protected «asImport('org.jboss.security.SecurityContext')» securityContext
		
			@PostConstruct
			def abstract void init()
		
			def abstract void initView()
		
			def abstract «asImport(project?.basePackage + '.bean.AbstractViewBean')» getBean()
		
			def void onViewLoad(ComponentSystemEvent event) {
				initView
			}
		
			protected def String getRequestIp() {
				val «asImport('javax.servlet.http.HttpServletRequest')» httpServletRequest = facesContext.externalContext.request as HttpServletRequest
				return httpServletRequest.remoteAddr
			}
		
			/**
			 * 
			 * @param page
			 * @return
			 */
			protected def String getOutcomePage(String page, RoleType roleType, boolean isMobileDevice) {
				if (isMobileDevice) {
					'pm:pg-' + page + '?transition=slide'
				} else {
					Config.PATH_DESKTOP + '/' + roleType.typeName + '/' + page + '.xhtml'
				}
			}
		
			/**
			 * 
			 */
			protected def String getOutcomePage(String page) {
				getOutcomePage(page, securityContext.getRoleType(), securityContext.isMobileDevice)
			}
		
			protected def void handleException(Throwable e) {
				var String summary = 'Schwerer Technischer Fehler um ' + DateTime.now.toString
				var String detail = 'Schwerer Technischer Fehler um ' + DateTime.now.toString
		
				if (securityContext.roleManagmenet || securityContext.roleAdmin) {
					val String stackTrace = ExceptionUtils.getStackTrace(e)
					summary = 'Schwerer Technischer Fehler um ' + DateTime.now.toString + '. Diese Exception ist geflogen: ' +
						stackTrace
					detail = 'Schwerer Technischer Fehler um ' + DateTime.now.toString
				}
		
				«loggerName».error('handleException() with {}', e)
				val FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail)
				facesContext.addMessage('growl', message)
			}
		
			protected def void handleStatus(CQResult response) {
				if (response.status.isMessage) {
					val Severity severity = getSeverity(response.status.severity)
					var String summary = getString(response.status.resourceKey + '.summary', response.params)
					var String detail = getString(response.status.resourceKey + '.detail', response.params)
					val FacesMessage message = new FacesMessage(severity, summary, detail)
					facesContext.addMessage('growl', message)
				} else {
					// Exitseite
				}
			}
		
			/**
			 * 
			 * @return
			 */
			protected def String getClientIp() {
				«loggerName».trace('getClientIp() called.')
				val HttpServletRequest request = FacesContext.currentInstance.externalContext.request as HttpServletRequest
				var String ipAddress = request.getHeader('X-FORWARDED-FOR')
				if (ipAddress == null) {
					ipAddress = request.remoteAddr
				}
				return ipAddress
			}
		
			protected def String getString(String key) {
				getString(key, null)
			}
		
			protected def String getString(String key, Map<String, String> params) {
				var String _string = ''
				try {
					_string = resourceBundle.getString(key)
				} catch (Exception e1) {
					«loggerName».warn('Resource-Key not found: {}', key)
					try {
						_string = messageBundle.getString(key)
					} catch (Exception e2) {
						«loggerName».error('Message-Key not found: {}', key)
						return '???' + key + '???'
					}
				}
		
				if (_string == null || _string.isEmpty || _string.startsWith('???')) {
					if (params != null && !params.isEmpty) {
						return MessageFormat.format(_string, params);
					}
				}
				return _string;
			}
		
			/**
			 * 
			 */
			protected def ResourceBundle getResourceBundle() {
				val String bundleName = config.getResourceBundleName
				return ResourceBundle.getBundle(bundleName, securityContext.locale)
			}
		
			/**
			 * 
			 */
			protected def ResourceBundle getMessageBundle() {
				val String bundleName = config.getMessageBundleName
				return ResourceBundle.getBundle(bundleName, securityContext.locale)
			}
		
			/**
			 * @return the facesContext
			 */
			protected def FacesContext getFacesContext() {
				FacesContext.currentInstance
			}
		
			/**
			 * 
			 */
			private def Severity getSeverity(CQSeverity severity) {
				switch (severity) {
					case MESSAGE: return FacesMessage.SEVERITY_INFO
					case INFO: return FacesMessage.SEVERITY_INFO
					case WARNING: return FacesMessage.SEVERITY_WARN
					case ERROR: return FacesMessage.SEVERITY_ERROR
				}
			}
		
		//	public def void onViewLoad(ComponentSystemEvent event) {
		//		initView
		//		if (!'admin'.equals(facesContext.getExternalContext().getSessionMap().get('role'))) {
		//
		//			val ConfigurableNavigationHandler nav = facesContext.getApplication().
		//				getNavigationHandler() as ConfigurableNavigationHandler;
		//
		//			nav.performNavigation('access-denied');
		//		}
		//	}
			/**
			 * 
			 * @return
			 */
			@PermitAll
			protected def long getHttpPostParam(String paramName) throws «asImport('java.lang.RuntimeException')» {
				val long paramId = 0;
		
				val String paramIdString = getFacesContext().externalContext.requestParameterMap.get(paramName);
				if (paramIdString != null && !paramIdString.isEmpty() && !paramIdString.equals('null')) {
					try {
						return Long.parseLong(paramIdString);
					} catch (Throwable e) {
						throw new «asImport('java.lang.RuntimeException')»('parseHttpPostParamId(' + paramIdString + ') failed to parse given ID to long.',
							e);
					}
				}
				return paramId
			}
		
		}
	'''

}
