package templates.persistence.src_main_java.basepack.persistence.spring.mapper

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import com.laegler.stubbr.lang.stubbrLang.Attribute
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for SpringMVC-based DTO-mapper for managing entity.
 */
class EntitySpringMapperXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»SpringMapper'''
		header = '''package «project.basePackage».spring.mapper'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/spring/mapper/'''
		documentation = '''SpringMVC-based DTO-mapper for managing entity «entity?.name?.toFirstUpper»'''

		
	}

	override def String getTemplate() '''
		import «project.basePackage».*
		import «stubbr?.stubb?.packageName».model.entity.*
		import «stubbr?.stubb?.packageName».persistence.dto.«entity?.name?.toFirstUpper»Dto
		
		import org.mapstruct.*
		import java.util.List
		
		«javaDocType»
		@Mapper(componentModel = 'spring', uses = {})
		public interface «fileName» {
		
			«FOR Attribute attribute : entity?.attributes»
				@Mapping(source = 'department.id', target = 'departmentId')
				@Mapping(source = 'manager.id', target = 'managerId')
			«ENDFOR»
			«entity?.name?.toFirstUpper»SpringDto «entity?.name?.toFirstLower»To«entity?.name?.toFirstUpper»Dto(«entity?.name?.toFirstUpper» «entity?.name?.toFirstLower»)
		
			public def List<«entity?.name?.toFirstUpper»Dto> «entity?.name?.toFirstLower»sTo«entity?.name?.toFirstUpper»Dtos(List<«entity?.name?.toFirstUpper»> «entity?.name?.toFirstLower»s)
		
			«FOR Attribute attribute : entity?.attributes»
				@Mapping(source = 'departmentId', target = 'department')
				@Mapping(target = 'jobs', ignore = true)
				@Mapping(source = 'managerId', target = 'manager')
			«ENDFOR»
			public def «entity?.name?.toFirstUpper» «entity?.name?.toFirstLower»DtoTo«entity?.name?.toFirstUpper»(«entity?.name?.toFirstUpper»Dto «entity?.name?.toFirstLower»Dto)
		
			public def List<«entity?.name?.toFirstUpper»> «entity?.name?.toFirstLower»DtosTo«entity?.name?.toFirstUpper»s(List<«entity?.name?.toFirstUpper»Dto> «entity?.name?.toFirstLower»Dtos)
		
			//default Department departmentFromId(Long _id) {
			//	new Department => [id = _id]
			//}
		
			default «entity?.name?.toFirstUpper» «entity?.name?.toFirstLower»FromId(Long _id) {
				new «entity?.name?.toFirstUpper» => [id = _id]
			}
		}
	'''

}
