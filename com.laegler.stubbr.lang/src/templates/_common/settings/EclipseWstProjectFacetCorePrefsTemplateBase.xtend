package templates._common.settings

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for Eclipse WST project facet prefs (org.eclipse.wst.common.project.facet.core.prefs)
 */
class EclipseWstProjectFacetCorePrefsTemplateBase extends AbstractTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileType = FileType.ECLIPSE_PREFS
		fileName = 'org.eclipse.wst.common.project.facet.core'
		relativPath = '/.settings/'
		header = '<root>'
		footer = '</root>'
		documentation = 'Eclipse WST project facet prefs'
		skipStamping = true

		
	}

	override def String getTemplate() '''
		<facet id="jst.jaxrs">
			<node name="libprov">
				<attribute name="provider-id" value="runtime-library-provider"/>
			</node>
		</facet>
	'''

}
