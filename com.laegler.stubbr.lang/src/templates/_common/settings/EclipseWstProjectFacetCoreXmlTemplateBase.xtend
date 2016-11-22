package templates._common.settings

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractXmlTemplate

/**
 * File template for Eclipse WST project facet prefs xml (org.eclipse.wst.common.project.facet.core.xml).
 */
class EclipseWstProjectFacetCoreXmlTemplateBase extends AbstractXmlTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'org.eclipse.wst.common.project.facet.core'
		relativPath = '/.settings/'
		header = '''
			<?xml version="1.0" encoding="UTF-8"?>
			<faceted-project>
		'''
		footer = '</faceted-project>'
		documentation = 'Eclipse WST project facet prefs xml'
		skipStamping = true

		
	}

	override def String getTemplate() '''
		<fixed facet="wst.jsdt.web"/>
		<!-- <runtime name="WildFly 10.x Runtime"/> -->
		<installed facet="jboss.m2" version="1.0"/>
		<installed facet="wst.jsdt.web" version="1.0"/>
		<installed facet="java" version="«stubbr?.stubb?.environment?.runtime?.jvm.literal»"/>
		<installed facet="jst.cdi" version="1.2"/>
		<installed facet="jst.web" version="3.0"/>
		<installed facet="jbossws.core" version="3.0"/>
		<installed facet="jst.jaxrs" version="1.1"/>
		<!-- <installed facet="jpt.jpa" version="2.1"/> -->
		<!-- <installed facet="jst.ejb" version="3.1"/> -->
	'''

}
