package templates._common.settings

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for Eclipse JDT prefs.
 */
class EclipseJdtCorePrefsTemplateBase extends AbstractTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileType = FileType.ECLIPSE_PREFS
		fileName = 'org.eclipse.jdt.core'
		relativPath = '/.settings/'
		documentation = 'Eclipse JDT prefs'
		skipStamping = true

		
	}

	override def String getTemplate() '''
		eclipse.preferences.version=1
		org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled
		org.eclipse.jdt.core.compiler.codegen.targetPlatform=«stubbr?.stubb?.environment?.runtime?.jvm.literal»
		org.eclipse.jdt.core.compiler.compliance=«stubbr?.stubb?.environment?.runtime?.jvm.literal»
		org.eclipse.jdt.core.compiler.problem.assertIdentifier=error
		org.eclipse.jdt.core.compiler.problem.enumIdentifier=error
		org.eclipse.jdt.core.compiler.problem.forbiddenReference=warning
		org.eclipse.jdt.core.compiler.source=«stubbr?.stubb?.environment?.runtime?.jvm.literal»
	'''

}
