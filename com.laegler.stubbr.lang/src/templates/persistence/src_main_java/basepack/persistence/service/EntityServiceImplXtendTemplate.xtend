package templates.persistence.src_main_java.basepack.persistence.service

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for simple persistence service implementation for managing entity.
 */
class EntityServiceImplXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»ServiceImpl'''
		header = '''package «project.basePackage».service'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/service/'''
		documentation = '''Simple persistence service implementation for managing entity «entity?.name?.toFirstUpper».'''

		content = withImports(template)
	}

	private def String getTemplate() '''
		import «project.basePackage».*
		import «stubbr?.stubb?.packageName».model.entity.*
		import java.util.List
		
		«javaDocType»
		@«asImport('javax.ejb.Stateless')»
		@«asImport('javax.annotation.security.PermitAll')»
		@«asImport('javax.ejb.Local')»
		class «fileName» implements «entity?.name?.toFirstUpper»Service {
		
			@«asImport('javax.inject.Inject')»
			«asImport('org.slf4j.Logger')» «loggerName»
			
			@«asImport('javax.persistence.PersistenceContext')»(unitName = 'unitName')
			«asImport('javax.persistence.EntityManager')» em
		
			/**
			 * Persist entity «entity?.name?.toFirstUpper».
			 *
			 * @param «entity?.name?.toFirstLower» the entity to be persisted.
			 * @return the persisted entity
			 */
			override public «entity?.name?.toFirstUpper» persist(«entity?.name?.toFirstUpper» «entity?.name?.toFirstLower») {
				«loggerName».debug('Try to persist entity «entity?.name?.toFirstUpper» : {}', «entity?.name?.toFirstLower»)
				
				if («entity?.name?.toFirstLower» != null) {
					try {
						//em.transaction.begin
						em.persist(«entity?.name?.toFirstLower»)
						//em.transaction.commit
						em.flush
						«loggerName».info('persist(entity={}) Entity «entity?.name?.toFirstUpper» persisted.', «entity?.name?.toFirstLower»)
						return findById(«entity?.name?.toFirstLower».id)
					} catch (Exception e) {
						«loggerName».error('persist(entity={}) Failed to persist entity «entity?.name?.toFirstUpper».', «entity?.name?.toFirstLower», e)
						return null
					}
				}
				
				«loggerName».warn('persist(entity={}) Cannot persist null entity')
				return null
			}
			
			/**
			 * Update entity «entity?.name?.toFirstUpper».
			 *
			 * @param «entity?.name?.toFirstLower» the entity to be updated.
			 * @return the updated entity
			 */
			override public «entity?.name?.toFirstUpper» update(«entity?.name?.toFirstUpper» «entity?.name?.toFirstLower») {
				«loggerName».debug('update(entity={}) Try to update entity «entity?.name?.toFirstUpper» : {}', «entity?.name?.toFirstLower»)
				
				if («entity?.name?.toFirstLower» != null) {
					try {
						//em.transaction.begin
						em.persist(«entity?.name?.toFirstLower»)
						//em.transaction.commit
						em.flush
						«loggerName».info('update(entity={}) Entity «entity?.name?.toFirstUpper» updated.', «entity?.name?.toFirstLower»)
						return findById(«entity?.name?.toFirstLower».id)
					} catch (Exception e) {
						«loggerName».error('update(entity={}) Failed to update entity «entity?.name?.toFirstUpper».', «entity?.name?.toFirstLower», e)
						return null
					}
				}
				
				«loggerName».warn('update(entity={}) Cannot update null entity')
				return null
			}
		
			/**
			 * Get all of entity «entity?.name?.toFirstUpper».
			 *
			 * @return the list of all entities
			 */
			override public «asImport('java.util.List')»<«entity?.name?.toFirstUpper»> findAll() {
				«loggerName».debug('findAll() Try to get all of entity «entity?.name?.toFirstUpper».')
				
				try {
					val «asImport('javax.persistence.Query')» query = em.createNamedQuery('«entity?.name?.toFirstUpper».findAll')
					val «asImport('java.util.List')»<«entity?.name?.toFirstUpper»> result = query.resultList
					«loggerName».info('findAll() Got all of entity «entity?.name?.toFirstUpper».')
					return result
				} catch (Exception e) {
					«loggerName».error('findAll() Failed to get all of entity «entity?.name?.toFirstUpper».', e)
					return «asImport('java.util.Collections')».emptyList
				}
			}
		
			/**
			 * Get entity «entity?.name?.toFirstUpper» by ID.
			 *
			 * @param id the ID of the entity to find
			 * @return the entity
			 */
			override public «entity?.name?.toFirstUpper» findById(«asImport(entityIdType)» id) {
				«loggerName».debug('findById(id={}) Try to get entity by ID.', id)
				
				//val String queryString = 'SELECT e FROM «entity?.name?.toLowerCase» e WHERE e.id = :id'
					
				try {
					//val TypedQuery<«entity?.name?.toFirstUpper»> query = em.createNamedQuery(«entity?.name?.toFirstUpper».findById, «entity?.name?.toFirstUpper»)
					//query.setParameter('id', id);
					//val «entity?.name?.toFirstUpper» «entity?.name?.toFirstLower» = query.singleResult
					val «entity?.name?.toFirstUpper» «entity?.name?.toFirstLower» = em.find(«entity?.name?.toFirstUpper», id);
					«loggerName».info('findById(id={}) Got entity by ID.', id)
					return «entity?.name?.toFirstLower»
				} catch (Exception e) {
					«loggerName».error('findById(id={}) Failed to get entity by ID.', id)
					return null
				}
			}
		
			/**
			 * Remove entity «entity?.name?.toFirstUpper» by ID.
			 *
			 * @param id the ID of the entity to be removed
			 */
			override public void remove(«asImport(entityIdType)» id) {
				«loggerName».debug('remove(id={}) Try to remove entity by ID {}.', id, id)
				
				try {
					val «entity?.name?.toFirstUpper» «entity?.name?.toFirstLower» = findById(id)
					em.remove(«entity?.name?.toFirstLower»)
					«loggerName».info('remove(id={}) Removed entity by ID {}.', id, id)
				} catch (Exception e) {
					«loggerName».error('remove(id={}) Failed to remove entity by ID {}.', id, id)
				}
			}
		}
	'''

}
