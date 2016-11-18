package com.laegler.stubbr.lang.generator

import com.laegler.stubbr.lang.genmodel.StubbrRegistry
import com.laegler.stubbr.lang.genmodel.Project
import java.util.logging.Logger
import javax.inject.Inject
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Collection

/**
 * Abstract project generator.
 */
abstract class AbstractProjectGenerator {
	
	@Inject protected Logger log
	@Inject protected StubbrRegistry stubbr

	@Accessors
	private Project project
	
	abstract public def Project prepare()

	protected def boolean isNullOrEmpty2(Object object) {
		if(object instanceof Collection<?>) {
			return object != null && !object.empty
		}
		if(object instanceof String) {
			return object != null && !object.empty
		}
		return object != null
	}

}
