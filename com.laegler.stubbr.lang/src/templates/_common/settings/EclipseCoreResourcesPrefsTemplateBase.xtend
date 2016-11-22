package templates._common.settings

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for Eclipse Core resources prefs.
 */
class EclipseCoreResourcesPrefsTemplateBase extends AbstractTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileType = FileType.ECLIPSE_PREFS
		fileName = 'org.eclipse.core.resources'
		relativPath = '/.settings/'
		documentation = 'Eclipse Core resources prefs'
		skipStamping = true

		
	}

	override def String getTemplate() '''
		eclipse.preferences.version=1
		encoding//src/main/java=UTF-8
		encoding//src-gen/main/java=UTF-8
		encoding//src/main/xtend-gen=UTF-8
		encoding//src/main/resources=UTF-8
		encoding//src/test/java=UTF-8
		encoding//src-gen/test/java=UTF-8
		encoding//src/test/xtend-gen=UTF-8
		encoding//src/test/resources=UTF-8
		encoding/<project>=UTF-8
	'''

}
