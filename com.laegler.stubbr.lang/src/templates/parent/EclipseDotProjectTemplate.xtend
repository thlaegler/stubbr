package templates.parent

import com.laegler.stubbr.lang.genmodel.Project
import templates._common.EclipseDotProjectTemplateBase
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for Eclipse project file for parent project.
 */
class EclipseDotProjectTemplate extends EclipseDotProjectTemplateBase {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		documentation = 'Eclipse project file for parent project'
		
		content = template
	}

	private def String getTemplate() '''
		<name>«project.name»</name>
		<comment>«documentation»</comment>
		<projects>
		</projects>
		<buildSpec>
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
			<nature>org.jboss.tools.cdi.core.cdinature</nature>
		</natures>
	'''

}
