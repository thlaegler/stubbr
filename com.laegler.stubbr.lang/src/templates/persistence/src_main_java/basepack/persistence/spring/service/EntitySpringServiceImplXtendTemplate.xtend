package templates.persistence.src_main_java.basepack.persistence.spring.service

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for SpringMVC-based persistence service implementation for managing entity.
 */
class EntitySpringServiceImplXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»SpringServiceImpl'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/spring/service/'''
		header = '''package «project.basePackage».spring.service'''
		documentation = '''SpringMVC-based persistence service implementation for managing entity «entity?.name?.toFirstUpper»'''

		
	}

	override def String getTemplate() '''
		import «project.basePackage».*
		import «stubbr?.stubb?.packageName».model.entity.*
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
		class «fileName» implements «entity?.name?.toFirstUpper»SpringService {
		
		    @Inject
		    protected Logger log
		    
		    @Inject
		    protected «entity?.name.toFirstUpper»SpringRepository «entity?.name.toFirstLower»Repository
		
		    @Inject
		    protected «entity?.name.toFirstUpper»SpringMapper «entity?.name.toFirstLower»Mapper
		
			/**
			 * Create a custom persistence operation
			 */
			public def void customOperation() {
				// TODO
			}
		
		    /**
		     * Save a «entity?.name.toFirstLower».
		     *
		     * @param «entity?.name.toFirstLower»Dto the entity to save
		     * @return the persisted entity
		     */
		    override public «entity?.name.toFirstUpper»Dto save(«entity?.name.toFirstUpper»Dto «entity?.name.toFirstLower»Dto) {
		        log.debug('Request to save «entity?.name.toFirstUpper» : {}', «entity?.name.toFirstLower»Dto)
		        var «entity?.name.toFirstUpper» «entity?.name.toFirstLower» = «entity?.name.toFirstLower»Mapper.«entity?.name.toFirstLower»DtoTo«entity?.name.toFirstUpper»(«entity?.name.toFirstLower»Dto)
		        «entity?.name.toFirstLower» = «entity?.name.toFirstLower»Repository.save(«entity?.name.toFirstLower»)
		        «entity?.name.toFirstUpper»Dto result = «entity?.name.toFirstLower»Mapper.«entity?.name.toFirstLower»To«entity?.name.toFirstUpper»Dto(«entity?.name.toFirstLower»)
		        result
		    }
		
		    /**
		     *  Get all the «entity?.name.toFirstLower»s.
		     *  
		     *  @return the list of entities
		     */
		    @Transactional(readOnly = true) 
		    override public List<«entity?.name.toFirstUpper»Dto> findAll() {
		        log.debug('Request to get all «entity?.name.toFirstUpper»s')
		        val List<«entity?.name.toFirstUpper»Dto> result = «entity?.name.toFirstLower»Repository.findAll.stream
		            .map(«entity?.name.toFirstLower»Mapper::«entity?.name.toFirstLower»To«entity?.name.toFirstUpper»Dto)
		            .collect(Collectors.toCollection(LinkedList::new))
		
		        result
		    }
		
		    /**
		     *  Get one «entity?.name.toFirstLower» by id.
		     *
		     *  @param id the id of the entity
		     *  @return the entity
		     */
		    @Transactional(readOnly = true) 
		    override public «entity?.name.toFirstUpper»Dto findOne(Long id) {
		        log.debug('Request to get «entity?.name.toFirstUpper» : {}', id)
		        val «entity?.name.toFirstUpper» «entity?.name.toFirstLower» = «entity?.name.toFirstLower»Repository.findOne(id)
		        val «entity?.name.toFirstUpper»Dto «entity?.name.toFirstLower»Dto = «entity?.name.toFirstLower»Mapper.«entity?.name.toFirstLower»To«entity?.name.toFirstUpper»Dto(«entity?.name.toFirstLower»)
		        return «entity?.name.toFirstLower»Dto
		    }
		
		    /**
		     *  Delete the  «entity?.name.toFirstUpper» by id.
		     *
		     *  @param id the id of the entity
		     */
		    override public void delete(Long id) {
		        log.debug('Request to delete «entity?.name.toFirstUpper» : {}', id)
		        «entity?.name.toFirstLower»Repository.delete(id)
		    }
		}
	'''

}
