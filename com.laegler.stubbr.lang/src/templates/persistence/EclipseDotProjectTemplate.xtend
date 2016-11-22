package templates.persistence

import com.laegler.stubbr.lang.genmodel.Project
import templates._common.EclipseDotProjectTemplateBase
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for Eclipse project file for persistence project.
 */
class EclipseDotProjectTemplate extends EclipseDotProjectTemplateBase {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		documentation = 'Eclipse project file for persistence project'

		
	}

	override def String getTemplate() '''
		<name>«project.name»</name>
		<comment>«documentation»</comment>
		<projects>
		</projects>
		<name>«project.name»</name>
		<comment></comment>
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
			<buildCommand>
				<name>org.hibernate.eclipse.console.hibernateBuilder</name>
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
			<nature>org.hibernate.eclipse.console.hibernateNature</nature>
		</natures>
	'''

}
