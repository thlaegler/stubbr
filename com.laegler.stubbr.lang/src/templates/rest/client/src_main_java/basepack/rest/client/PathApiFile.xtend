package templates.rest.client.src_main_java.basepack.rest.client

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.generator.template.XtendTemplateFile
import com.laegler.stubbr.lang.swagger.CustomPath
import io.swagger.models.Operation
import io.swagger.models.parameters.AbstractSerializableParameter
import io.swagger.models.parameters.BodyParameter
import io.swagger.models.parameters.Parameter
import io.swagger.models.parameters.RefParameter
import java.util.HashMap
import java.util.Map
import java.util.Map.Entry
import javax.inject.Inject
import com.laegler.stubbr.lang.generator.repository.ProjectType

class PathApiFile extends XtendTemplateFile<CustomPath> {

	@Inject extension StubbrRegistry

	override public String getDocumentation() '''The REST API for path «element?.name?.toFirstUpper»'''

	override public String getTemplateName() '''«this.class.name»'''
	
	override public ProjectType getProject() { ProjectType.REST_CLIENT }

	override public String getFileName() '''«element?.name?.replaceFirst('[^A-Za-z0-9]','').toFirstUpper»RestApi'''

	override public String getPath() '''«super.path»/src/main/java/«stubb?.packageName?.toPath»/rest/server/'''

	override public String getTemplate() '''
		package «stubb.packageName».rest.server
		
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
			«operations.put('get',element?.get)»
			«operations.put('post',element?.post)»
			«operations.put('put',element?.put)»
			«operations.put('delete',element?.delete)»
			
			«FOR Entry<String, Operation> operation: operations.entrySet»
				«IF operation?.value != null»
					@«operation?.key?.toUpperCase»
					«IF !operation?.value?.consumes.isNullOrEmpty»
						@Consumes(#[«FOR String consumes : operation?.value?.consumes»'«consumes»', «ENDFOR»'null/null'])
					«ENDIF»
					«IF !operation?.value?.produces.isNullOrEmpty»
						@Produces(#[«FOR String produces : operation?.value?.produces»'«produces»', «ENDFOR»'null/null'])
					«ENDIF»
					def Response «element?.name?.replaceFirst('[^A-Za-z0-9]','')?.toFirstLower»«operation?.key?.toFirstUpper»(«IF !element?.get?.parameters.nullOrEmpty»«FOR Parameter param : element?.get?.parameters»«IF param instanceof AbstractSerializableParameter»«(param as AbstractSerializableParameter)?.items?.type» «(param as AbstractSerializableParameter)?.items?.name»«ELSEIF param instanceof BodyParameter»«(param as BodyParameter)?.schema?.title» «(param as BodyParameter).schema?.title»«ELSEIF param instanceof RefParameter»«(param as RefParameter)?.simpleRef» «(param as RefParameter)?.simpleRef»«ENDIF», «ENDFOR»«ENDIF»SecurityContext securityContext) {
						Response.ok.build
					}
					
				«ENDIF»
			«ENDFOR»
		}
	'''
}
