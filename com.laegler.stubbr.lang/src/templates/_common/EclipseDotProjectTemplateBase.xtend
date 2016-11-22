package templates._common

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import templates.AbstractTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for Eclipse project file.
 */
class EclipseDotProjectTemplateBase extends AbstractTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileType = FileType.ECLIPSE_PROJECT
		fileName = ''
		relativPath = '/'
		header = '''
			<?xml version="1.0" encoding="UTF-8"?>
			<projectDescription>
		'''
		footer = '</projectDescription>'
		documentation = 'Eclipse project file'
		skipStamping = true

		
	}

	override def String getTemplate() '''
		<name>«project.name»</name>
		<comment>«documentation»</comment>
		<projects>
		</projects>
		<buildSpec>
			<buildCommand>
				<name>org.eclipse.xtext.ui.shared.xtextBuilder</name>
				<arguments>
				</arguments>
			</buildCommand>
			<buildCommand>
				<name>org.eclipse.wst.common.project.facet.core.builder</name>
				<arguments>
				</arguments>
			</buildCommand>
			<buildCommand>
				<name>org.eclipse.jdt.core.javabuilder</name>
				<arguments>
				</arguments>
			</buildCommand>
			<buildCommand>
				<name>org.jboss.tools.cdi.core.cdibuilder</name>
				<arguments>
				</arguments>
			</buildCommand>
			<buildCommand>
				<name>org.eclipse.wst.validation.validationbuilder</name>
				<arguments>
				</arguments>
			</buildCommand>
			<buildCommand>
				<name>org.eclipse.m2e.core.maven2Builder</name>
				<arguments>
				</arguments>
			</buildCommand>
		</buildSpec>
		<natures>
			<nature>org.eclipse.wst.common.modulecore.ModuleCoreNature</nature>
			<nature>org.eclipse.jdt.core.javanature</nature>
			<nature>org.eclipse.m2e.core.maven2Nature</nature>
			<nature>org.eclipse.wst.common.project.facet.core.nature</nature>
			<nature>org.jboss.tools.cdi.core.cdinature</nature>
			<nature>org.eclipse.xtext.ui.shared.xtextNature</nature>
			<nature>org.jboss.tools.ws.jaxrs.nature</nature>
		</natures>
	'''

}
