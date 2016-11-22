package templates.persistence.src_main_java.basepack.persistence.spring.dto

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import com.laegler.stubbr.lang.stubbrLang.Attribute
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for SpringMVC-based DTO for managing entity.
 */
class EntitySpringDtoXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»SpringDto'''
		header = '''package «project.basePackage».spring.dto'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/spring/dto/'''
		documentation = '''SpringMVC-based DTO for managing entity «entity?.name?.toFirstUpper»'''

		
	}

	override def String getTemplate() '''
		import «project.basePackage».*
		import «stubbr?.stubb?.packageName».model.entity.*
		import org.eclipse.xtend.lib.annotations.Accessors
		import java.util.List
		
		«javaDocType»
		@Accessors
		class «fileName» {
		
			«FOR Attribute attribute : entity.attributes»
				/**
				 * «attribute?.documentation»
				 */
				«IF attribute?.javaType != null»«attribute?.javaType?.qualifiedName»«ELSE»«attribute?.type?.name»«ENDIF» «attribute?.name?.toFirstLower»
			«ENDFOR»
		
		}
	'''

}
