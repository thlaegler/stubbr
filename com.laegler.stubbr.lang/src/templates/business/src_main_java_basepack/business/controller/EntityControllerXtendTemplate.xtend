package templates.business.src_main_java_basepack.business.controller

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate

/**
 * File template for controller for entity.
 */
class EntityControllerXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»Controller'''
		header = '''package «project.basePackage».controller'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/controller/'''
		documentation = '''Controller for entity «entity?.name?.toFirstUpper»'''

		content = withImports(template)
	}

	private def String getTemplate() '''
		import «project.basePackage».*
		import java.io.Serializable
		import javax.persistence.Column
		import javax.persistence.Entity
		import javax.persistence.Table
		import javax.xml.bind.annotation.XmlElement
		import javax.xml.bind.annotation.XmlRootElement
		import org.eclipse.xtend.lib.annotations.Accessors
		import com.google.gson.annotations.Expose
		
		import org.example.stubbr.persistence.service.BarService
		import org.example.stubbr.business.object.BarBusinessObject
		import javax.inject.Inject
		import org.example.stubbr.model.entity.Bar
		
		«javaDocType»
		@«asImport('javax.ejb.Stateless')»
		class «fileName» extends AbstractController {

			@«asImport('javax.inject.Inject')»
			private «asImport(stubbr?.stubb?.packageName + '.persistence.service.' + entity?.name?.toFirstUpper + 'Service')» «entity?.name?.toFirstLower»Service
			
			private «asImport(stubbr?.stubb?.packageName + '.business.object.' + entity?.name?.toFirstUpper + 'BusinessObject')» «entity?.name?.toFirstLower»BusinessObject
			
			public def init() {
				val «asImport(stubbr?.stubb?.packageName + '.model.entity.' + entity?.name?.toFirstUpper)» «entity?.name?.toFirstLower» = «entity?.name?.toFirstLower»Service.findById(1)
				this.«entity?.name?.toFirstLower»BusinessObject = new «entity?.name?.toFirstUpper»BusinessObject(«entity?.name?.toFirstLower»)
			}
		
		}
	'''

}
