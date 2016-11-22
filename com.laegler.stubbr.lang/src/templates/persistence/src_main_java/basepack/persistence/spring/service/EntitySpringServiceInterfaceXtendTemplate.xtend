package templates.persistence.src_main_java.basepack.persistence.spring.service

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for SpringMVC-based persistence service implementation for managing entity.
 */
class EntitySpringServiceInterfaceXtendTemplate extends AbstractXtendTemplate {
	
	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»SpringService'''
		header = '''package «project.basePackage».spring.service'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/spring/service/'''
		documentation = '''SpringMVC-based persistence service for managing entity «entity?.name?.toFirstUpper»'''

		
	}

	override def String getTemplate() '''
		import «project.basePackage».*
		import «stubbr?.stubb?.packageName».model.entity.*
		import «stubbr?.stubb?.packageName».persistence.dto.«entity?.name.toFirstUpper»Dto
		import org.slf4j.Logger
		import org.slf4j.LoggerFactory
		«IF 'spring' != 'spring'»
			import org.springframework.transaction.annotation.Transactional
			import org.springframework.stereotype.Service
		«ENDIF»
		import javax.ejb.Stateless
		import javax.inject.Inject
		import java.util.LinkedList
		import java.util.List
		import java.util.stream.Collectors
		
		«javaDocType»
		«IF 'spring' != 'spring'»
			@Service
			@Transactional
		«ENDIF»
		@Stateless
		interface «fileName» {
		
			/**
			 * Save a «entity?.name.toFirstLower».
			 *
			 * @param «entity?.name.toFirstLower»Dto the entity to save
			 * @return the persisted entity
			 */
			public def «entity?.name.toFirstUpper»Dto save(«entity?.name.toFirstUpper»Dto «entity?.name.toFirstLower»Dto)
		
			/**
			 *  Get all the «entity?.name.toFirstLower»s.
			 *  
			 *  @return the list of entities
			 */
			«IF 'spring' != 'spring'»
				@Transactional(readOnly = true)
			«ENDIF»
			public def List<«entity?.name.toFirstUpper»Dto> findAll()
		
			/**
			 *  Get one «entity?.name.toFirstLower» by id.
			 *
			 *  @param id the id of the entity
			 *  @return the entity
			 */
			«IF 'spring' != 'spring'»
				@Transactional(readOnly = true)
			«ENDIF»
			public def «entity?.name.toFirstUpper»Dto findOne(Long id)
		
			/**
			 *  Delete the  «entity?.name.toFirstUpper» by id.
			 *
			 *  @param id the id of the entity
			 */
			public def void delete(Long id)
		
		}
	'''

}
