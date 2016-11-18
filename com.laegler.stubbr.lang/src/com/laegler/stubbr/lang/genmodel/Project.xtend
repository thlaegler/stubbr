package com.laegler.stubbr.lang.genmodel

import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import templates.AbstractTemplate

/**
 * 
 */
class Project {

//	@Inject
	@Accessors StubbrRegistry stubbr

	@Accessors String name
	@Accessors String basePackage
	@Accessors String relativePath
	@Accessors String version
	@Accessors List<String> dependencies
	@Accessors List<AbstractTemplate> files
	@Accessors ProjectType projectType
	@Accessors String canonicalName
	@Accessors String documentation

	new(StubbrRegistry stubbr) {
		super()
		this.stubbr = stubbr
		name = 'undefined-project'
		relativePath = '''undefined/«name»'''
		version = stubbr?.stubb?.version?.replaceFirst('v', '')
		dependencies = new ArrayList<String>
		files = new ArrayList<AbstractTemplate>
		projectType = ProjectType.UNDEFINED
		canonicalName = 'Undefined project'
		documentation = 'This is an undefined project (Generator is not implemented yet)'
	}

	public def String getPackaging() {
		projectType.packaging
	}

}
