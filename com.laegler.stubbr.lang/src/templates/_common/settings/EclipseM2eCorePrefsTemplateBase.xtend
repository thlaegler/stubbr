package templates._common.settings

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for Eclipse Maven m2e prefs.
 */
class EclipseM2eCorePrefsTemplateBase extends AbstractTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileType = FileType.ECLIPSE_PREFS
		fileName = 'org.eclipse.m2e.core'
		relativPath = '/.settings/'
		documentation = 'Eclipse Maven m2e prefs'
		skipStamping = true

		content = template
	}

	private def String getTemplate() '''
		activeProfiles=
		eclipse.preferences.version=1
		resolveWorkspaceProjects=true
		version=1
	'''

}
