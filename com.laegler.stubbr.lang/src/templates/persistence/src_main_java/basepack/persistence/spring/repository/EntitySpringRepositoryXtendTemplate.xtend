package templates.persistence.src_main_java.basepack.persistence.spring.repository

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for SpringMVC-based persistence repository for managing entity.
 */
class EntitySpringRepositoryXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»SpringRepository'''
		header = '''package «project.basePackage».spring.repository'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/spring/repository/'''
		documentation = '''SpringMVC-based persistence repository for managing entity «entity?.name?.toFirstUpper»'''

		
	}

	override def String getTemplate() '''
		import «project.basePackage».*
		import «stubbr?.stubb?.packageName».model.entity.*
		import org.springframework.data.jpa.repository.*
		import java.util.List
		
		«javaDocType»
		public interface «fileName» extends JpaRepository<«entity?.name.toFirstUpper», Long> {}
	'''

}
