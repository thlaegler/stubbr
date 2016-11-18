package templates.persistence.src_main_java.basepack.persistence.service

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for simple persistence service implementation for managing entity.
 */
class EntityServiceInterfaceXtendTemplate extends AbstractXtendTemplate {
	
	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»Service'''
		header = '''package «project.basePackage».service'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/service/'''
		documentation = '''Simple persistence service for managing entity «entity?.name?.toFirstUpper».'''

		content = withImports(template)
	}

	private def String getTemplate() '''
		import «project.basePackage».*
		import «stubbr?.stubb?.packageName».model.entity.«entity?.name.toFirstUpper»
		import org.slf4j.Logger
		import org.slf4j.LoggerFactory
		import javax.ejb.Stateless
		import javax.inject.Inject
		import java.util.LinkedList
		import java.util.List
		import java.util.stream.Collectors
		
		«javaDocType»
		@«asImport('javax.ejb.Stateless')»
		interface «fileName» {
		
			/**
			 * Persist entity «entity?.name.toFirstUpper».
			 *
			 * @param «entity?.name.toFirstLower» the entity to be persisted
			 * @return the persisted entity
			 */
			public def «entity?.name.toFirstUpper» persist(«entity?.name.toFirstUpper» «entity?.name.toFirstLower»)
		
			/**
			 * Update entity «entity?.name.toFirstUpper».
			 *
			 * @param «entity?.name.toFirstLower» the entity to be updated
			 * @return the persisted entity
			 */
			public def «entity?.name.toFirstUpper» update(«entity?.name.toFirstUpper» «entity?.name.toFirstLower»)
		
			/**
			 * Get all of entity «entity?.name?.toFirstUpper».
			 *
			 * @return the list of entities
			 */
			public def List<«entity?.name.toFirstUpper»> findAll()
		
			/**
			 * Get entity «entity?.name.toFirstLower» by ID.
			 *
			 * @param id the ID of the entity to find
			 * @return the entity
			 */
			public def «entity?.name.toFirstUpper» findById(«asImport(entityIdType)» id)
		
			/**
			 * Remove entity «entity?.name.toFirstUpper» by ID.
			 *
			 * @param id the ID of the entity to be removed
			 */
			public def void remove(«asImport(entityIdType)» id)
		
		}
	'''

}
