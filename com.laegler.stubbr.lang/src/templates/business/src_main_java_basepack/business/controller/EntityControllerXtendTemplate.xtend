package templates.business.src_main_java_basepack.business.controller

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.stubbrLang.Attribute

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

		
	}

	override def String getTemplate() '''
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

			/**
			 *
			 */
			public def init() {
				val «asImport(stubbr?.stubb?.packageName + '.model.entity.' + entity?.name?.toFirstUpper)» «entity?.name?.toFirstLower» = «entity?.name?.toFirstLower»Service.findById(1)
				this.«entity?.name?.toFirstLower»BusinessObject = new «entity?.name?.toFirstUpper»BusinessObject(«entity?.name?.toFirstLower»)
			}
		
			/**
			 *
			 */
			public def «asImport(stubbr?.stubb?.packageName + '.business.object.' + entity?.name?.toFirstUpper + 'BusinessObject')» save(«asImport(stubbr?.stubb?.packageName + '.business.object.' + entity?.name?.toFirstUpper + 'BusinessObject')» «entity?.name?.toFirstLower»BusinessObject) {
				val «entity?.name?.toFirstUpper» «entity?.name?.toFirstLower» = businessObject2Model(«entity?.name?.toFirstLower»BusinessObject)
				val «entity?.name?.toFirstUpper» persisted«entity?.name?.toFirstUpper» = «entity?.name?.toFirstLower»Service.persist(«entity?.name?.toFirstLower»)
				model2BusinessObject(persisted«entity?.name?.toFirstUpper»)
			}
		
			/**
			 *
			 */
			public def void remove(«asImport(chapterPersistence.javaType?.getQualifiedName)» id) {
				«entity?.name?.toFirstLower»Service.remove(id)
			}
		
			/**
			 *
			 */
			public def «asImport(stubbr?.stubb?.packageName + '.business.object.' + entity?.name?.toFirstUpper + 'BusinessObject')» findById(«asImport(chapterPersistence.javaType?.getQualifiedName)» id) {
				val «entity?.name?.toFirstUpper» «entity?.name?.toFirstUpper» = «entity?.name?.toFirstLower»Service.findById(id)
				model2BusinessObject(«entity?.name?.toFirstUpper»)
			}
		
			/**
			 *
			 */
			private def «entity?.name?.toFirstUpper» businessObject2Model(«asImport(stubbr?.stubb?.packageName + '.business.object.' + entity?.name?.toFirstUpper + 'BusinessObject')» «entity?.name?.toFirstLower»BusinessObject) {
				val «entity?.name?.toFirstUpper» «entity?.name?.toFirstLower» = new «entity?.name?.toFirstUpper»()
				«FOR Attribute attribute : entity?.attributes»
					«entity?.name?.toFirstLower».«attribute?.name?.toFirstLower» = «entity?.name?.toFirstLower»BusinessObject.«attribute?.name?.toFirstLower»
				«ENDFOR»
				return «entity?.name?.toFirstLower»
			}

			/**
			 *
			 */
			private def «asImport(stubbr?.stubb?.packageName + '.business.object.' + entity?.name?.toFirstUpper + 'BusinessObject')» model2BusinessObject(«asImport(stubbr?.stubb?.packageName + '.model.entity.' + entity?.name?.toFirstUpper)» «entity?.name?.toFirstLower») {
				val «entity?.name?.toFirstUpper»BusinessObject «entity?.name?.toFirstLower»BusinessObject = new «entity?.name?.toFirstUpper»BusinessObject()
				«FOR Attribute attribute : entity?.attributes»
					«entity?.name?.toFirstLower»BusinessObject.«attribute?.name?.toFirstLower» = «entity?.name?.toFirstLower».«attribute?.name?.toFirstLower»
				«ENDFOR»
				return «entity?.name?.toFirstLower»BusinessObject
			}
		
		}
	'''

}
