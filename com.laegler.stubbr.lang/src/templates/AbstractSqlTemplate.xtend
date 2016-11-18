package templates

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * Abstract super type for all SQL files.
 */
abstract class AbstractSqlTemplate extends AbstractTemplate {

	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		this.fileType = FileType.SQL
	}
	
	protected def String toSqlType(String type) {
		return 'varchar(255)'
	}

}
