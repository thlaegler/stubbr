package com.laegler.stubbr.lang.genmodel

import com.laegler.stubbr.lang.stubbrLang.Stubb
import org.eclipse.xtext.generator.IFileSystemAccess
import com.laegler.stubbr.lang.genmodel.Project
import java.util.List
import java.util.ArrayList

class StubbrRegistry {

	public static Stubb STUBB
	public static IFileSystemAccess FSA
	public static List<Project> PROJECTS = new ArrayList<Project>

	public static def void clean() {
		STUBB = null
		FSA = null
		PROJECTS = new ArrayList<Project>
	}

	def Stubb getStubb() {
		STUBB
	}

	def setStubb(Stubb stubb) {
		STUBB = stubb
	}

	def IFileSystemAccess getFsa() {
		FSA
	}

	def setFsa(IFileSystemAccess fsa) {
		FSA = fsa
	}

	def List<Project> getProjects() {
		PROJECTS
	}

	def setProjects(List<Project> projects) {
		PROJECTS = projects
	}

}
