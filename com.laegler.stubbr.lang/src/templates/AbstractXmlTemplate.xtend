package templates

import com.laegler.stubbr.lang.genmodel.FileType
import com.laegler.stubbr.lang.genmodel.Project
import com.laegler.stubbr.lang.genmodel.StubbrRegistry

/**
 * Abstract super type for all XML files.
 */
abstract class AbstractXmlTemplate extends AbstractTemplate {

	new(StubbrRegistry stubbr, Project project) {
		super(stubbr, project)
		this.fileType = FileType.XML
	}

}
