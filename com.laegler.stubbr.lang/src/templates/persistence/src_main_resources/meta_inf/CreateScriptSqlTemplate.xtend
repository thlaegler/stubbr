package templates.persistence.src_main_resources.meta_inf

import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.stubbrLang.Attribute
import com.laegler.stubbr.lang.stubbrLang.Entity
import templates.AbstractSqlTemplate

/**
 * File template for SQL create-script.
 */
class CreateScriptSqlTemplate extends AbstractSqlTemplate {

	/**
	 * 
	 */
	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		fileName = 'create'
		relativPath = '''/src/main/resources/META_INF/'''
		documentation = 'SQL create-script'

		
	}

	override def String getTemplate() '''
		CREATE USER '«stubbr?.stubb?.name»'@'%' IDENTIFIED BY '***';
		
		GRANT USAGE ON * . * TO '«stubbr?.stubb?.name»'@'%' IDENTIFIED BY '***' WITH MAX_QUERIES_PER_HOUR 0 MAX_CONNECTIONS_PER_HOUR 0 MAX_UPDATES_PER_HOUR 0 MAX_USER_CONNECTIONS 0 ;
		
		CREATE DATABASE IF NOT EXISTS `«stubbr?.stubb?.name»` ;
		
		GRANT ALL PRIVILEGES ON `«stubbr?.stubb?.name»` . * TO 'citysquire'@'%';
		
		GRANT ALL PRIVILEGES ON `«stubbr?.stubb?.name»\_%` . * TO 'citysquire'@'%';
		
		«FOR Entity entity : stubbr?.stubb?.persistence?.entities»
			CREATE TABLE IF NOT EXISTS «entity?.name?.toLowerCase» (
				«FOR Attribute attribute : entity?.attributes»
					«attribute?.name» «attribute?.javaType?.qualifiedName?.toSqlType» not null,
				«ENDFOR»
				primary key (activity_id)
			) ENGINE=InnoDB;
			
		«ENDFOR»
	'''

}
