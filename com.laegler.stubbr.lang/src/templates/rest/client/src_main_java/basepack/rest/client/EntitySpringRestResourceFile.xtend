package templates.rest.client.src_main_java.basepack.rest.client

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.stubbrLang.Entity
import javax.inject.Inject
import com.laegler.stubbr.lang.generator.template.XtendTemplateFile
import com.laegler.stubbr.lang.generator.repository.ProjectType

/**
 * File Generator for Spring REST controller for managing entity
 */
class EntitySpringRestResourceFile extends XtendTemplateFile<Entity> {

	@Inject extension StubbrRegistry

	override public String getDocumentation() '''The Spring REST controller for managing entity «element?.name?.toFirstUpper»'''

	override public String getTemplateName() '''«this.class.name»'''

	override public String getFileName() '''«element?.name?.toFirstUpper»RestResource'''
	
	override public ProjectType getProject() { ProjectType.REST_CLIENT }

	override public String getPath() '''«super.path»/src/main/java/«stubb?.packageName?.toPath»/rest/resource/'''

	override public String getTemplate() '''
		package «stubb.packageName».rest.resource
		
		import com.google.gson.annotations.Until
		import com.codahale.metrics.annotation.Timed
		import «stubb.packageName».model.entity.«element?.name?.toFirstUpper»
		
		import «stubb.packageName».persistence.repository.«element?.name?.toFirstUpper»Repository
		import «stubb.packageName».rest.util.HeaderUtil
		import «stubb.packageName».rest.util.PaginationUtil
		import «stubb.packageName».persistence.dto.«element?.name?.toFirstUpper»DTO
		import «stubb.packageName».persistence.mapper.«element?.name?.toFirstUpper»Mapper
		import org.slf4j.Logger
		«IF 'spring' != 'spring'»
			import com.codahale.metrics.annotation.Timed
			import org.springframework.data.domain.Page
			import org.springframework.data.domain.Pageable
			import org.springframework.http.HttpHeaders
			import org.springframework.http.HttpStatus
			import org.springframework.http.MediaType
			import org.springframework.http.ResponseEntity
			import org.springframework.web.bind.annotation.*
		«ELSE»
			import javax.ws.rs.POST
			import javax.ws.rs.PUT
			import javax.ws.rs.GET
			import javax.ws.rs.DELETE
			import javax.ws.rs.Path
			import javax.ws.rs.Produces
			import javax.ws.rs.core.MediaType
		«ENDIF»
		
		import javax.inject.Inject
		import java.net.URI
		import java.net.URISyntaxException
		import java.util.LinkedList
		import java.util.List
		import java.util.Optional
		import java.util.stream.Collectors
		
		«javaDocType»
		«IF 'spring' != 'spring'»
			@RestController
			@RequestMapping('/api')
		«ENDIF»
		public class «fileName» {
		
			@Inject
			Logger log
				
			@Inject
			«element?.name?.toFirstUpper»Repository «element?.name?.toFirstLower»Repository
		
			@Inject
			«element?.name?.toFirstUpper»Mapper «element?.name?.toFirstLower»Mapper
		
			/**
			 * POST  /«element?.name?.toFirstLower»s : Create a new «element?.name?.toFirstLower».
			 *
			 * @param «element?.name?.toFirstLower»DTO the «element?.name?.toFirstLower»DTO to create
			 * @return the ResponseEntity with status 201 (Created) and with body the new «element?.name?.toFirstLower»DTO, or with status 400 (Bad Request) if the «element?.name?.toFirstLower» has already an ID
			 * @throws URISyntaxException if the Location URI syntax is incorrect
			 */
			«IF 'spring' != 'spring'»
				@RequestMapping(value = '/«element?.name?.toFirstLower»s',
					method = RequestMethod.POST,
					produces = MediaType.APPLICATION_JSON_VALUE)
				@Timed
			«ELSE»
				@POST
				@Path('/«element?.name?.toFirstLower»s')
				@Produces(MediaType.APPLICATION_JSON)
			«ENDIF»
			public def ResponseEntity<«element?.name?.toFirstUpper»DTO> create«element?.name?.toFirstUpper»(@RequestBody «element?.name?.toFirstUpper»DTO «element?.name?.toFirstLower»DTO) throws URISyntaxException {
				log.debug('REST request to save «element?.name?.toFirstUpper» : {}', «element?.name?.toFirstLower»DTO)
				if («element?.name?.toFirstLower»DTO.id != null) {
					return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert('«element?.name?.toFirstLower»', 'idexists', 'A new «element?.name?.toFirstLower» cannot already have an ID')).body(null)
				}
				var «element?.name?.toFirstUpper» «element?.name?.toFirstLower» = «element?.name?.toFirstLower»Mapper.«element?.name?.toFirstLower»DTOTo«element?.name?.toFirstUpper»(«element?.name?.toFirstLower»DTO)
				«element?.name?.toFirstLower» = «element?.name?.toFirstLower»Repository.save(«element?.name?.toFirstLower»)
				val «element?.name?.toFirstUpper»DTO result = «element?.name?.toFirstLower»Mapper.«element?.name?.toFirstLower»To«element?.name?.toFirstUpper»DTO(«element?.name?.toFirstLower»)
				return ResponseEntity.created(new URI('/api/«element?.name?.toFirstLower»s/' + result.id))
					.headers(HeaderUtil.createEntityCreationAlert('«element?.name?.toFirstLower»', result.id.toString))
					.body(result);
			}
		
			/**
			 * PUT  /«element?.name?.toFirstLower»s : Updates an existing «element?.name?.toFirstLower».
			 *
			 * @param «element?.name?.toFirstLower»DTO the «element?.name?.toFirstLower»DTO to update
			 * @return the ResponseEntity with status 200 (OK) and with body the updated «element?.name?.toFirstLower»DTO,
			 * or with status 400 (Bad Request) if the «element?.name?.toFirstLower»DTO is not valid,
			 * or with status 500 (Internal Server Error) if the «element?.name?.toFirstLower»DTO couldnt be updated
			 * @throws URISyntaxException if the Location URI syntax is incorrect
			 */
			«IF 'spring' != 'spring'»
				@RequestMapping(value = '/«element?.name?.toFirstLower»s',
					method = RequestMethod.PUT,
					produces = MediaType.APPLICATION_JSON_VALUE)
				@Timed
			«ELSE»
				@PUT
				@Path('/«element?.name?.toFirstLower»s')
				@Produces(MediaType.APPLICATION_JSON)
			«ENDIF»
			public def ResponseEntity<«element?.name?.toFirstUpper»DTO> update«element?.name?.toFirstUpper»(@RequestBody «element?.name?.toFirstUpper»DTO «element?.name?.toFirstLower»DTO) throws URISyntaxException {
				log.debug('REST request to update «element?.name?.toFirstUpper» : {}', «element?.name?.toFirstLower»DTO)
				if («element?.name?.toFirstLower»DTO.getId() == null) {
					return create«element?.name?.toFirstUpper»(«element?.name?.toFirstLower»DTO);
				}
				var «element?.name?.toFirstUpper» «element?.name?.toFirstLower» = «element?.name?.toFirstLower»Mapper.«element?.name?.toFirstLower»DTOTo«element?.name?.toFirstUpper»(«element?.name?.toFirstLower»DTO);
				«element?.name?.toFirstLower» = «element?.name?.toFirstLower»Repository.save(«element?.name?.toFirstLower»)
				val «element?.name?.toFirstUpper»DTO result = «element?.name?.toFirstLower»Mapper.«element?.name?.toFirstLower»To«element?.name?.toFirstUpper»DTO(«element?.name?.toFirstLower»)
				return ResponseEntity.ok
					.headers(HeaderUtil.createEntityUpdateAlert('«element?.name?.toFirstLower»', «element?.name?.toFirstLower»DTO.id.toString))
					.body(result)
			}
		
			/**
			 * GET  /«element?.name?.toFirstLower»s : get all the «element?.name?.toFirstLower»s.
			 *
			 * @param pageable the pagination information
			 * @return the ResponseEntity with status 200 (OK) and the list of «element?.name?.toFirstLower»s in body
			 * @throws URISyntaxException if there is an error to generate the pagination HTTP headers
			 */
			«IF 'spring' != 'spring'»
				@RequestMapping(value = '/«element?.name?.toFirstLower»s',
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
				@Timed
			«ELSE»
				@GET
				@Path('/«element?.name?.toFirstLower»s')
				@Produces(MediaType.APPLICATION_JSON)
			«ENDIF»
			public def ResponseEntity<List<«element?.name?.toFirstUpper»DTO>> getAll«element?.name?.toFirstUpper»s(Pageable pageable) throws URISyntaxException {
				log.debug('REST request to get a page of «element?.name?.toFirstUpper»s')
				
				val Page<«element?.name?.toFirstUpper»> page = «element?.name?.toFirstLower»Repository.findAll(pageable)
				val HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, '/api/«element?.name?.toFirstLower»s')
				
				new ResponseEntity<>(«element?.name?.toFirstLower»Mapper.«element?.name?.toFirstLower»sTo«element?.name?.toFirstUpper»DTOs(page.content), headers, HttpStatus.OK)
			}
		
			/**
			 * GET  /«element?.name?.toFirstLower»s/:id : get the 'id' «element?.name?.toFirstLower».
			 *
			 * @param id the id of the «element?.name?.toFirstLower»DTO to retrieve
			 * @return the ResponseEntity with status 200 (OK) and with body the «element?.name?.toFirstLower»DTO, or with status 404 (Not Found)
			 */
			«IF 'spring' != 'spring'»
				@RequestMapping(value = '/«element?.name?.toFirstLower»s/{id}',
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
				@Timed
			«ELSE»
				@GET
				@Path('/«element?.name?.toFirstLower»s/{id}')
				@Produces(MediaType.APPLICATION_JSON)
			«ENDIF»
			public def ResponseEntity<«element?.name?.toFirstUpper»DTO> get«element?.name?.toFirstUpper»(@PathVariable Long id) {
				log.debug('REST request to get «element?.name?.toFirstUpper» : {}', id);
				
				val «element?.name?.toFirstUpper» «element?.name?.toFirstLower» = «element?.name?.toFirstLower»Repository.findOne(id);
				val «element?.name?.toFirstUpper»DTO «element?.name?.toFirstLower»DTO = «element?.name?.toFirstLower»Mapper.«element?.name?.toFirstLower»To«element?.name?.toFirstUpper»DTO(«element?.name?.toFirstLower»)
				
				Optional.ofNullable(«element?.name?.toFirstLower»DTO)
					.map(result -> new ResponseEntity<>(
						result,
						HttpStatus.OK))
					.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND))
			}
		
			/**
			 * DELETE  /«element?.name?.toFirstLower»s/:id : delete the 'id' «element?.name?.toFirstLower».
			 *
			 * @param id the id of the «element?.name?.toFirstLower»DTO to delete
			 * @return the ResponseEntity with status 200 (OK)
			 */
			«IF 'spring' != 'spring'»
				@RequestMapping(value = '/«element?.name?.toFirstLower»s/{id}',
					method = RequestMethod.DELETE,
					produces = MediaType.APPLICATION_JSON_VALUE)
				@Timed
			«ELSE»
				@DELETE
				@Path('/«element?.name?.toFirstLower»s')
				@Produces(MediaType.APPLICATION_JSON)
			«ENDIF»
			public def ResponseEntity<Void> delete«element?.name?.toFirstUpper»(@PathVariable Long id) {
				log.debug('REST request to delete «element?.name?.toFirstUpper» : {}', id)
				«element?.name?.toFirstLower»Repository.delete(id)
				return ResponseEntity.ok.headers(HeaderUtil.createEntityDeletionAlert('«element?.name?.toFirstLower»', id.toString)).build
			}
		
		}
	'''
}
