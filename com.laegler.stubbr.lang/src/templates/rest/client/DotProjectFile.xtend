package templates.rest.client

import com.laegler.stubbr.lang.generator.repository.ProjectType

/**
 * File Generator for .classpath
 */
class DotProjectFile extends templates._common.DotProjectFile {

	override public getTemplateName() '''«this.class.name»'''
	
	override public ProjectType getProject() { ProjectType.REST_CLIENT }

	override public getTemplate() '''
		«header»
			<name>«projectName»</name>
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
		«footer»
	'''

}
