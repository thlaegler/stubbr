package com.laegler.stubbr.lang.adapter

import com.laegler.stubbr.lang.genmodel.Project
import java.util.Map

interface StubbrAdapter<T> {

	public def T parse(String fileLocation)

	public def String generate(Project project, String fileLocation)

	public def String generate(Project project, String fileLocation, Map<String, Object> params)

}
