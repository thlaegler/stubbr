package templates.business.src_main_java_basepack.business.config

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import templates.AbstractXtendTemplate

/**
 * File template for general configuration.
 */
class ConfigXtendTemplate extends AbstractXtendTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'Config'
		header = '''package «project.basePackage».config'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/config/'''
		documentation = 'General configuration'
	}

	override def String getTemplate() '''
		import «project.basePackage».*
		import java.io.Serializable
		import javax.enterprise.context.ApplicationScoped
		import javax.ejb.Stateless
		import javax.annotation.security.PermitAll
		import javax.inject.Inject
		import org.slf4j.Logger
		import java.util.ResourceBundle
		import java.util.Locale
		
		«javaDocType»
		@PermitAll
		@Stateless(name='config')
		@ApplicationScoped
		class «fileName» {
		
			@Inject
			Logger logger
			
			// Paths and path-fragments
			public static final String DEVICE_MOBILE = 'mobile'
			public static final String DEVICE_DESKTOP = 'desktop'
		
			public static final String PATH_MOBILE = '/mobile'
			public static final String PATH_DESKTOP = '/desktop'
		
			// Faces
			public static final String CLIENT_ID_FORM_BASE_SERVICE_DETAILS = 'formEmployeeBaseServiceDetails'
		
			// Patterns
			public static final String PATTERN_MOBILE_1 = '(?i).*((android|bb\\d+|meego).+mobile|avantgo|bada\\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|iris|kindle|lge |maemo|midp|mmp|mobile.+firefox|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\\.(browser|link)|vodafone|wap|windows ce|xda|xiino).*'
			public static final String PATTERN_MOBILE_2 = '(?i)1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\\-(n|u)|c55\\/|capi|ccwa|cdm\\-|cell|chtm|cldc|cmd\\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\\-s|devi|dica|dmob|do(c|p)o|ds(12|\\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\\-|_)|g1 u|g560|gene|gf\\-5|g\\-mo|go(\\.w|od)|gr(ad|un)|haie|hcit|hd\\-(m|p|t)|hei\\-|hi(pt|ta)|hp( i|ip)|hs\\-c|ht(c(\\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\\-(20|go|ma)|i230|iac( |\\-|\\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\\/)|klon|kpt |kwc\\-|kyo(c|k)|le(no|xi)|lg( g|\\/(k|l|u)|50|54|\\-[a-w])|libw|lynx|m1\\-w|m3ga|m50\\/|ma(te|ui|xo)|mc(01|21|ca)|m\\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\\-2|po(ck|rt|se)|prox|psio|pt\\-g|qa\\-a|qc(07|12|21|32|60|\\-[2-7]|i\\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\\-|oo|p\\-)|sdk\\/|se(c(\\-|0|1)|47|mc|nd|ri)|sgh\\-|shar|sie(\\-|m)|sk\\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\\-|v\\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\\-|tdg\\-|tel(i|m)|tim\\-|t\\-mo|to(pl|sh)|ts(70|m\\-|m3|m5)|tx\\-9|up(\\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\\-|your|zeto|zte\\-'
			
		
			def String getOAuthClientId() {
				getConfigString('oauth.client_id')
			}
		
			def String getOAuthClientSecret() {
				getConfigString('oauth.client_secret')
			}
		
			def String getOAuthUsername() {
				getConfigString('oauth.username')
			}
		
			def String getOAuthPassword() {
				getConfigString('oauth.password')
			}
		
			def String getEmailBooking() {
				getConfigString('email.booking')
			}
		
			def String getEmailReplyTo() {
				getConfigString('email.replyTo')
			}
			
			def String getEmailAdmin() {
				getConfigString('email.admin')
			}
		
			def String getResourceBundleName() {
				getConfigString('faces.bundle.resource')
			}
		
			def String getMessageBundleName() {
				getConfigString('faces.bundle.message')
			}
		
			/**
			 * First check environment variable:
			 * SET UPLOAD_LOCATION=/path/to/uploads
			 * 
			 * then check VM argument
			 * -Dupload.location='/path/to/uploads'
			 * 
			 * Default to 'Default'
			 */
			private def String getConfigString(String key) {
				logger.trace('getConfigString(key={})', key)
				
				var Environment environment
				
				var String environmentName = System.getenv('_ENV_NAME');
				if (environmentName == null || environmentName.empty) {
					environmentName = System.getProperty('env.name');
				}
				
				if(environmentName == null || environmentName.empty) {
					environment = Environment.DEFAULT
				} else {
					environment = Environment.valueOf(environmentName)
				}
				if(environment == null) {
					logger.warn(
						'Unknown Environment: \'{}\'. Using DEFAULT_CONFIG. Set Environment Variable _ENV_NAME via \'-Dcq.env.name=\'STAGE\'\' or \'SET _ENV_NAME=STAGE\'.', environmentName)
				}
		
				if (environment == null) {
					logger.warn(
						'Environment Variable not found. Using DEFAULT_CONFIG. Set Environment Variable _ENV_NAME via \'-Dcq.env.name=\'STAGE\'\' or \'SET _ENV_NAME=STAGE\'.')
				}
		
				// TEST, STAGE, PROD, LOCAL, DEFAULT
				val String configResourceName = '«project.basePackage».config.' + environment.name
				val ResourceBundle bundle = ResourceBundle.getBundle(configResourceName, Locale.ROOT)
				bundle.getString(key)
			}
		}
	'''

}
