package templates._common

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Organization
import com.laegler.stubbr.lang.stubbrLang.Person
import templates.AbstractTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File Generator for github documentation (README.MD)
 */
class ReadmeMdTemplateBase extends AbstractTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileType = FileType.MD
		fileName = 'README'
		relativPath = '/'
		documentation = 'Github documentation (README.MD)'
		skipStamping = true

		content = template
	}

	private def String getTemplate() '''
		«project?.canonicalName»
				
		«stubbr?.stubb?.documentation»
		
		# Stakeholders
		## Organizations
		«FOR Organization organization : stubbr?.stubb?.stakeholders?.organizations»
			* «organization?.name»
		«ENDFOR»
		
		## Developers
		«FOR Person person : stubbr?.stubb?.stakeholders?.persons»
			* «person?.name»
		«ENDFOR»
	'''
}
