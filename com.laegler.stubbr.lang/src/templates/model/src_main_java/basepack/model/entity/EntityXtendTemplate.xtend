package templates.model.src_main_java.basepack.model.entity

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.stubbrLang.Entity
import com.laegler.stubbr.lang.stubbrLang.Attribute
import templates.AbstractXtendTemplate
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * File template for entity model.
 */
class EntityXtendTemplate extends AbstractXtendTemplate {

	private Entity entity

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project, Entity entity) {
		super(stubbr, project)
		this.entity = entity
		fileName = '''«entity?.name?.toFirstUpper»'''
		relativPath = '''/src/main/java/«project?.basePackage?.toPath»/entity/'''
		header = '''package «project.basePackage».entity'''
		documentation = '''Entity model for «entity?.name?.toFirstUpper»'''

		content = withImports(template)
	}

	private def String getTemplate() '''
		«javaDocType»
		@«asImport('org.eclipse.xtend.lib.annotations.Accessors')»
		@«asImport('javax.persistence.Entity')»
		@«asImport('javax.persistence.Table')»(name = "«entity?.name?.toLowerUnderscore»")
		@«asImport('javax.xml.bind.annotation.XmlRootElement')»
		@«asImport('org.hibernate.annotations.Cache')»(usage = «asImport('org.hibernate.annotations.CacheConcurrencyStrategy')».NONSTRICT_READ_WRITE)
		@«asImport('javax.persistence.NamedQueries')»(#[
			@«asImport('javax.persistence.NamedQuery')»(name = '«entity?.name?.toFirstUpper».findAll', query = 'SELECT e FROM «entity?.name?.toLowerCase» e'),
			@«asImport('javax.persistence.NamedQuery')»(name = '«entity?.name?.toFirstUpper».findById', query = 'SELECT e FROM «entity?.name?.toLowerCase» e WHERE e.id = :id')
		])
		class «fileName» implements «asImport('java.io.Serializable')» {
			«IF !stubbr?.stubb?.persistence.customIds»
				
				/**
				 * ID / primary key of entity «entity?.name?.toFirstUpper»
				 */
				@«asImport('javax.persistence.Id')»
				@«asImport('javax.persistence.GeneratedValue')»(strategy = «asImport('javax.persistence.GenerationType')».AUTO)
				private «asImport(stubbr?.stubb?.persistence?.javaType?.getQualifiedName)» id
			«ENDIF»
			«FOR Attribute attribute : entity?.attributes»
				
				/**
				 * «attribute?.documentation»
				 */
				«IF attribute.primaryKey»
					@«asImport('javax.persistence.Id')»
					@«asImport('javax.persistence.GeneratedValue')»(strategy = «asImport('javax.persistence.GenerationType')».AUTO)
				«ENDIF»
				@«asImport('javax.persistence.Column')»(name='«attribute?.name?.toLowerUnderscore»')
				@«asImport('com.google.gson.annotations.Until')»(«project.version.toVersionDouble»)
				@«asImport('com.fasterxml.jackson.annotation.JsonProperty')»('«attribute?.name?.toFirstLower»')
				@«asImport('javax.xml.bind.annotation.XmlElement')»
				@«asImport('com.google.gson.annotations.Expose')»(serialize=true, deserialize=true)
				private «IF attribute?.javaType != null»«asImport(attribute?.javaType?.qualifiedName)»«ELSE»«asImport(project.basePackage + '.entity.' + attribute?.type?.name)»«ENDIF» «attribute?.name?.toFirstLower»
			«ENDFOR»
		
		}
	'''

}
