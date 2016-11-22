package templates.rest.server.src_main_java.basepack.rest

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import io.swagger.models.Operation
import io.swagger.models.Swagger
import java.util.HashMap
import java.util.Map
import java.util.Map.Entry
import templates.AbstractXtendTemplate

/**
 * File template for REST endpoint for path.
 */
class EntityEndpointResourceXtendTemplate extends AbstractXtendTemplate {

	private Swagger swagger

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Swagger swagger) {
		super(stubbr, project)
		this.swagger = swagger
		fileName = '''«swagger?.info?.title?.replaceFirst('[^A-Za-z0-9]','').toFirstUpper»RestEndpoint'''
		header = '''package «project.basePackage».resource'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/rest/server/'''
		documentation = '''REST endpoint for path «swagger?.info?.title?.toFirstUpper».'''

		
	}

	override def String getTemplate() '''
		import «project.basePackage».*
		
		import javax.ws.rs.GET
		import javax.ws.rs.POST
		import javax.ws.rs.PUT
		import javax.ws.rs.DELETE
		import javax.ws.rs.Consumes
		import javax.ws.rs.core.Response
		import javax.ws.rs.Produces
		import javax.ws.rs.core.SecurityContext
		
		«javaDocType»
		public class «fileName» {
			
			«val Map<String, Operation> operations = new HashMap<String, Operation>»
«««			«operations.put('get',swagger?.get)»
«««			«operations.put('post',swagger?.post)»
«««			«operations.put('put',swagger?.put)»
«««			«operations.put('delete',swagger?.delete)»
			
			«FOR Entry<String, Operation> operation: operations.entrySet»
				«IF operation?.value != null»
					@«operation?.key?.toUpperCase»
					«IF !operation?.value?.consumes.isNullOrEmpty»
						@Consumes(#[«FOR String consumes : operation?.value?.consumes»'«consumes»', «ENDFOR»'null/null'])
					«ENDIF»
					«IF !operation?.value?.produces.isNullOrEmpty»
						@Produces(#[«FOR String produces : operation?.value?.produces»'«produces»', «ENDFOR»'null/null'])
					«ENDIF»
«««					def Response «swagger?.info.title?.replaceFirst('[^A-Za-z0-9]','')?.toFirstLower»«operation?.key?.toFirstUpper»(«IF !swagger?.get?.parameters.nullOrEmpty»«FOR Parameter param : swagger?.info.title»«IF param instanceof AbstractSerializableParameter»«(param as AbstractSerializableParameter)?.items?.type» «(param as AbstractSerializableParameter)?.items?.name»«ELSEIF param instanceof BodyParameter»«(param as BodyParameter)?.schema?.title» «(param as BodyParameter).schema?.title»«ELSEIF param instanceof RefParameter»«(param as RefParameter)?.simpleRef» «(param as RefParameter)?.simpleRef»«ENDIF», «ENDFOR»«ENDIF»SecurityContext securityContext) {
						Response.ok.build
					}
					
				«ENDIF»
			«ENDFOR»
		}
	'''
}
